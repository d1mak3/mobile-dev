package ru.mirea.kuimovda.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import ru.mirea.kuimovda.lesson4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Button btn;
    //TextView textView;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.editTextMirea.setText("Мой номер по списку №11");
        binding.buttonMirea.setOnClickListener((View.OnClickListener) v -> Log.d(MainActivity.class.getSimpleName(), "onClickListener"));
    }

}