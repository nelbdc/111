package com.cupido.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void btn_guardar(View view){
       /* Button button = (Button) findViewById(R.id.Guardar);
        button.setOnClickListener.new View.OnClickListener(){*/
            Intent guardar = new Intent(this , MainActivity.class);
            startActivity(guardar);

        }
    }

