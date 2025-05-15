package com.chat.app;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa el WebView
        webView = findViewById(R.id.webView);

        // Configura el WebView
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Habilita JavaScript
        webSettings.setAllowFileAccess(true); // Permite acceso a archivos locales
        webSettings.setAllowFileAccessFromFileURLs(true); // Permite acceso a URLs file://
        webSettings.setAllowUniversalAccessFromFileURLs(true); // Permite acceso universal desde URLs file://

        // Carga el archivo HTML desde la subcarpeta "public"
        webView.loadUrl("file:///android_asset/public/index.html");
    }

    @Override
    public void onBackPressed() {
        // Permite retroceder en el historial del WebView
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}