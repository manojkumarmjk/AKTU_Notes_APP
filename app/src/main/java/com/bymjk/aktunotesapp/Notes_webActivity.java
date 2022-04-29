package com.bymjk.aktunotesapp;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Notes_webActivity extends AppCompatActivity {

    WebView notes_web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_web);

        String file = getIntent().getStringExtra("filename");
        notes_web_view = (WebView) findViewById(R.id.notes_web_view);
        notes_web_view.setWebViewClient(new WebViewClient());
        notes_web_view.setWebChromeClient(new WebChromeClient());
        WebSettings webSettings = notes_web_view.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        notes_web_view.loadUrl("https://docs.google.com/gview?embedded=true&url="+file);
        notes_web_view.getSettings().getBuiltInZoomControls();
        webSettings.setSupportZoom(true);
    }
}