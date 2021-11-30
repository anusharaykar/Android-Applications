package com.example.lab4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {
Button btn;
ProgressBar pg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        pg=findViewById(R.id.progressBar);

    }
    public void verify(View view)
    {
        AlertDialog.Builder alertdialoguebuilder= new AlertDialog.Builder(this);
        alertdialoguebuilder.setTitle("confirm exit??");
        alertdialoguebuilder.setCancelable(false);
        alertdialoguebuilder.setMessage("are you sure you want to exit?");
        alertdialoguebuilder.setIcon(R.drawable.ic_launcher_background);
        alertdialoguebuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertdialoguebuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "exit from the window", Toast.LENGTH_SHORT).show();
            }
        });
        alertdialoguebuilder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "cancelled", Toast.LENGTH_SHORT).show();
            }
        });
AlertDialog dialog=alertdialoguebuilder.create();
dialog.show();
dialog.setCancelable(true);
    }
}
