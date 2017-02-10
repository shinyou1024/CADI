package com.example.shinyou.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnIntro;
    private EditText name, age, school, part;
    private String intro;
    private Button btnIntro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        btnIntro = (Button) findViewById(R.id.btn_intro);
        name = (EditText) findViewById(R.id.edName);
        age = (EditText) findViewById(R.id.edAge);
        school = (EditText) findViewById(R.id.edSchool);
        part = (EditText) findViewById(R.id.edPart);
        btnIntro2 = (Button) findViewById(R.id.btn_intro2);

        btnIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, name.getText().toString() + "/" + age.getText().toString() + "/" + school.getText().toString() + "/" + part.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

    }

    private View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_intro:
                    Toast.makeText(MainActivity.this, name.getText().toString() + "/" + age.getText().toString() + "/" + school.getText().toString() + "/" + part.getText().toString(), Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_intro2:
                    //
                    break;
            }
        }
    };


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_intro:
                //
                break;
            case R.id.btn_intro2:
                //
                break;

        }
    }
}