package com.example.wagh.materialtest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {


    CollapsingToolbarLayout collapsingToolbarLayout=null;
    Button attack;
    ShimmerFrameLayout shimmerFrameLayout;
    LinearLayout linearLayout;

    //for the last one of the day 20th july 2016

    Button b1;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attack=(Button)findViewById(R.id.attack);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //for the last one of the day

        b1=(Button)findViewById(R.id.attack);
        tv1=(TextView)findViewById(R.id.tv1);

        //continued on the linearlayout onclick


        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Facebook feature

        shimmerFrameLayout=(ShimmerFrameLayout)findViewById(R.id.bkue);

        //for stopping the animation #its just cooool...

        linearLayout=(LinearLayout) findViewById(R.id.parentcollab);

        //collapse binding

        collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.collapsing);
        collapsingToolbarLayout.setTitle("Viraj Wagh");


///************************************** Awesome night best effect i have in my collection hahaha  ***//

        shimmerFrameLayout.setDuration(2000);
        shimmerFrameLayout.startShimmerAnimation();

        //collapse for text and color pallet but not worked i guess

        dynamic();

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shimmerFrameLayout.stopShimmerAnimation();
                //yeah one more animation

                YoYo.with(Techniques.FadeIn).duration(2000).playOn(b1);

                //iphone style animation
                
                YoYo.with(Techniques.Shake).duration(2000).playOn(tv1);

                //end of the button animation

            }
        });

        attack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii=new Intent(MainActivity.this,animate.class);
                startActivity(ii);
            }
        });


    }

    public void dynamic()
    {
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                collapsingToolbarLayout.setContentScrimColor(palette.getMutedColor(Color.WHITE));
                collapsingToolbarLayout.setStatusBarScrimColor(palette.getMutedColor(Color.RED));

            }
        });
    }
}
