package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    FirstFragment frag1;
    SecondFragment frag2;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1=new FirstFragment();
        frag2=new SecondFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.f1,frag1);
        fragmentTransaction.commit();
        count=1;


    }
    public void switchfragment(View view)
    {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if(count==1) {
            fragmentTransaction.replace(R.id.f2, frag2);
            fragmentTransaction.commit();
            count = 2;
        }
        else{
            fragmentTransaction.replace(R.id.f1, frag1);
            fragmentTransaction.commit();
            count = 1;
        }
    }
}
