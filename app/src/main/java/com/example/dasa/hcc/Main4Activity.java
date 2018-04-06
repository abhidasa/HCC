package com.example.dasa.hcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

   //Button login;
    //Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

      //  login = (Button) findViewById(R.id.button2);
      //  register = (Button) findViewById(R.id.button3);
    }
    public void loginPage(View v){

        Intent i = new Intent(Main4Activity.this, Main2Activity.class);
        startActivity(i);

    }
    public void registerPage(View v){

        Intent i = new Intent(Main4Activity.this, Main5Activity.class);
        startActivity(i);

    }

}
