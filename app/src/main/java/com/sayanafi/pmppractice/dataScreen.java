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

       /* final Spinner spn = (Spinner)findViewById(R.id.editCity);
        RadioGroup rg = (RadioGroup)findViewById(R.id.editGender);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //DEKLARASI RB
                RadioButton rb1 =
                        (RadioButton)findViewById(R.id.rbMale);
                //cek
                if (rb1.isChecked()){
                    rg.makeText(getBaseContext(),
                            "Male";
                }else {
                    rg.makeText(getBaseContext(),
                            "Female";
                }
            }
        });*/

        //get data
        Intent intent = getIntent(); //deklarasi global

        //ambil data per baris
        String nm = intent.getStringExtra("name");
        String em = intent.getStringExtra("mail");
        String ag = intent.getStringExtra("age");
        String dob = intent.getStringExtra("dob");
        //String ct = spinner.getSelectedItem().toString("city");
        String gn = intent.getStringExtra("gender");

        //set data ke textview
        tvNama.setText(nm);
        tvEmail.setText(em);
        tvAge.setText(ag);
        tvDOB.setText(dob);
        //tvCity.setText(city);
        //rg.setText(gn);
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
