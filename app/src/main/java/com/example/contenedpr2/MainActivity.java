package com.example.contenedpr2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        String[] datos = new String[]{"PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO", "SEPTIMO", "OCTAVO", "NOVENO", "DECIMO"};
        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, datos);

        AutoCompleteTextView textView=
                findViewById(R.id.actvlistacursos);
        textView.setAdapter(adapter);
        String[] datoslista = new String[]{"BANCHON CAROLAY", "CEDEÑO NOHELIA", "CADME GUSTAVO", "RIZO NATHALI", "MIRANDA MAYERLI", "CHAVEZ DAIRA", "COBEÑA BRITHANI", "CONSUEGRA SEBASTIAN", "ARTEAGA JAHELY", "CEDEÑO SHANIC"};
        ArrayAdapter<String> adaptador2 = new
                ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, datoslista);
        ListView lestOpciones = findViewById(R.id.LISTACURSO);
        lestOpciones.setAdapter(adaptador2);
    }
}