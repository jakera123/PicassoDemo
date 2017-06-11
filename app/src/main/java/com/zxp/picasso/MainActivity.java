package com.zxp.picasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_picasso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_picasso=(ImageView)findViewById(R.id.iv_picasso);
        Picasso.with(this).load("http://avatar.csdn.net/2/1/B/1_u013278099.jpg").into(iv_picasso);


    }
}
