package com.sarah.christina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityIdade extends AppCompatActivity {
    private Button buttonCalcularIdade;
    private Button buttonApagar3;
    private EditText editTextAno;
    private EditText editTextNascimento;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_idade);

            editTextAno = findViewById(R.id.editTextAno);
            editTextNascimento = findViewById(R.id.editTextNascimento);
            buttonCalcularIdade = findViewById(R.id.buttonCalcularIdade);
            buttonApagar3 = findViewById(R.id.buttonApagar3);

            buttonCalcularIdade.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Ano = editTextAno.getText().toString();
                    String Nascimento = editTextNascimento.getText().toString();

                    double ano = Double.parseDouble(Ano);
                    double nascimento = Double.parseDouble(Nascimento);

                    double idade = (ano - nascimento);

                    Toast.makeText(MainActivityIdade.this, "Sua idade é: " + idade, Toast.LENGTH_SHORT).show();
                }
            });
            buttonApagar3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    limparCampo();
                }
            });
        }

    private void limparCampo() {
        editTextAno.setText("");
        editTextNascimento.setText("");
    }
    }

