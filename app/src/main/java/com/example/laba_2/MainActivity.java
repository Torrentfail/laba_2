package com.example.laba_2;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_1 = findViewById(R.id.button1);
        Button button_2 = findViewById(R.id.button2);
        Button button_3 = findViewById(R.id.button3);
        Button button_4 = findViewById(R.id.button4);
        button_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            Intent perehod = new Intent(MainActivity.this, Activity2.class);
                startActivity(perehod);

            }

        });

                button_2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent perehod1 = new Intent(MainActivity.this, Activity3.class);
                        startActivity(perehod1);

                    }

                }
        );
                button_3.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public  void onClick(View view){

                        Intent perehod2 = new Intent(MainActivity.this, activity4.class);
                        startActivity(perehod2);

                    }

                });

                button_4.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        finish();
                        System.exit(0);
                    }
                });
    }
    }

