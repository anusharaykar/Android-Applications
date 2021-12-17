package com.example.rating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RatingBar rate;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rate=findViewById(R.id.ratingBar);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=""+rate.getRating();
                String tot=""+rate.getNumStars();
                Toast.makeText(getApplicationContext(), "totalstars:"+tot+"\n"+"no of stars:"+num, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
