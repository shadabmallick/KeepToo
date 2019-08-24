package com.sketch.keeptoo.UI;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.sketch.keeptoo.R;

public class LoginScreen extends AppCompatActivity {
    boolean flag = true;
    ImageView image;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        image = (ImageView) findViewById(R.id.cb_terms);
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
    }
    public void onClick(View view) {
    }
}
