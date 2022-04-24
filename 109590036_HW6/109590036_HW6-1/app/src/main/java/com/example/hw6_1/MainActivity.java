package com.example.hw6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] a2 = new String[5];
    boolean[] sw = new boolean[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox c  = findViewById(R.id.checkBox );
        CheckBox c2 = findViewById(R.id.checkBox2);
        CheckBox c3 = findViewById(R.id.checkBox3);
        CheckBox c4 = findViewById(R.id.checkBox4);
        CheckBox c5 = findViewById(R.id.checkBox5);

        a2[0] = "\n"+(String) c.getText();
        a2[1] = "\n"+(String) c2.getText();
        a2[2] = "\n"+(String) c3.getText();
        a2[3] = "\n"+(String) c4.getText();
        a2[4] = "\n"+(String) c5.getText();

        for(int i = 0; i < 5; i++){
            sw[i] = false;
        }
    }

    public void btn_click(View view) {
        String aa = new String("Toppings:\n");
        for(int i = 0; i < 5; i++){
            if(sw[i]){
                aa += a2[i];
            }
        }
        Toast.makeText(getApplicationContext(), aa, Toast.LENGTH_LONG).show();

    }

    public void check1_click(View view) {
        CheckBox c = findViewById(R.id.checkBox);
        if(c.isChecked()){
            sw[0] = true;
        }
        else{
            sw[0] = false;
        }
    }

    public void check2_click(View view) {
        CheckBox c = findViewById(R.id.checkBox2);
        if(c.isChecked()){
            sw[1] = true;
        }
        else{
            sw[1] = false;
        }
    }

    public void check3_click(View view) {
        CheckBox c = findViewById(R.id.checkBox3);
        if(c.isChecked()){
            sw[2] = true;
        }
        else{
            sw[2] = false;
        }
    }

    public void check4_click(View view) {
        CheckBox c = findViewById(R.id.checkBox4);
        if(c.isChecked()){
            sw[3] = true;
        }
        else{
            sw[3] = false;
        }
    }

    public void check5_click(View view) {
        CheckBox c = findViewById(R.id.checkBox5);
        if(c.isChecked()){
            sw[4] = true;
        }
        else{
            sw[4] = false;
        }
    }
}