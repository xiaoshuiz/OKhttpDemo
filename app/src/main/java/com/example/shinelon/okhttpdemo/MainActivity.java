package com.example.shinelon.okhttpdemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends Activity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_layout);
//        WebView webView = (WebView) findViewById(R.id.webView);
//        webView.loadUrl("http://www.bilibili.com/");
//        Button button =(Button)findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
////                ViewStub stub = (ViewStub) findViewById(R.id.viewStub);
////                stub.inflate();
//
//            }
//        });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                /*
//                第一種
//                 */
//            }
//        });


    }

    private void init() {
        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("http://www.bilibili.com");
        webView.setWebChromeClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url)
            {
                view.loadUrl(url);
                return true;
            }
        });


    }


}
