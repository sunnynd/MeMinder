package com.dyoon.android.meminder;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MeminderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meminder);

        if(savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            MeminderFragment meminderFragment = new MeminderFragment();
            transaction.replace(R.id.frame_layout_meminder_fragment, meminderFragment);
            transaction.commit();
        }
    }
}
