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

public class fachome extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fachome);
        Button b5,b6;
        b5=(Button) findViewById(R.id.button8);
        b6=(Button) findViewById(R.id.button9);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5= new Intent(fachome.this,response.class);
                startActivity(i5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(fachome.this,factime.class);
                startActivity(i6);
            }
        });
    }
}
