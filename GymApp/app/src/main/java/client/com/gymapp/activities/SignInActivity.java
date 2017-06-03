package client.com.gymapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

import client.com.gymapp.R;
import client.com.gymapp.datamodel.entity.BarcodeCred;
import client.com.gymapp.datamodel.entity.Users;
import client.com.gymapp.lib.IntentIntegrator;
import client.com.gymapp.lib.IntentResult;
import client.com.gymapp.services.DateTimeUtils;
import client.com.gymapp.services.UserServices;
import client.com.gymapp.sharedresources.Constants;

public class SignInActivity extends AppCompatActivity {

    TextView tv_UID ;
    TextView tv_UName ;
    TextView tv_UShift ;
    Button btn_SignIn;
    Boolean enableSignIn = false;
    Users users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        listenersCOntainer();


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode== IntentIntegrator.REQUEST_CODE)
        {
            IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

            if (scanResult.getFormatName() != null && scanResult.getContents() != null)
            {
                BarcodeCred barcodeCred = new BarcodeCred(scanResult.getFormatName() ,scanResult.getContents());
                Users user = UserServices.getUserByBarcodeCredentials(barcodeCred);

                if(user != null){
                    tv_UID.setText("User ID : " + user.getuID());
                    tv_UName.setText("Name : " + user.getName());
                    tv_UShift.setText("Shift : " + user.getShift());
                    btn_SignIn.setText("Tap to SignIn");
                    users = user;
                    enableSignIn = true;
                }

                else{

                    tv_UName.setText("No User Found");
                    btn_SignIn.setText("Tap to scan GYM-CARD");
                    enableSignIn = false;
                }

            }
            else
            {

                tv_UName.setText("No Barcode Detected");

                enableSignIn = false;
            }
        }
    }

    void listenersCOntainer(){

        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(enableSignIn){

                    Intent intent = new Intent(SignInActivity.this , MainMenuActivity.class);
                    intent.putExtra(Constants.USER_NAME_KEY, users.getName());
                    Constants.TIME_IN = DateTimeUtils.getCurrentTime();
                    Constants.TIME_IN_DATE = Calendar.getInstance().getTime();
                    startActivity(intent);
                }

                else {
                    IntentIntegrator integrator = new IntentIntegrator(SignInActivity.this);
                    integrator.initiateScan();
                }
            }
        });

    }

    void initViews(){

        tv_UID = (TextView) findViewById(R.id.tv_uid);
        tv_UName = (TextView) findViewById(R.id.tv_uname);
        tv_UShift = (TextView) findViewById(R.id.tv_ushift);
        btn_SignIn = (Button) findViewById(R.id.btn_Signin);

    }

    @Override
    public void onBackPressed() {

    }
}
