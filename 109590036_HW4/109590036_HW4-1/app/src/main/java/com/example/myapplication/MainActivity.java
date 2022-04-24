package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView num;
    public int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = findViewById(R.id.num);

        if (savedInstanceState != null) {

            boolean isVisible =
                    savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {
                num.setText(savedInstanceState.getString("reply_text"));
                num.setVisibility(View.VISIBLE);
                sum = Integer.valueOf(savedInstanceState.getString("reply_text"));
            }
        }
    }


    public void onClick(View view){
        sum += 1;
        if (num != null)
            num.setText(Integer.toString(sum));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("reply_visible", true);
        outState.putString("reply_text",num.getText().toString());
    }
}