package com.sketch.keeptoo.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.sketch.keeptoo.R;

public class GalleryTour extends AppCompatActivity {
    RelativeLayout rel_first_bottom,rel_second_bottom;
    ImageView img_temp;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_tour);
        rel_first_bottom=findViewById(R.id.rel_first_bottom);
        rel_second_bottom=findViewById(R.id.rel_first_bottom);
        img_temp=findViewById(R.id.img_temp);
        rel_first_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* img_temp.setColorFilter(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));*/
                Intent tour=new Intent(GalleryTour.this,TourKeepTp.class);
                startActivity(tour);
            }
        });
        rel_second_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* img_temp.setColorFilter(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));*/
                Intent tour=new Intent(GalleryTour.this,TourKeepTp.class);
                startActivity(tour);
            }
        });
    }
}
