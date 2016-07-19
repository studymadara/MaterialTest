package com.example.wagh.materialtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.skyfishjy.library.RippleBackground;

/**
 * Created by wagh on 20/7/16.
 */
public class animate extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.animate);

        /*** ********************************  star just wow animation**/

        final RippleBackground rippleBackground=(RippleBackground)findViewById(R.id.ripple);
        ImageView imageView=(ImageView)findViewById(R.id.image);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rippleBackground.startRippleAnimation();
            }
        });
        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                rippleBackground.stopRippleAnimation();
                return true;
            }
        });
//************************************wow things end here****************************************
    }
}
