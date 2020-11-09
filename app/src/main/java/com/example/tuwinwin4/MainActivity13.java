package com.example.tuwinwin4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        Button button1 = (Button)findViewById(R.id.button102);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity13.this,MainActivity.class);
                // EditText edt = (EditText)findViewById(R.id.editText);
                // String value = edt.getText().toString();
                // intent.putExtra( "ant",value);
                startActivity(intent);
            }
        });
    }
}