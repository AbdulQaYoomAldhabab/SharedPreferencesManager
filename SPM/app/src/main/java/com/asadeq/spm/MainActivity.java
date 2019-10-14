package com.asadeq.spm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.asadeq.sharedpreferencesmanager.SharedPreferencesManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferencesManager.initialize(this);

        if (!SharedPreferencesManager.isInitialize())
            return;
        SharedPreferencesManager.put("mApp", "MyStoredString");
        TextView textView = findViewById(R.id.storesString);
        textView.setText(SharedPreferencesManager.getString("mApp"));
    }
}
