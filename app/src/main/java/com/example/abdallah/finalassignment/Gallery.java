package com.example.abdallah.finalassignment;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Gallery extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);


        final ImageView image1 =(ImageView)findViewById(R.id.image1);
        final TextView textView1 =(TextView)findViewById(R.id.textView1);

        final int[] photos={R.drawable.rock, R.drawable.festival,R.drawable.monophone,R.drawable.arabian,
                R.drawable.global,R.drawable.award};



        image1.setOnClickListener(new View.OnClickListener(){
            int  x;
            @Override
            public void onClick(View v){

                x=x+1;

                if(x==6){x=0;}


                image1.setImageResource(photos[x]);


            }

        });

    }

}

