package com.example.fragmentex;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends FragmentActivity
        implements Fragment1.FirstFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(int fontsize, String text) {
        Fragment2 textFragment =
                (Fragment2)getSupportFragmentManager().findFragmentById
                        (R.id.fragment2);
        textFragment.changeTextProperties(fontsize, text);
    }
}

