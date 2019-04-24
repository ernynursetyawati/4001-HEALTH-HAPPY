package com.example.healthhappy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.healthhappy.Program.ProgramKeto;

public class DietKeto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_keto);
    }

    public void intentKeto(View view) {
        Intent intent = new Intent(DietKeto.this, ProgramKeto.class);
        startActivity(intent);
    }
}
