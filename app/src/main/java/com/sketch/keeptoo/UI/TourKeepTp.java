package com.sketch.keeptoo.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sketch.keeptoo.R;

public class TourKeepTp extends AppCompatActivity {
    TextView tv_center;
    ImageView img_back;
    RelativeLayout rel_second_bottom;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keep_tp);
        tv_center=findViewById(R.id.tv_front);
        img_back=findViewById(R.id.img_back);
        rel_second_bottom=findViewById(R.id.rel_second_bottom);
        tv_center.bringToFront();
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rel_second_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home2=new Intent(TourKeepTp.this,TourKeepSafe.class);
                startActivity(home2);
            }
        });
    }
}
