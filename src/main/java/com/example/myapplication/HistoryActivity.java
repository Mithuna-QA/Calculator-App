package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    private Button buttonBack;
    private ListView listViewHistory;
    private ArrayAdapter<String> historyAdapter;
    private List<String> historyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        buttonBack = findViewById(R.id.buttonBack);
        listViewHistory = findViewById(R.id.listViewHistory);

        // Initialize the history list
        historyList = new ArrayList<>();
        // Add example history items (you can replace this with actual history data)
        historyList.add("555 + 110 = 665");
        historyList.add("1269 /2 = 634.5");
        historyList.add("999 * 35 = 34,965");
        historyList.add("4689 - 256 = 4433");


        // Set up the adapter for the ListView
        historyAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, historyList);
        listViewHistory.setAdapter(historyAdapter);

        // Back button functionality
        buttonBack.setOnClickListener(v -> finish());
    }
}




