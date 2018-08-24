package com.example.siwoo.androidlab;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class LabTwelveX extends AppCompatActivity {
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_twelve_x);

        TextView textView = findViewById(R.id.fontView);
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "xmas.ttf"));

        checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(((compoundButton, checked) -> {
            if (checked) {
                compoundButton.setText("Checked");
            } else {

                compoundButton.setText("Unchecked");
            }
        }));
    }
}
