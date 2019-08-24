package com.sketch.keeptoo.UI;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;

import com.sketch.keeptoo.R;

public class SplashScreen extends Activity {
    public static final String MyPREFERENCES1 = "somthing";
   // Shared_Preference prefrence;
  //  GlobalClass globalClass;
    private static int SPLASH_TIME_OUT = 3000;
    private static final int PERMISSION_REQUEST_CODE=1000;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

      //  globalClass=(GlobalClass)getApplicationContext();
       // prefrence = new Shared_Preference(SplashScreen.this);
       // prefrence.loadPrefrence();
        requestPermission();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms

                    Intent intent = new Intent(SplashScreen.this, MainScreen.class);
                    startActivity(intent);
                    finish();


            }
        }, 3000);


    }
    private void requestPermission(){

        ActivityCompat.requestPermissions(SplashScreen.this,
                new String[]{Manifest.permission.CALL_PHONE}, PERMISSION_REQUEST_CODE);
    }
/*
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    Log.d("Dominator", "PERMISSION_GRANTED >>>>");


                    sharedpreferences = getSharedPreferences(MyPREFERENCES1,
                            Context.MODE_PRIVATE);
                    String value = sharedpreferences.getString("password", "");

                    if (value.equalsIgnoreCase("")) {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                // This method will be executed once the timer is over
                                // Start your app main activity
                                Intent intent = new Intent(SplashScreen.this,
                                        LoginScreen.class);


                                startActivity(intent);
                                finish();

                            }
                        }, SPLASH_TIME_OUT);
                    }


                    UpdateChecker checker = new UpdateChecker(this);
                    checker.start();

                } else {

                    requestPermission();
                    //code for deny
                }
                break;
        }
    }
*/

}