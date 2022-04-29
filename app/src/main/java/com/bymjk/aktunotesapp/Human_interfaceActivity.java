package com.bymjk.aktunotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Human_interfaceActivity extends AppCompatActivity {

    ListView listView;

    String [] Name = {"HCI Previous Year 2016-2017"};
    String [] filename = {"https://aktunotesapp.files.wordpress.com/2021/11/human-computer-interface-ncs070.pdf"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_interface);

        listView = (ListView)findViewById(R.id.hci_prev_year_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,Name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {

            Intent intent = new Intent(getApplicationContext(),Notes_webActivity.class);
            intent.putExtra("filename",filename[i]);
            startActivity(intent);
        });

    }
}