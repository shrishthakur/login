package com.example.shrish.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText e1=findViewById(R.id.edit1);
        final EditText e2=findViewById(R.id.edit2);
        final Button b=findViewById(R.id.button1);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usr = e1.getText().toString();     //maybe don't use final for data types,use for objects only
                String pass = e2.getText().toString();     //should not be final

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                if ((usr.equals("shrish")) && (pass.equals("key")))
                {


                    startActivity(intent);

                }
                else {
                    Toast.makeText(MainActivity.this, "wrong username or password", Toast.LENGTH_SHORT).show();
                     }

            }} );



}
}