package com.sarah.christina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityMedia extends AppCompatActivity {
    private Button buttonCalcularMedia;
    private Button buttonApagar2;
    private EditText editTextNota1;
    private EditText editTextNota2;
    private double media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_media);

        buttonCalcularMedia = findViewById(R.id.buttonCalcularMedia);
        buttonApagar2 = findViewById(R.id.buttonApagar2);
        editTextNota1 = findViewById(R.id.editTextNota1);
        editTextNota2 = findViewById(R.id.editTextNota2);

        buttonCalcularMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Nota1 = editTextNota1.getText().toString();
                String Nota2 = editTextNota2.getText().toString();
                double nota1 = Double.parseDouble(Nota1);
                double nota2 = Double.parseDouble(Nota2);
                double media = (nota1 + nota2) / 2;
                Toast.makeText(MainActivityMedia.this, "Sua média é: " + media, Toast.LENGTH_SHORT).show();

            }
        });

        buttonApagar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limparCampo();
            }
        });
    }

    private void limparCampo() {
        editTextNota1.setText("");
        editTextNota2.setText("");
    }
}
