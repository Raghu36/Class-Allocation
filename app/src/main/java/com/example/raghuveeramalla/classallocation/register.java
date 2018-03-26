package com.example.raghuveeramalla.classallocation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by raghuveeramalla on 11/12/17.
 */

public class register extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        Button b4=(Button) findViewById(R.id.button3);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4= new Intent(register.this,pref.class);
                startActivity(i4);
            }
        });
    }
}
