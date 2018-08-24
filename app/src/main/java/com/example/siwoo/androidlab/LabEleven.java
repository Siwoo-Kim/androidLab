package com.example.siwoo.androidlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

public class LabEleven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_eleven);

        CheckBox checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener((button, isChecked) -> {
            if(isChecked) {
                checkBox.setText("is Checked");
            }else {
                checkBox.setText("is Unchecked");
            }
        });
    }
}
