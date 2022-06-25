package com.sayanafi.pmppractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class registrationScreen extends AppCompatActivity
    implements View.OnClickListener {

        EditText editName, editEmail, editAge, editDOB;
        Spinner editCity;
        RadioGroup gender;
        RadioButton genderlist;
        Button btnSubmit;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getSupportActionBar().hide();
            setContentView(R.layout.activity_registration_scree);

            editName = (EditText)findViewById(R.id.editName);
            editEmail = (EditText)findViewById(R.id.editEmail);
            editAge = (EditText)findViewById(R.id.editAge);
            editDOB = (EditText)findViewById(R.id.editDOB);
            editCity = findViewById(R.id.editCity);
            gender = findViewById(R.id.editGender);
            btnSubmit = (Button) findViewById(R.id.btnSubmit);


            //listener
            btnSubmit.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
                Intent intent = new Intent(this,dataScreen.class);
                intent.putExtra("name",editName.getText().toString());
                intent.putExtra("mail",editEmail.getText().toString());
                intent.putExtra("age",editAge.getText().toString());
                intent.putExtra("dob",editDOB.getText().toString());
                intent.putExtra("city", editCity.getSelectedItem().toString());
                intent.putExtra("gender",genderlist.getText().toString());
                startActivity(intent);
                finish();
        }

/*        Spinner spinner = findViewById(R.id.editCity);
            if (spinner != null) {
            spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.city, android.R.layout.simple_spinner_item);
            adapter.setDropDown
                    (android.R.layout.simple_spinner_dropdown_item);

            if (spinner != null) {
            spinner.setAdapter(adapter);
        }*/

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {}
    public void onNothingSelected(AdapterView<?> adapterView) {}
}

