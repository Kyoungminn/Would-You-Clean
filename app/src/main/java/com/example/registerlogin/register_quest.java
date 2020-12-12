package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class register_quest extends AppCompatActivity {

    ListView listview1;
    ArrayList<String> listItem;

    EditText editText;
    Button add;
    Button delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_quest);

        editText = findViewById(R.id.editText);
        add = findViewById(R.id.add);
        delete = findViewById(R.id.delete);

        listItem = new ArrayList<String>();
        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, listItem) ;

        Button addButton = (Button)findViewById(R.id.add) ;
        addButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int count;
                count = adapter.getCount();

                // 아이템 추가.
                listItem.add(editText.getText().toString());
                adapter.notifyDataSetChanged(); // 변경되었음을 어답터에 알려준다.
                editText.setText("");

                final TextView mon = findViewById(R.id.textView1);
                mon.setTextColor(Color.parseColor("#000000"));

                final TextView tue = findViewById(R.id.textView2);
                tue.setTextColor(Color.parseColor("#000000"));

                final TextView wed = findViewById(R.id.textView3);
                wed.setTextColor(Color.parseColor("#000000"));

                final TextView thu = findViewById(R.id.textView4);
                thu.setTextColor(Color.parseColor("#000000"));

                final TextView fri = findViewById(R.id.textView5);
                fri.setTextColor(Color.parseColor("#000000"));

                final TextView sat = findViewById(R.id.textView6);
                sat.setTextColor(Color.parseColor("#000000"));

                final TextView sun = findViewById(R.id.textView7);
                sun.setTextColor(Color.parseColor("#000000"));

                final TextView week = findViewById(R.id.textView8);
                week.setTextColor(Color.parseColor("#000000"));

            }
        }) ;


        Button deleteButton = (Button)findViewById(R.id.delete) ;
        deleteButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int count, checked ;
                count = adapter.getCount() ;

                if (count > 0) {
                    // 현재 선택된 아이템의 position 획득.
                    checked = listview1.getCheckedItemPosition();

                    if (checked > -1 && checked < count) {
                        // 아이템 삭제
                        listItem.remove(checked);

                        // listview 선택 초기화.
                        listview1.clearChoices();

                        // listview 갱신.
                        adapter.notifyDataSetChanged();
                    }
                }

                Toast.makeText(getApplicationContext()," 삭제되었습니다.",Toast.LENGTH_SHORT).show();
            }
        }) ;

        listview1 = findViewById(R.id.listview1);
        listview1.setAdapter(adapter);

        final TextView mon = findViewById(R.id.textView1);
        mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mon.setTextColor(Color.parseColor("#D52C11"));
            }
        });

        final TextView tue = findViewById(R.id.textView2);
        tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tue.setTextColor(Color.parseColor("#D52C11"));
            }
        });

        final TextView wed = findViewById(R.id.textView3);
        wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wed.setTextColor(Color.parseColor("#D52C11"));
            }
        });

        final TextView thu = findViewById(R.id.textView4);
        thu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thu.setTextColor(Color.parseColor("#D52C11"));
            }
        });

        final TextView fri = findViewById(R.id.textView5);
        fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fri.setTextColor(Color.parseColor("#D52C11"));
            }
        });

        final TextView sat = findViewById(R.id.textView6);
        sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sat.setTextColor(Color.parseColor("#D52C11"));
            }
        });

        final TextView sun = findViewById(R.id.textView7);
        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sun.setTextColor(Color.parseColor("#D52C11"));
            }
        });

        final TextView week = findViewById(R.id.textView8);
        week.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                week.setTextColor(Color.parseColor("#D52C11"));
            }
        });

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register_quest.this, major.class);
                startActivity(intent);
            }
        });


    }
}
