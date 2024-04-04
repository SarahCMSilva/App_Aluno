package com.sarah.christina;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button buttonMedia;
    private Button buttonIdade;
    private Button buttonEmbaralhar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         buttonMedia = findViewById(R.id.buttonMedia);
         buttonIdade = findViewById(R.id.buttonIdade);
         buttonEmbaralhar = findViewById(R.id.buttonNome);

         buttonMedia.setOnClickListener(this);
         buttonIdade.setOnClickListener(this);
         buttonEmbaralhar.setOnClickListener(this);


    };

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonMedia){
            Intent intent = new Intent(MainActivity.this, MainActivityMedia.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.buttonIdade){
            Intent intent = new Intent(MainActivity.this, MainActivityIdade.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.buttonNome){
            Intent intent = new Intent(MainActivity.this, MainActivitySorteio.class);
            startActivity(intent);

        }
    }


}

