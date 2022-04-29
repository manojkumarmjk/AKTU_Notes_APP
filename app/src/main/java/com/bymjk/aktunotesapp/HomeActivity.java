package com.bymjk.aktunotesapp;


import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class HomeActivity extends Activity implements View.OnClickListener {

    CardView notes_card, Question_Bank_card, Previous_year_card, Syllabus_card, Quantum_card, Contact_card ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        notes_card =(CardView)findViewById(R.id.notes_card);
        notes_card.setOnClickListener(this);

        Question_Bank_card =(CardView)findViewById(R.id.Question_bank_card);
        Question_Bank_card.setOnClickListener(this);

        Previous_year_card =(CardView) findViewById(R.id.Previous_year_card);
        Previous_year_card.setOnClickListener(this);

        Syllabus_card =(CardView)findViewById(R.id.syllabus_card);
        Syllabus_card.setOnClickListener(this);

        Quantum_card =(CardView) findViewById(R.id.Quantum_card);
        Quantum_card.setOnClickListener(this);

        Contact_card =(CardView) findViewById(R.id.contact_us_card);
        Contact_card.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.notes_card){
            Intent intent = new Intent(getApplicationContext(),NotesActivity.class);
           startActivity(intent);
        }
        else if(view.getId() == R.id.Question_bank_card){
            Intent intent = new Intent(getApplicationContext(),QuestionbankActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.Previous_year_card){
            Intent intent = new Intent(getApplicationContext(),PreviousYearActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.syllabus_card){
            Intent intent = new Intent(getApplicationContext(),SyllabusActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.Quantum_card){
            Intent intent = new Intent(getApplicationContext(),QuantumActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.contact_us_card){
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"manojkumarmjk.iimt@gmail.com","raomanojkumarmjk254@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Subject here");
            intent.putExtra(Intent.EXTRA_TEXT,"Body Here");
            startActivity(Intent.createChooser(intent, "Send email..."));



        }

    }


}
