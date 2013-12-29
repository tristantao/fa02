package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.widget.TextView;
import android.os.Build;

/**
 * Created by t-rex-Box on 12/28/13.
 */
public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        System.out.println("message: " + message);

        setContentView(R.layout.search_result);
        TextView cpu = (TextView) findViewById(R.id.specialTextView);
        System.out.println(cpu);
        cpu.setText(message);
    }

}
