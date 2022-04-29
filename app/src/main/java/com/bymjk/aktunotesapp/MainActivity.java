package com.bymjk.aktunotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        if(!isConnected(this)){
            showCustomDialog();
        }

        new Handler().postDelayed(() -> {
            Intent i = new Intent(MainActivity.this,HomeActivity.class);
            startActivity(i);
            finish();
        },3000);

    }

    private boolean isConnected(MainActivity mainActivity) {

        ConnectivityManager connectivityManager = (ConnectivityManager)mainActivity.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo wificonnection = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobileConn = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if(wificonnection != null && wificonnection.isConnected() || mobileConn!=null && mobileConn.isConnected()){
            return true;
        }
        else{
            return false;
        }
    }
    void showCustomDialog(){

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Please Connect to the Internet to Proceed Further :- ")
                .setCancelable(false)
                .setPositiveButton("Connect", (dialog, id) ->
                        MainActivity.this.startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS)))

                .setNegativeButton("Cancel", (dialog, id) ->
                        finish());

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}