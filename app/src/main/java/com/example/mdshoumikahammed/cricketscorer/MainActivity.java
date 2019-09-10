package com.example.mdshoumikahammed.cricketscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {
    EditText total_run;
    EditText total_over;
    TextView rpo;
    TextView crr;
    TextView run;
    TextView ball;
    TextView over;
    int inttotal_run;
    int inttotal_over;
    int intrun=0;
    int intball;
    int intover;
    int ballcount=0;
    float floatover=0;
    float floatcrr=0;
    float floatrpo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total_run=(EditText)findViewById(R.id.TOTALRUNID);
        total_over=(EditText)findViewById(R.id.TOTALOVERID);
        rpo=(TextView)findViewById(R.id.RPOID);
        crr=(TextView)findViewById(R.id.CRRID);
        run=(TextView)findViewById(R.id.RUNID);
        ball=(TextView)findViewById(R.id.BALLID);
        over=(TextView)findViewById(R.id.OVERID);

        try {
            inttotal_run = Integer.parseInt(total_run.getText().toString());
        }catch (NumberFormatException nfe){}
        try {
            inttotal_over = Integer.parseInt(total_over.getText().toString());
        }catch (NumberFormatException nfe){}




    }

    public void increaserun(View view){
        intrun++;
        run.setText(valueOf(intrun));

    }
    public void decreaserun(View view){
        intrun--;
        run.setText(valueOf(intrun));
        if(intrun<0){
            intrun=0;
            run.setText(valueOf(intrun));
            Toast.makeText(getApplicationContext(), "Run can not be negative", Toast.LENGTH_SHORT).show();
        }

    }
    public void four(View view){
        intrun=4+intrun;
        run.setText(valueOf(intrun));
    }
    public void six(View view){
        intrun=6+intrun;
        run.setText(valueOf(intrun));
    }
    public  void resetrun(View view){
        intrun=0;
        run.setText(valueOf(intrun));

    }
    public void increaseball(View view) {
        intball++;
        ballcount++;
        if (intball < 6) {
            ball.setText(valueOf(intball));
        } else {
            intball = 0;
            ball.setText(valueOf(intball));
            intover++;
            over.setText(valueOf(intover));
        }
        floatover=(float)ballcount/6;

    }

    public void decreaseball(View view){
        intball--;
        ball.setText(valueOf(intball));
        if(intball<0){
            intball=0;
            ballcount=0;
            ball.setText(valueOf(intball));
            Toast.makeText(getApplicationContext(),"Ball can not be negative", Toast.LENGTH_SHORT).show();
        }

    }
    public void reset(View view){
        intball='\0';
        intover='\0';
        ball.setText(valueOf(intball));
        over.setText(valueOf(intover));
    }
    public void rpo(View view) {
        try {
            inttotal_run = Integer.parseInt(total_run.getText().toString());
        } catch (NumberFormatException nfe) {
        }
        try {
            inttotal_over = Integer.parseInt(total_over.getText().toString());
        } catch (NumberFormatException nfe) {
        }
        {

            floatrpo = (((float) inttotal_run - (float) intrun) / ((float) inttotal_over - floatover));
            try {
                rpo.setText(String.format("%.2f", floatrpo));
            } catch (NumberFormatException nffe) {
            }

        }
    }


    public void crr(View view){
        floatcrr=(intrun/floatover);
        crr.setText(String.format("%.2f",floatcrr));

    }

}

