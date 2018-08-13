package com.mbrain.mbrainvalidator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DashBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(DashBoard.this, MainActivity.class);
                myIntent.putExtra("TYPE", 1);
                DashBoard.this.startActivity(myIntent);

            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(DashBoard.this, MainActivity.class);
                myIntent.putExtra("TYPE", 2);
                DashBoard.this.startActivity(myIntent);

            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(DashBoard.this, MainActivity.class);
                myIntent.putExtra("TYPE", 3);
                DashBoard.this.startActivity(myIntent);

            }
        });
    }
}
