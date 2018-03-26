package com.example.raghuveeramalla.classallocation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by raghuveeramalla on 11/12/17.
 */

public class idverify extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idverify);
        Button b3=(Button) findViewById(R.id.button5);
        EditText t1=(EditText) findViewById(R.id.editText9);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(idverify.this,register.class);
                startActivity(i3);
            }
        });
    }
}
