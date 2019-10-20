package com.example.relative_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button click;
    ImageView img1, img2, img3, img4;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.iv1);
        img2 = findViewById(R.id.iv2);
        img3 = findViewById(R.id.iv3);
        img4 = findViewById(R.id.iv4);
        click = findViewById(R.id.Click);

        click.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(counter > 3){
            counter = 0;
        }

        if(counter == 0)
        {
            img1.setImageResource(R.drawable.ic_launcher_foreground);
            img2.setImageResource(R.drawable.ic_launcher_background);
            img3.setImageResource(R.drawable.ic_launcher_background);
            img4.setImageResource(R.drawable.ic_launcher_background);
        }

        if (counter == 1)
        {
            img1.setImageResource(R.drawable.ic_launcher_background);
            img2.setImageResource(R.drawable.ic_launcher_foreground);
            img3.setImageResource(R.drawable.ic_launcher_background);
            img4.setImageResource(R.drawable.ic_launcher_background);
        }

        if (counter == 2)
        {
            img1.setImageResource(R.drawable.ic_launcher_background);
            img2.setImageResource(R.drawable.ic_launcher_background);
            img3.setImageResource(R.drawable.ic_launcher_foreground);
            img4.setImageResource(R.drawable.ic_launcher_background);
        }

        if(counter == 3)
        {
            img1.setImageResource(R.drawable.ic_launcher_background);
            img2.setImageResource(R.drawable.ic_launcher_background);
            img3.setImageResource(R.drawable.ic_launcher_background);
            img4.setImageResource(R.drawable.ic_launcher_foreground);
        }
        counter++;
    }
}




