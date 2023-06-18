package com.example.ejercicio1_21p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    private TextView nom, apell, edadd, correoele;
    private Button Regresar;

    public ResultadoActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        nom = findViewById(R.id.Mnombre);
        apell = findViewById(R.id.Mapellido);
        edadd = findViewById(R.id.Medad);
        correoele = findViewById(R.id.Mcorreo);
        Regresar= findViewById(R.id.btnatras);

        Intent intent = getIntent();
        String names = intent.getStringExtra("names");
        String lastNames = intent.getStringExtra("lastNames");
        int age = intent.getIntExtra("age", 0);
        String email = intent.getStringExtra("email");

        nom.setText(""+ names);
        apell.setText(""+lastNames);
        edadd.setText(""+age);
        correoele.setText(""+email);

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultadoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
