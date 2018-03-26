package com.example.raghuveeramalla.classallocation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by raghuveeramalla on 20/12/17.
 */

public class pref extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pref);
        Button b7,b8;
        b7=(Button) findViewById(R.id.button6);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(pref.this,MainActivity.class);
                startActivity(i7);
            }
        });
        b8=(Button) findViewById(R.id.button7);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8=new Intent(pref.this,pref.class);
                startActivity(i8);
            }
        });
    }
}
