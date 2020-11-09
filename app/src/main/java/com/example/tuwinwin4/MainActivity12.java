package com.example.tuwinwin4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        Button button1 = (Button)findViewById(R.id.button101);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity12.this,MainActivity13.class);
                // EditText edt = (EditText)findViewById(R.id.editText);
                // String value = edt.getText().toString();
                // intent.putExtra( "ant",value);
                startActivity(intent);
            }
        });
    }
}