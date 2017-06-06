package com.example.shinelon.okhttpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewStub;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (((int)(Math.random()*100)&0x01)==0) {
            ViewStub stub =(ViewStub)findViewById(R.id.viewStub);
            stub.inflate();
            WebView webView=(WebView) findViewById(R.id.webview);
        }
    }
}
