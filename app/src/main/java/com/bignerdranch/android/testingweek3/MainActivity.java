package com.bignerdranch.android.testingweek3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

EditText editText;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextUserInput);
        button = findViewById(R.id.changeTextBt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = editText.getText().toString();
                TextView tv = findViewById(R.id.textToBeChanged);
                tv.setText(user);
            }
        });
    }
}
