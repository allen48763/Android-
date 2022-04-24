package com.example.android.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        count = (TextView) findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        String key = bundle.getString("text");
        count.setText(key);
    }
}