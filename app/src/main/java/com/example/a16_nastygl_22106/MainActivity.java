package com.example.a16_nastygl_22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView inputTextView;
    private Button saveButton;
    private Button loadButton;
    private TextView loadTextView;
    private String savedString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputTextView = findViewById(R.id.editTextTextPersonName);
        saveButton = findViewById(R.id.saveButton);
        loadButton = findViewById(R.id.loadButton);
        loadTextView = findViewById(R.id.loadTextView);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savedString=inputTextView.getText().toString();
                inputTextView.setText("");
              Toast toast = Toast.makeText(getApplicationContext(),
                      "Text Saved", Toast.LENGTH_SHORT);
              toast.show();


            }
        });
        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadTextView.setText(savedString);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Text Load", Toast.LENGTH_SHORT);
                toast.show();
            }
        });





    }

}