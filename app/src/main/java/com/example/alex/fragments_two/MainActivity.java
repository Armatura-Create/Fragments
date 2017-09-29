package com.example.alex.fragments_two;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Fragment fragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_one_fr).setOnClickListener(this);
        findViewById(R.id.bt_two_fr).setOnClickListener(this);
        findViewById(R.id.bt_three_fr).setOnClickListener(this);
        findViewById(R.id.bt_four_fr).setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_one_fr:
                fragment = new FragmentOne();
                break;
            case R.id.bt_two_fr:
                fragment = new FragmentTwo();
                break;
            case R.id.bt_three_fr:
                fragment = new FragmentThree();
                break;
            case R.id.bt_four_fr:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
        }

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, fragment).commit();
    }
}
