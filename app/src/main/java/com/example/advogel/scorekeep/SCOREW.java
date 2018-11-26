package com.example.advogel.scorekeep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SCOREW extends AppCompatActivity {

    int bnumint;
    int rnumint;
    TextView rnum;
    TextView bnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorew);
        rnum = (TextView) findViewById(R.id.rnum);
        bnum = (TextView) findViewById(R.id.bnum);
        rnumint = 0;
        bnumint = 0;
    }

    public void bup(View view){
        bnumint++;
        update();
    }

    public void bdown(View view){
        bnumint--;
        update();
    }

    public void rup(View view){
        rnumint++;
        update();
    }

    public void rdown(View view){
        rnumint--;
        update();
    }


    public void update(){
        rnum.setText(""+rnumint);
        bnum.setText(""+bnumint);
    }



}
