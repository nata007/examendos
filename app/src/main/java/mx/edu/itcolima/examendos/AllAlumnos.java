package mx.edu.itcolima.examendos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class AllAlumnos extends AppCompatActivity {

    TextView nombre,num_control,telefono,direccion,id,email;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_alumnos);
        id=(EditText)findViewById(R.id.id);
        nombre=(EditText)findViewById(R.id.nombre);
        email=(EditText)findViewById(R.id.email);
        num_control=(EditText)findViewById(R.id.num_control);
        telefono=(EditText)findViewById(R.id.telefono);
        direccion=(EditText)findViewById(R.id.direccion);

        Retrofit retrofit=new Retrofit.Builder()
                                      .baseUrl("http://192.168.76.227/examenn/index.php/welcome/")
                                      .addConverterFactory(GsonConverterFactory.create())
                                      .build();

        ServicionInterfase servicio=retrofit.create(ServicionInterfase.class);

        Call<AlumnoList> call=servicio.consultar();
        call.enqueue(new Callback<AlumnoList>() {
            @Override
            public void onResponse(Response<AlumnoList> response, Retrofit retrofit) {
                AlumnoList alumnoList = response.body();
                List<Alumno> listaalumno=alumnoList.getAlumno();

                List alumnoadapter=new ArrayList();

                for (int i=0; i<listaalumno.size(); i++) {
                    alumnoadapter.add(new Alumno(listaalumno.get(i).getId(),
                                                 listaalumno.get(i).getNombre(),
                                                 listaalumno.get(i).getEmail(),
                                                 listaalumno.get(i).getNumeroControl(),
                                                 listaalumno.get(i).getTelefono(),
                                                 listaalumno.get(i).getDireccion()));

                }
                    recyclerView = (RecyclerView) findViewById(R.id.reciclado);
                    recyclerView.setHasFixedSize(true);
                    layoutManager = new LinearLayoutManager(AllAlumnos.this);
                    recyclerView.setLayoutManager(layoutManager);
                    adapter=new AlumnoAdapter(alumnoadapter);
                    recyclerView.setAdapter(adapter);


            }

            @Override
            public void onFailure(Throwable t) {

                Toast.makeText(AllAlumnos.this, "error:"+t.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
