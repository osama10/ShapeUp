package client.com.gymapp.activities;

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

public class ToolsMenuActivity extends AppCompatActivity {

    Spinner spTypeOfTools;

    EditText etSpeed;
    EditText etTime;
    EditText etDistance;

    TextView tvFirst1;
    TextView tvFirst2;
    TextView tvSecond1;
    TextView tvSeconf2;
    TextView tvThird1;
    TextView tvThird2;

    Button btnDone;

    int exerciseType = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools_menu);
        initViews();
        fillSpiner();
        listenerContainers();

    }

    void initViews(){

        spTypeOfTools = (Spinner) findViewById(R.id.sp_typeOfTools);

        etSpeed = (EditText) findViewById(R.id.et_speed);
        etDistance = (EditText) findViewById(R.id.et_km);
        etTime = (EditText) findViewById(R.id.et_time);

        tvFirst1 = (TextView) findViewById(R.id.tv_first1);
        tvFirst2 = (TextView) findViewById(R.id.tv_first2);

        tvSecond1 = (TextView) findViewById(R.id.tv_second1);
        tvSeconf2 = (TextView) findViewById(R.id.tv_second2);

        tvThird1 = (TextView) findViewById(R.id.tv_third1);
        tvThird2 = (TextView) findViewById(R.id.tv_third2);

        btnDone = (Button) findViewById(R.id.btn_DoneToolMenu);
    }

    void fillSpiner(){

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.type_of_tools, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spTypeOfTools.setAdapter(adapter);

    }


    void listenerContainers(){


        spTypeOfTools.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    showViewsOfTrademill();
                    exerciseType = 0;

                }
                else {

                   showViewsOfButterfly();
                   exerciseType = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(exerciseType == 0  && (Singelton.isEmpty(etSpeed) || Singelton.isEmpty(etDistance) || Singelton.isEmpty(etTime))) {

                    Toast.makeText(getApplicationContext(),"Fill all the text fields" , Toast.LENGTH_SHORT).show();

                }

                else if(exerciseType == 1  && (Singelton.isEmpty(etSpeed) ||  Singelton.isEmpty(etTime))) {

                    Toast.makeText(getApplicationContext(),"Fill all the text fields" , Toast.LENGTH_SHORT).show();

                }

                else{

                    etSpeed.setText(Singelton.makeEmpty());
                    etDistance.setText(Singelton.makeEmpty());
                    etTime.setText(Singelton.makeEmpty());
                }


            }
        });
    }

    void showViewsOfTrademill(){

        tvFirst1.setText("Speed");
        tvFirst2.setText("Km/h");

        tvSecond1.setText("Time");
        tvSeconf2.setText("minutes");

        tvThird1.setText("Km");
        tvThird2.setText("Km");


        etDistance.setVisibility(View.VISIBLE);
        tvThird1.setVisibility(View.VISIBLE);
        tvThird2.setVisibility(View.VISIBLE);
    }

    void showViewsOfButterfly(){

        tvFirst1.setText("Sets");
        tvFirst2.setText("Out of 20");

        tvSecond1.setText("Weight");
        tvSeconf2.setText("Kg");

        tvThird1.setText("Km");
        tvThird2.setText("Km");


        etDistance.setVisibility(View.INVISIBLE);
        tvThird1.setVisibility(View.INVISIBLE);
        tvThird2.setVisibility(View.INVISIBLE);
    }
}
