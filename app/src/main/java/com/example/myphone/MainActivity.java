package com.example.myphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAuthorInfo(View view) {
        Intent intentopenActivity2 = new Intent(this, Main2Activity.class);
        startActivity(intentopenActivity2);

    }

    public void callPhone(View view) {
        EditText editText =findViewById(R.id.editText);
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + editText.getText().toString()));
        startActivity(intent);
    }
}
