package client.com.gymapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import client.com.gymapp.R;
import client.com.gymapp.datamodel.entity.Dietplan;
import client.com.gymapp.services.DateTimeUtils;
import client.com.gymapp.services.DietplanServices;
import client.com.gymapp.sharedresources.Constants;

public class LogoutActivity extends AppCompatActivity {

    TextView tvTimeIn;
    TextView tvTimeOut;
    TextView tvTotalTime;
    TextView tvDietHead;
    TextView tvPlan1;
    TextView tvPlan2;
    Button btnToSingIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        initViews();
        setTimeInTimeOutAndTotalTime();
        setDailyPlan();
        listenerContainers();

    }

    void initViews(){

        tvTimeIn = (TextView) findViewById(R.id.tv_timeInLogout);
        tvTimeOut = (TextView) findViewById(R.id.tv_timeOutLogout);
        tvTotalTime = (TextView) findViewById(R.id.tv_totaltimeInLogout);
        tvDietHead = (TextView) findViewById(R.id.tv_diteplanheadLogout);
        tvPlan1 = (TextView) findViewById(R.id.tv_plan1Logout);
        tvPlan2 = (TextView) findViewById(R.id.tv_plan2Logout);
        btnToSingIn = (Button) findViewById(R.id.btn_backToSignIn);
    }

    void listenerContainers(){

        btnToSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LogoutActivity.this , SignInActivity.class);
                startActivity(intent);
            }
        });
    }

    void setTimeInTimeOutAndTotalTime(){

        tvTimeIn.setText("Time In : " + Constants.TIME_IN);
        tvTimeOut.setText("Time Out : " + DateTimeUtils.getCurrentTimeInString());
        tvTotalTime.setText("Total Time : " + DateTimeUtils.getTotalMinutes(Constants.TIME_IN_DATE , DateTimeUtils.getCurrentTimeInDate()));
    }

    void setDailyPlan(){

        tvDietHead.setText("Dietplan for " + DateTimeUtils.getDayComplete());
        Dietplan dietplan = DietplanServices.getDailyDietPlan(DateTimeUtils.getDay());
        tvPlan1.setText(dietplan.getWeeklyPlan().get(0));
        tvPlan2.setText(dietplan.getWeeklyPlan().get(1));


    }

    @Override
    public void onBackPressed() {

    }
}
