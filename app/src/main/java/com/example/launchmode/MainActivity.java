package com.example.launchmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onStandard(View v) {
        startActivity(new Intent(this, StandardActivity.class));
    }

    public void onSingleTop(View v) {
        startActivity(new Intent(this, SingleTopActivity.class));
    }

    public void onSingleTask(View v) {
        startActivity(new Intent(this, SingleTaskActivity.class));
    }

    public void onSingleInstance(View v) {
        startActivity(new Intent(this, SingleInstanceActivity.class));
    }
    
}