package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Host_CrewActivity extends AppCompatActivity {

    private EditText et_spaceship;
    private Button btn_plus, btn_minus, btn_count, btn_space;

    TextView showValue;
    int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostcrew);

        et_spaceship = findViewById(R.id.et_spaceship);
        btn_space = findViewById(R.id.btn_space);
        showValue = (TextView) findViewById(R.id.counterValue);

        String spaceID = et_spaceship.getText().toString();

        btn_space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent( Host_CrewActivity.this, Host_RoomActivity.class);
                startActivity(intent);
            }
        });
    }


    public void countIN (View view){
        counter++;
        showValue.setText(Integer.toString(counter));
    }
    public void countDE (View view) {
        counter--;
        showValue.setText(Integer.toString(counter));
    }

}