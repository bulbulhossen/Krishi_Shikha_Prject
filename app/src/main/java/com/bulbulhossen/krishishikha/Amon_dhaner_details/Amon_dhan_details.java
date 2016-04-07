package com.bulbulhossen.krishishikha.Amon_dhaner_details;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bulbulhossen.krishishikha.R;

/**
 * Created by appsd on 08-Apr-16.
 */
public class Amon_dhan_details extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amon_dhaner_poka);


        ImageView image = (ImageView) findViewById(R.id.imageView);
        ImageView image2 = (ImageView) findViewById(R.id.imageView1);
        ImageView image3 = (ImageView) findViewById(R.id.imageView3);
        ImageView image4 = (ImageView) findViewById(R.id.imageView4);

        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_zoom);
        image.startAnimation(animation1);

        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_zoom);
        image2.startAnimation(animation2);

        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_zoom);
        image3.startAnimation(animation3);

        Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_zoom);
        image4.startAnimation(animation4);


    }
}
