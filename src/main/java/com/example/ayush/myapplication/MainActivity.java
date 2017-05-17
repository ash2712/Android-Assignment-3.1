package com.example.ayush.myapplication;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.tv_violet);
        TextView tv2 = (TextView) findViewById(R.id.tv_indigo);
        TextView tv3 = (TextView) findViewById(R.id.tv_blue);
        TextView tv4 = (TextView) findViewById(R.id.tv_green);
        TextView tv5 = (TextView) findViewById(R.id.tv_yellow);
        TextView tv6 = (TextView) findViewById(R.id.tv_orange);
        TextView tv7 = (TextView) findViewById(R.id.tv_red);

        Resources res =getResources();
        int violet = res.getColor(R.color.Violet);//Assigns every colour to a variable
        int indigo = res.getColor(R.color.Indigo);
        int blue = res.getColor(R.color.Blue);
        int green = res.getColor(R.color.Green);
        int yellow = res.getColor(R.color.Yellow);
        int orange = res.getColor(R.color.Orange);
        int red = res.getColor(R.color.Red);

        tv1.setBackgroundColor(violet);//calls the colour
        tv2.setBackgroundColor(indigo);
        tv3.setBackgroundColor(blue);
        tv4.setBackgroundColor(green);
        tv5.setBackgroundColor(yellow);
        tv6.setBackgroundColor(orange);
        tv7.setBackgroundColor(red);
    }
}
