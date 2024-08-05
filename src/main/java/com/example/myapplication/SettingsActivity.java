package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    private Switch switchDarkMode;
    private Switch switchNotifications;
    private RadioGroup radioGroupFontSize;
    private RadioGroup radioGroupLanguage;
    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        switchDarkMode = findViewById(R.id.switchDarkMode);
        switchNotifications = findViewById(R.id.switchNotifications);
        radioGroupFontSize = findViewById(R.id.radioGroupFontSize);
        radioGroupLanguage = findViewById(R.id.radioGroupLanguage);
        buttonBack = findViewById(R.id.buttonBack);

        // Set listeners and apply settings
        switchDarkMode.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Handle dark mode toggle
        });

        switchNotifications.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Handle notifications toggle
        });

        radioGroupFontSize.setOnCheckedChangeListener((group, checkedId) -> {
            // Handle font size selection
        });

        radioGroupLanguage.setOnCheckedChangeListener((group, checkedId) -> {
            // Handle language selection
        });

        // Back button functionality
        buttonBack.setOnClickListener(v -> finish());
    }
}
