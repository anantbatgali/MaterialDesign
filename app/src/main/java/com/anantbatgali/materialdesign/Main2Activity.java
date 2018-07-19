package com.anantbatgali.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button, button2, button3, button4, button6;

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIntro();
            }

        });

        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMaterialStudies();
            }

        });

        button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFoundation();
            }

        });

        button4 = findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEnvironment();
            }

        });


        button6 = findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTypography();
            }

        });
    }

    public void openIntro() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openMaterialStudies() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void openFoundation() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    public void openEnvironment() {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }


    public void openTypography() {
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }

}
