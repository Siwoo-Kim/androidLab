package com.example.siwoo.androidlab;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LabSeven extends AppCompatActivity implements View.OnClickListener{
    Button visibleButton;
    Button invisibleButton;
    TextView visibleTarget;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_seven);

        visibleButton = findViewById(R.id.visible_true_Btn);
        invisibleButton = findViewById(R.id.visible_false_btn);
        visibleTarget = findViewById(R.id.visible_target);

        visibleButton.setOnClickListener(this);
        invisibleButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == visibleButton) {
            this.visibleTarget.setVisibility(View.VISIBLE);
        }else if(view == invisibleButton) {
            this.visibleTarget.setVisibility(View.INVISIBLE);
        }
    }
}
