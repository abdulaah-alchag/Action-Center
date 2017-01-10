package com.example.abdallah.finalassignment;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText)findViewById(R.id.editText);

        Button btnGo = (Button)findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText.getText().toString().isEmpty()) {
                    Toast.makeText(Main.this,"Welcome " + editText.getText().toString(),Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Main.this, Extra.class));
                }else
                    Toast.makeText(Main.this,"Please enter your name",Toast.LENGTH_SHORT).show();

            }
        });

    }


}
