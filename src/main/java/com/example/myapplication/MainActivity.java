package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Stack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Math.*;

public class MainActivity extends AppCompatActivity {

    private TextView tvDisplay;
    private String currentInput = "";
    private String operator = "";
    private double firstOperand = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tvDisplay);
    }

    public void onDigitClick(View view) {
        Button button = (Button) view;
        currentInput += button.getText();
        tvDisplay.setText(currentInput);
    }

    public void onOperatorClick(View view) {
        Button button = (Button) view;
        if (!currentInput.isEmpty()) {
            firstOperand = Double.parseDouble(currentInput);
            operator = button.getText().toString();
            currentInput = "";
            tvDisplay.setText(operator);
        }
    }

    public void onEqualClick(View view) {
        if (!currentInput.isEmpty()) {
            double secondOperand = Double.parseDouble(currentInput);
            double result = 0.0;
            switch (operator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    result = firstOperand / secondOperand;
                    break;
            }
            tvDisplay.setText(String.valueOf(result));
            currentInput = String.valueOf(result);
        }
    }

    public void onFunctionClick(View view) {
        Button button = (Button) view;
        if (!currentInput.isEmpty()) {
            double value = Double.parseDouble(currentInput);
            double result = 0.0;
            switch (button.getText().toString()) {
                case "sin":
                    result = sin(toRadians(value));
                    break;
                case "cos":
                    result = cos(toRadians(value));
                    break;
                case "tan":
                    result = tan(toRadians(value));
                    break;
                case "log":
                    result = log10(value);
                    break;
                case "ln":
                    result = log(value);
                    break;
            }
            tvDisplay.setText(String.valueOf(result));
            currentInput = String.valueOf(result);
        }
    }

    public void onClearClick(View view) {
        currentInput = "";
        operator = "";
        firstOperand = 0.0;
        tvDisplay.setText("0");
    }

    public void openSettings(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void openHistory(View view) {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }
}
