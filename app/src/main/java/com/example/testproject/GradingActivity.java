package com.example.testproject;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.testproject.databinding.GradingFormBinding;

public class GradingActivity extends AppCompatActivity {

    private static final String TAG = "GradingActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grading_form);
        //DataBindingUtil.setContentView<GradingFormBinding>(this, R.layout.question_layout)
    }

}
