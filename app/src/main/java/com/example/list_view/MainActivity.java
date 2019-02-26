package com.example.list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.List_View);
       list.add("Jasjot Singh");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this , android.R.layout.simple_list_item_1 , list);
        // if there is no data initially in firm of list dont write 3rd arguement
        // after 5 seconds data will appear from server then do adapter.addAll(list);
        listView.setAdapter(adapter);

    }
}
