package ru.mirea.kuimovda.lesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;


import ru.mirea.kuimovda.lesson5.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ru.mirea.kuimovda.lesson5.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.camera.setBackgroundColor(Color.YELLOW);
        binding.audiorecord.setBackgroundColor(Color.YELLOW);
        binding.accelerometer.setBackgroundColor(Color.YELLOW);

        binding.camera.setOnClickListener((View.OnClickListener) v -> {
            Intent intent = new Intent(MainActivity.this, Camera.class);
            startActivity(intent);
            });

        binding.audiorecord.setOnClickListener((View.OnClickListener) v -> {
            Intent intent = new Intent(MainActivity.this, Audiorecord.class);
            startActivity(intent);
        });

        binding.accelerometer.setOnClickListener((View.OnClickListener) v -> {
            Intent intent = new Intent(MainActivity.this, Accelerometer.class);
            startActivity(intent);
        });


    }
}