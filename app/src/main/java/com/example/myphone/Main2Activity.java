package com.example.myphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void openAuthorSite(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://author.today/u/nickpol/works"));
        startActivity(intent);
    }
}
