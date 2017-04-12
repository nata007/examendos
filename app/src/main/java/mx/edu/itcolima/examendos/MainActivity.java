package mx.edu.itcolima.examendos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrar (View view){
        Intent intent=new Intent(MainActivity.this, RegistrarAlumno.class);
        startActivity(intent);
    }

    public void listas (View view){
        Intent intent=new Intent(MainActivity.this,AllAlumnos.class);
        startActivity(intent);
    }

}
