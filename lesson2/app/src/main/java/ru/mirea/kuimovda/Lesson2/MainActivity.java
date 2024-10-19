package ru.mirea.kuimovda.Lesson2;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowTimeDialog(View view) {
        MyTimeDialogFragment dialogFragment = new MyTimeDialogFragment();

        final String TimeDialogTag = "TimeDialog";
        dialogFragment.show(getSupportFragmentManager(), TimeDialogTag);
    }

    public void onClickShowDateDialog(View view) {
        MyDateDialogFragment dialogFragment = new MyDateDialogFragment();

        final String DateDialogTag = "DateDialog";
        dialogFragment.show(getSupportFragmentManager(), DateDialogTag);
    }

    public void onClickShowProgressDialog(View view) {
        MyProgressDialogFragment dialogFragment = new MyProgressDialogFragment();

        final String ProgressDialogTag = "ProgressDialog";
        dialogFragment.show(getSupportFragmentManager(), ProgressDialogTag);
    }
}