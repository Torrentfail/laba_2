package com.example.laba_2;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity4 extends Activity implements View.OnClickListener {
    Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        button5 = (Button) findViewById(R.id.button5);

        button5.setOnClickListener(activity4.this);
    }

    @Override
    public void onClick(View v) {
        v.setBackgroundColor(Color.parseColor("#7CFC00"));
    }
}
