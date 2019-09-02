package com.sketch.keeptoo.UI;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.sketch.keeptoo.R;

public class PermsissionPage extends AppCompatActivity {
     RelativeLayout rl_dailog_storage,rl_dailog_overlay1,rl_dailog_overlay2;
     TextView tv_allow_storage,tv_allow,tv_allow_ok;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.permission_page);
        init();



    }
    private void init(){
        rl_dailog_storage=findViewById(R.id.rl_storage_permission1);
        rl_dailog_overlay1=findViewById(R.id.rl_storage_permission2);
        rl_dailog_overlay2=findViewById(R.id.rl_storage_permission);
        tv_allow_storage=findViewById(R.id.tv_allow_storage);
        tv_allow_ok=findViewById(R.id.tv_allow_ok);
        tv_allow=findViewById(R.id.tv_allow);
        rl_dailog_overlay1.setVisibility(View.GONE);
        rl_dailog_storage.setVisibility(View.GONE);
        tv_allow_storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl_dailog_overlay2.setVisibility(View.GONE);
                rl_dailog_overlay1.setVisibility(View.GONE);
                rl_dailog_storage.setVisibility(View.VISIBLE);
            }
        });
        tv_allow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl_dailog_overlay2.setVisibility(View.GONE);
                rl_dailog_storage.setVisibility(View.GONE);
                rl_dailog_overlay1.setVisibility(View.VISIBLE);
            }
        });
       tv_allow_ok.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (!Settings.canDrawOverlays(getApplicationContext())) {
                   Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                           Uri.parse("package:" + getPackageName()));
                   startActivityForResult(intent, 0);
                   Intent galley=new Intent(PermsissionPage.this,GalleryTour.class);
                   startActivity(galley);
               }
           }
       });

     }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent galley=new Intent(PermsissionPage.this,GalleryTour.class);
        startActivity(galley);
    }
}

