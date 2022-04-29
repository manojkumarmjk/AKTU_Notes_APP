package com.bymjk.aktunotesapp;


import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuestionbankActivity extends Activity implements View.OnClickListener{

    CardView Dbms, compiler, algo, Computer_graphics, human_interface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionbank);

        Dbms =(CardView)findViewById(R.id.Database);
        Dbms.setOnClickListener(this);

        compiler =(CardView)findViewById(R.id.compiler);
        compiler.setOnClickListener(this);

        algo =(CardView) findViewById(R.id.algo);
        algo.setOnClickListener(this);

        Computer_graphics =(CardView)findViewById(R.id.computer_graphics);
        Computer_graphics.setOnClickListener(this);

        human_interface =(CardView) findViewById(R.id.human_computer_Interface);
        human_interface.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        if(view.getId() == R.id.Database){

            Intent intent = new Intent(getApplicationContext(),Notes_webActivity.class);
            intent.putExtra("filename","https://aktunotesapp.files.wordpress.com/2021/11/dbms-questionbank.pdf");
            startActivity(intent);
        }
        else if(view.getId() == R.id.compiler){
            Intent intent = new Intent(getApplicationContext(),Notes_webActivity.class);
            intent.putExtra("filename","https://aktunotesapp.files.wordpress.com/2021/11/cd_question-bank.pdf");
            startActivity(intent);
        }
        else if(view.getId() == R.id.algo){
            Intent intent = new Intent(getApplicationContext(),Notes_webActivity.class);
            intent.putExtra("filename","https://aktunotesapp.files.wordpress.com/2021/11/daa_question-bank.pdf");
            startActivity(intent);
        }
        else if(view.getId() == R.id.computer_graphics){
            Intent intent = new Intent(getApplicationContext(),Notes_webActivity.class);
            intent.putExtra("filename","https://aktunotesapp.files.wordpress.com/2021/11/cg_questionbank.pdf");
            startActivity(intent);
        }
        else if(view.getId() == R.id.human_computer_Interface){
            Intent intent = new Intent(getApplicationContext(),Notes_webActivity.class);
            intent.putExtra("filename","https://aktunotesapp.files.wordpress.com/2021/11/hci_questionbank.pdf");
            startActivity(intent);
        }
    }
}