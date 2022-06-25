package com.sayanafi.pmppractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class registrationScreen extends AppCompatActivity
    implements View.OnClickListener {

        EditText editName;
        EditText editEmail;
        EditText editAge;
        EditText editDOB;
        RadioButton rMale, rFemale;
        Button btnSubmit;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getSupportActionBar().hide();
            setContentView(R.layout.activity_registration_scree);

            editName = (EditText) findViewById(R.id.editName);
            editEmail = (EditText) findViewById(R.id.editEmail);
            editAge = (EditText) findViewById(R.id.editAge);
            editDOB = (EditText) findViewById(R.id.editDOB);
            //spinner
            rMale = (RadioButton)findViewById(R.id.rbMale);
            rFemale = (RadioButton)findViewById(R.id.rbFemale);
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

            startActivity(intent);
            finish();
    }
}

