package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Host_RoomActivity extends AppCompatActivity {

    private TextView et_spaceship;
    private Button btn_livingplus, btn_livingminus, btn_roomplus, btn_roomminus, btn_bathplus, bnt_bathminus, btn_chickplus, btn_chickminus, btn_ok;
    TextView LshowValue;
    TextView RshowValue;
    TextView BshowValue;
    TextView CshowValue;
    int Lcounter =0;
    int Rcounter =0;
    int Bcounter =0;
    int Ccounter =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostroom);
        LshowValue = (TextView) findViewById(R.id.countervalue1);
        RshowValue = (TextView) findViewById(R.id.countervalue2);
        BshowValue = (TextView) findViewById(R.id.countervalue3);
        CshowValue = (TextView) findViewById(R.id.countervalue4);
        et_spaceship = findViewById(R.id.et_spaceship);


        btn_ok = findViewById(R.id.btn_ok);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent( Host_RoomActivity.this, SemiActivity.class);
                startActivity(intent);
            }
        });
    }
    public void countCIN (View view){
        Ccounter++;
        CshowValue.setText(Integer.toString(Ccounter));
    }
    public void countCDE (View view) {
        Ccounter--;
        CshowValue.setText(Integer.toString(Ccounter));
    }
    public void countBIN (View view){
        Bcounter++;
        BshowValue.setText(Integer.toString(Bcounter));
    }
    public void countBDE (View view) {
        Bcounter--;
        BshowValue.setText(Integer.toString(Bcounter));
    }
    public void countLIN (View view){
        Lcounter++;
        LshowValue.setText(Integer.toString(Lcounter));
    }
    public void countLDE (View view) {
        Lcounter--;
        LshowValue.setText(Integer.toString(Lcounter));
    }
    public void countRIN (View view){
        Rcounter++;
        RshowValue.setText(Integer.toString(Rcounter));
    }
    public void countRDE (View view) {
        Rcounter--;
        RshowValue.setText(Integer.toString(Rcounter));
    }
}