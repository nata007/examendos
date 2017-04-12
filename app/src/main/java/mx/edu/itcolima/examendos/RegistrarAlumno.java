package mx.edu.itcolima.examendos;

import android.content.Intent;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class RegistrarAlumno extends AppCompatActivity {

    EditText nombre_reg,email_reg,num_control_reg,telefono_reg,direccion_reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_alumno);
        nombre_reg=(EditText)findViewById(R.id.nombre_reg);
        email_reg=(EditText)findViewById(R.id.email_reg);
        num_control_reg=(EditText)findViewById(R.id.num_contol_reg);
        telefono_reg=(EditText)findViewById(R.id.telefono_reg);
        direccion_reg=(EditText)findViewById(R.id.direccion_reg);
    }




    public void registrar (View view){
        String nombre,email,num_control,telefono,direccion;

        nombre=nombre_reg.getText().toString();
        email=email_reg.getText().toString();
        num_control=num_control_reg.getText().toString();
        telefono=telefono_reg.getText().toString();
        direccion=direccion_reg.getText().toString();

        Retrofit retrofit=new Retrofit.Builder()
                        .baseUrl("http://192.168.76.227/examenn/index.php/welcome/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

        ServicionInterfase servicio = retrofit.create(ServicionInterfase.class);
        Call<AlumnoList> call=servicio.insertar(nombre,email,num_control,telefono,direccion);
        call.enqueue(new Callback<AlumnoList>() {
            @Override
            public void onResponse(Response<AlumnoList> response, Retrofit retrofit) {




                startActivity(new Intent(RegistrarAlumno.this, AllAlumnos.class));
            }

            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(RegistrarAlumno.this, "error: "+t.toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }


}
