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

public class registrationScreen extends AppCompatActivity {

    EditText editName, editEmail, editAge, editDOB;
    Spinner editCity;
    RadioGroup gender;
    RadioButton genderlist;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_scree);

        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        editAge = findViewById(R.id.editAge);
        editDOB = findViewById(R.id.editDOB);
        editCity = findViewById(R.id.editCity);
        gender = findViewById(R.id.editGender);
        btnSubmit = findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                int radioID = gender.getCheckedRadioButtonId();
                genderlist = (RadioButton) findViewById(radioID);

                Intent intent = new Intent(registrationScreen.this, dataScreen.class);
                intent.putExtra("name", editName.getText().toString());
                intent.putExtra("email", editEmail.getText().toString());
                intent.putExtra("age", editAge.getText().toString());
                intent.putExtra("dob", editDOB.getText().toString());
                intent.putExtra("gender", genderlist.getText().toString());
                intent.putExtra("city", editCity.getSelectedItem().toString());
                startActivity(intent);
            }
        });

        Spinner spinner = findViewById(R.id.editCity);
        if (spinner != null) {
            spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.city, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    public void onRadioButtonClicked(View view) {
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

}
