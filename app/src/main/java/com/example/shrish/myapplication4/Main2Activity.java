package com.example.shrish.myapplication4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText e1=findViewById(R.id.edit1);
        final Button b=findViewById(R.id.butt1);
        final LinearLayout ll=findViewById(R.id.linlay);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String str =e1.getText().toString();//should be inside on-click function

                final TextView e2=new TextView(Main2Activity.this);
                e2.setText(str);
                ll.addView(e2);

                e2.setTextColor(Color.BLACK);
                e2.setTextSize(30.0f);
                e1.setText("");
            }



        });

    }
}
