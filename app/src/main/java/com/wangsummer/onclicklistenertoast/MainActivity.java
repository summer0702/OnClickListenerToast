package com.wangsummer.onclicklistenertoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1= findViewById(R.id.textview1);
        tv2= findViewById(R.id.textview2);
        tv3= findViewById(R.id.textview3);
        tv4= findViewById(R.id.texview4);


    }
}
