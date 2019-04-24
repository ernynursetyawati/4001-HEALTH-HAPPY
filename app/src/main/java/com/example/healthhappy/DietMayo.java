package com.example.healthhappy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.healthhappy.Program.ProgramMayo;

public class DietMayo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_mayo);
    }

    public void intentMayo(View view) {
        Intent intent = new Intent(DietMayo.this, ProgramMayo.class);
        startActivity(intent);
    }
}
