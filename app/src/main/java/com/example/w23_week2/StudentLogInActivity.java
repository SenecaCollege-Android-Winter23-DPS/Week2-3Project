package com.example.w23_week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentLogInActivity extends AppCompatActivity {

    EditText unText;
    EditText passwordText;
    TextView megText;
    Button logInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_log_in);

        unText = findViewById(R.id.userNameText);
        passwordText = findViewById(R.id.passwordText);
        megText = findViewById(R.id.mesText);
        logInButton = findViewById(R.id.logIn);

        // add click listener to the button.
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!unText.getText().toString().isEmpty() &&
                        !passwordText.getText().toString().isEmpty()){

                    Student newStd = new Student(unText.getText().toString(),
                            passwordText.getText().toString());
                    StudentCollection.allStudents.add(newStd);
                    megText.setVisibility(View.VISIBLE);
                    megText.setText("Welcome " + unText.getText().toString());
                    Log.d("Students Number",  StudentCollection.allStudents.size() + " students Logged In" );
                    unText.setText("");
                    passwordText.setText("");

//                    unText.setVisibility(View.INVISIBLE);
//                    passwordText.setVisibility(View.INVISIBLE);
//                    logInButton.setVisibility(View.INVISIBLE);

                } else {
                    Log.d("Third Activity","Missing Info");
                    Toast.makeText(StudentLogInActivity.this, "Missing Info!!", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}