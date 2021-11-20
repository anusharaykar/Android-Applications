package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e;
Button b;
//TODO STEP 1:XXXX
    //TODO STEP2:YYY
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.editTextTextPersonName);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=e.getText().toString();
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
//TODO ZZZ
                startActivity(i);
            }
        });

    }
}
