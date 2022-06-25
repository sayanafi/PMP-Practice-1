package com.sayanafi.pmppractice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class dataScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_data_screen);

        //get UI
        TextView tvNama = (TextView)findViewById(R.id.name);
        TextView tvEmail = (TextView)findViewById(R.id.mail);
        TextView tvAge = (TextView)findViewById(R.id.age);
        TextView tvDOB = (TextView)findViewById(R.id.dob);
        TextView tvCity = (TextView)findViewById(R.id.city);
        TextView tvGender = (TextView)findViewById(R.id.gender);

        //get data
        Intent intent = getIntent(); //deklarasi global

        //ambil data per baris
        String nm = intent.getStringExtra("name");
        String em = intent.getStringExtra("mail");
        String ag = intent.getStringExtra("age");
        String dob = intent.getStringExtra("dob");
        String ct = intent.getStringExtra("city");
        String gn = intent.getStringExtra("gender");

        //set data ke textview
        tvNama.setText(nm);
        tvEmail.setText(em);
        tvAge.setText(ag);
        tvDOB.setText(dob);
        tvCity.setText(ct);
        tvGender.setText(gn);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this,registrationScreen.class);
        startActivity(intent);
        finish();
    }
}




/*
    //        SPINNER
    final Spinner spn = (Spinner)findViewById(R.id.spinner);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
@Override
public void onItemSelected(AdapterView<?> parent,
        View view, int position, long id) {
        Toast.makeText(getBaseContext(),
        "Pilihan :"+spn.getItemAtPosition(position),
        Toast.LENGTH_SHORT).show();
        }

@Override
public void onNothingSelected(AdapterView<?> parent) {

        }
        });*/
