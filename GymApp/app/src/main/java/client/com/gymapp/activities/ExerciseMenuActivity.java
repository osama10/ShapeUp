package client.com.gymapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import client.com.gymapp.R;
import client.com.gymapp.sharedresources.Singelton;

public class ExerciseMenuActivity extends AppCompatActivity {

    Spinner spTypeOfExercises;
    Button btnDone;
    EditText etSets20;
    EditText etSets30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_menu);
        initViews();
        fillSpinner();
        listenerContainer();
    }

    void initViews(){

        spTypeOfExercises = (Spinner) findViewById(R.id.sp_typeOfexercise);
        btnDone = (Button) findViewById(R.id.btn_DoneExerciseMenu);
        etSets20 = (EditText) findViewById(R.id.et_sets20);
        etSets30 = (EditText) findViewById(R.id.et_sets30);
    }

    void fillSpinner(){

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.type_of_exercise, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spTypeOfExercises.setAdapter(adapter);
    }

    void listenerContainer(){

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Singelton.isEmpty(etSets20) || Singelton.isEmpty(etSets30)){

                    Toast.makeText(getApplicationContext(),"Fill both text fields" , Toast.LENGTH_SHORT).show();
                }


                else {

                    etSets20.setText(Singelton.makeEmpty());
                    etSets30.setText(Singelton.makeEmpty());
                    Toast.makeText(getApplicationContext(), "Information Saved", Toast.LENGTH_SHORT).show();

                }
            }
        }
        );
    }

}
