package com.example.alu53381650f.myexercisefragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity implements ListFragment.AndroidVersionReceiver{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void setAndroidVersion(AndroidVersion av) {
        DetailFragment detailfragment = (DetailFragment) getFragmentManager()
                .findFragmentById(R.id.fragmentDetail);
        if (detailfragment != null && detailfragment.isInLayout()) {
            detailfragment.setAndroidVersion(av);
        } else {
            Intent intent = new Intent(getApplicationContext(),
                    DetailActivity.class);
            //Bundle extras = new Bundle();
            //extras.putSerializable("android_version",av);
            //intent.putExtras(extras);
            intent.putExtra("android_version",av);
            startActivity(intent);
        }
    }
}
