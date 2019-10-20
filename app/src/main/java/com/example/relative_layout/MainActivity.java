package com.example.relative_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button click;
    ImageView image1, image2, image3, image4;
    int n=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = findViewById(R.id.imageView2);
        image2 = findViewById(R.id.imageView3);
        image3 = findViewById(R.id.imageView4);
        image4 = findViewById(R.id.imageView5);
        click = findViewById(R.id.Click);


        click.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        n++;

        if (n==1) {
            image1.setImageResource(R.drawable.ic_launcher_foreground);

        }

        else {
              image2.setImageResource(R.drawable.ic_launcher_foreground);

            }

        }


    }
}



