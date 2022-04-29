package com.bymjk.aktunotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Computer_graphicsActivity extends AppCompatActivity {

    ListView listView;

    String [] Name = {"Computer Graphics Previous Year 2012-2013","Computer Graphics Previous Year 2013-2014","Computer Graphics Previous Year 2014-2015","Computer Graphics Previous Year 2015-2016","Computer Graphics Previous Year 2018-2019"};
    String [] filename = {"https://aktunotesapp.files.wordpress.com/2021/11/12-13-computer-graphics.pdf","https://aktunotesapp.files.wordpress.com/2021/11/13-14-computer-graphics.pdf","https://aktunotesapp.files.wordpress.com/2021/11/14-15-computer-graphics.pdf","https://aktunotesapp.files.wordpress.com/2021/11/15-16-computer-graphics.pdf","https://aktunotesapp.files.wordpress.com/2021/11/18-19-computer-graphics.pdf"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_graphics);

        listView = (ListView)findViewById(R.id.cg_prev_year_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,Name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {

            Intent intent = new Intent(getApplicationContext(),Notes_webActivity.class);
            intent.putExtra("filename",filename[i]);
            startActivity(intent);
        });

    }
}