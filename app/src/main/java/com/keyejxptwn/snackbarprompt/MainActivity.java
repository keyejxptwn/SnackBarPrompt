package com.keyejxptwn.snackbarprompt;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.keyejxptwn.snackpromptlibrary.TSnackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ConstraintLayout constraintLayout;
    private TextView textViewTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.cl_root);
        textViewTest = findViewById(R.id.tv_test);
        textViewTest.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TSnackbar.make(constraintLayout, "错误提示", TSnackbar.LENGTH_SHORT, TSnackbar.APPEAR_FROM_TOP_TO_DOWN)
                .setBackgroundColor(Color.RED)
                .setTextGravity(Gravity.CENTER)
                .setTextFontSizeDip(20f)
                .show();

    }

}
