package com.sarah.christina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivitySorteio extends AppCompatActivity {
    private Button buttonEmbaralhar1;
    private EditText editTextFrase;
    private EditText editTextEmbaralhado;
    private Button buttonApagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sorteio);

        editTextFrase = findViewById(R.id.editTextFrase);
        editTextEmbaralhado = findViewById(R.id.editTextEmbaralhado);
        buttonEmbaralhar1 = findViewById(R.id.buttonEmbaralhar1);
        buttonApagar = findViewById(R.id.buttonApagar);


        buttonEmbaralhar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        embaralharFrase();
                    }
                });
        buttonApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limparCampo();
            }
        });

            }


    private void embaralharFrase() {

        String fraseOriginal = editTextFrase.getText().toString();
        String fraseEmbaralhada = embaralharString(fraseOriginal);
        editTextEmbaralhado.setText(fraseEmbaralhada);
    }

    private String embaralharString(String input) {

        List<Character> caracteres = new ArrayList<>();
        for (char c : input.toCharArray()) {
            caracteres.add(c);
        }

        Collections.shuffle(caracteres);

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : caracteres) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
    private void limparCampo() {
        editTextFrase.setText("");
        editTextEmbaralhado.setText("");
    }

}



