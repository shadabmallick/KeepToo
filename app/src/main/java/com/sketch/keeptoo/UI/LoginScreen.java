package com.sketch.keeptoo.UI;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.sketch.keeptoo.R;

public class LoginScreen extends AppCompatActivity {
    boolean flag = false;
    ImageView image,google_login,fb_login;
    private final int PICK_IMAGE_CAMERA = 1;
    Boolean isCheck;
    private int MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE=101;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        image =  findViewById(R.id.cb_terms);
        google_login =  findViewById(R.id.google_login);
        fb_login =  findViewById(R.id.fb_login);
      image.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          switch(v.getId()){
              case R.id.cb_terms:{
                  if(flag)
                  {
                      image.setImageResource(R.mipmap.check_box);
                      flag=false;
                  }
                  else
                  {
                      image.setImageResource(R.mipmap.checked_checkbox);
                      flag=true;
                  }
                  return;
              }
          }

      }
  });
      google_login.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(flag){

                Intent permission=new Intent(getApplicationContext(),PermsissionPage.class);
                startActivity(permission);
              }
              else {
                  Toast.makeText(LoginScreen.this,"Please check the terms and condition",Toast.LENGTH_LONG).show();

              }
          }
      });


    }
}
