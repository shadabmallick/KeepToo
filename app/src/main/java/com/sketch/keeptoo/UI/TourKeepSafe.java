package com.sketch.keeptoo.UI;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sketch.keeptoo.R;

public class TourKeepSafe extends AppCompatActivity {
    TextView tv_top_title;
    ImageView img_back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_keep_safe);
        tv_top_title=findViewById(R.id.tv_top_title);
        img_back=findViewById(R.id.img_back);
        img_back.setColorFilter(ContextCompat.getColor(getApplicationContext(),
                        R.color.take_a_tour));
        tv_top_title.setTextColor(Color.parseColor("#EFCC1E"));
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
