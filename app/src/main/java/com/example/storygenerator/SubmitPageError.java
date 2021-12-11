package com.example.storygenerator;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubmitPageError extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_story);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        final String TAG = "MyActivity";
        Log.d(TAG, "Received intent with " + message);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
