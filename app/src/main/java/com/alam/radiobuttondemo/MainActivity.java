package com.alam.radiobuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToOtherActivity(View view) {

        Intent k = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(k);
    }
    public void radioButton1(View view) {

        boolean checked (radioButton).view.;
    }
}
