package ru.mirea.kuimovda.Lesson2;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.FileUtils;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

@SuppressLint("NewApi")
public class MyProgressDialogFragment extends DialogFragment implements FileUtils.ProgressListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setButton(Dialog.BUTTON_POSITIVE, "Ok", (dialog, which) -> Log.i("Positive button clicked", ""));
        return progressDialog;
    }

    @Override
    public void onProgress(long l) {
        Log.i("Progress has been made", "");
    }
}