package com.example.panxinghua.pxh1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pxh1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_pager);
        System.out.println("hello world!");

        findViewById(R.id.btn_bin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   startActivity(new Intent(pxh1.this,AnotherAty.class));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://jikexueyuan.com")));
            }
        });
    }
}
