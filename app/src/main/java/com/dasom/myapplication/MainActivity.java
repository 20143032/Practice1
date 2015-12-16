package com.dasom.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btOk;
    Button btNext;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        btOk = (Button) findViewById(R.id.bt_ok);
        btOk.setText("okok");
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "hihih",Toast.LENGTH_SHORT).show();
                TextView tv = (TextView) findViewById(R.id.tv_1);
                tv.setText("hihihihihi");
            }
        });



        btNext = (Button) findViewById(R.id.bt_next);
        btNext.setText("nextActiviy");
        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(mContext, Main2Activity.class);
                in.putExtra("name", "kim");
                startActivity(in);
            }
        });


    }
}
