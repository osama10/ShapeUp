package client.com.gymapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import client.com.gymapp.R;
import client.com.gymapp.services.DateTimeUtils;
import client.com.gymapp.sharedresources.Constants;

public class MainMenuActivity extends AppCompatActivity {

    TextView tvDay ;
    TextView tvTimeIn;
    TextView tvSignedInUserName;
    Button btnToExerciseMenu;
    Button btnToToolsMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_menu);

        initViews();
        setDay();
        setTimeIn();
        setSignedInUserName();
        listenerContainer();


    }


    void initViews(){

        tvDay = (TextView) findViewById(R.id.tv_Day);
        tvTimeIn = (TextView) findViewById(R.id.tv_Timein);
        tvSignedInUserName = (TextView) findViewById(R.id.tv_SignedInUserName);
        btnToExerciseMenu = (Button) findViewById(R.id.btn_typeOfExercise);
        btnToToolsMenu = (Button) findViewById(R.id.btn_typeOfTool);
    }

    void setDay(){

        tvDay.setText("Date :" + DateTimeUtils.getDateAndDay());
    }

    void setTimeIn(){

        tvTimeIn.setText("TimeIn :" + Constants.TIME_IN);
    }

    void setSignedInUserName(){

        String userName = getIntent().getStringExtra(Constants.USER_NAME_KEY);
        tvSignedInUserName.setText("Hi,  " + userName);
    }

    @Override
    public void onBackPressed() {

    }

    public void listenerContainer(){

        btnToExerciseMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenuActivity.this, ExerciseMenuActivity.class);
                startActivity(intent);
            }
        });

        btnToToolsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenuActivity.this, ToolsMenuActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings_menu, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.logout){
            Intent intent = new Intent(MainMenuActivity.this , LogoutActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
