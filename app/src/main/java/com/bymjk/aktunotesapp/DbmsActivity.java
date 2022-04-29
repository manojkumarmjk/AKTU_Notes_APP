package com.bymjk.aktunotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DbmsActivity extends AppCompatActivity {

    ListView listView;

    String [] Name = {"DBMS Previous Year 2016-2017","DBMS Previous Year 2017-2018","DBMS Previous Year 2018-2019","DBMS Previous Year 2019-2020","DBMS Previous Year 2020-2021"};
    String [] filename = {"https://aktunotesapp.files.wordpress.com/2021/11/16-17.pdf","https://aktunotesapp.files.wordpress.com/2021/11/17-18-dbms.pdf","https://aktunotesapp.files.wordpress.com/2021/11/18-19-dbms.pdf","https://aktunotesapp.files.wordpress.com/2021/11/19-20-dbms.pdf","https://aktunotesapp.files.wordpress.com/2021/11/20-21-dbms.pdf"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms);

        listView = (ListView)findViewById(R.id.Dbms_prev_year_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,Name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {

            Intent intent = new Intent(getApplicationContext(),Notes_webActivity.class);
            intent.putExtra("filename",filename[i]);
            startActivity(intent);
        });

    }
}