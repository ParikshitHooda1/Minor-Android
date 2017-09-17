package com.example.parikshit.minorfirst;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private final Button btadd = (Button) findViewById(R.id.button);
    private final Button btmul = (Button) findViewById(R.id.button2);
    private final Button btsub = (Button) findViewById(R.id.button3);
    private final Button btdiv = (Button) findViewById(R.id.button4);
    private final Button btclr = (Button) findViewById(R.id.button5);
    private final EditText e1 = (EditText) findViewById(R.id.t1);
    private final EditText e2 = (EditText) findViewById(R.id.t2);
    private final EditText e3 = (EditText) findViewById(R.id.t3);

    String fn; String sn; int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            Log.d("MainActivity","OnCreate first line");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Log.d("MainActivity","OnCreate - before getting edittext text");
        fn = e1.getText().toString();
        sn = e2.getText().toString();
            Log.d("MainActivity","OnCreate - after getting edittext text");
    }
    // End OnCreate method

    @Override
    public void onClick(View v) {
            Log.d("MainActivity","OnClick - first line");
        if(v.getId() == R.id.button){
            result = Integer.parseInt(fn) + Integer.parseInt(sn);
            e3.setText("");
            e3.setText(result);
        }
        if(v.getId() == R.id.button2){
            result = Integer.parseInt(fn) * Integer.parseInt(sn);
            e3.setText("");
            e3.setText(result);
        }
        if(v.getId() == R.id.button3){
            result = Integer.parseInt(fn) - Integer.parseInt(sn);
            e3.setText("");
            e3.setText(result);
        }
        if(v.getId() == R.id.button4){
            result = Integer.parseInt(fn) / Integer.parseInt(sn);
            e3.setText("");
            e3.setText(result);
        }
        if(v.getId() == R.id.button5){
            e3.setText("");
            e2.setText("");
            e3.setText("");
            btclr.setBackgroundColor(Color.BLUE);
            btclr.setTextColor(Color.WHITE);
        }


    }
    // End OnClick(View v) method

}
