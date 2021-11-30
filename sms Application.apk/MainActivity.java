package com.example.sms1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText txtmobile;
EditText TXTMESSAGE;
Button btnsms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtmobile=findViewById(R.id.editTextPhone);
        TXTMESSAGE=findViewById(R.id.editTextTextPersonName2);
        btnsms=findViewById(R.id.button);
        //btnsms.setOnClickListener();
        btnsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    SmsManager smgr=SmsManager.getDefault();
                   smgr.sendTextMessage(txtmobile.getText().toString(),null,TXTMESSAGE.getText().toString(),null,null);
                    Toast.makeText(MainActivity.this, "message sent succesfully", Toast.LENGTH_SHORT).show();
                    // smgr.sendTextMessage(txtmobile.getText().toString(),null,txtmessage);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
