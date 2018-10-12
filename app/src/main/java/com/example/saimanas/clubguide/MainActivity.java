package com.example.saimanas.clubguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button eca,rob,art,ieee,tv;
Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        eca=findViewById(R.id.button);
        rob=findViewById(R.id.button2);
        art=findViewById(R.id.button5);
        ieee=findViewById(R.id.button4);
        tv=findViewById(R.id.button3);

        rob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            it=new Intent(MainActivity.this,robotics.class);
            startActivity(it);
            }
        });
    }
}
