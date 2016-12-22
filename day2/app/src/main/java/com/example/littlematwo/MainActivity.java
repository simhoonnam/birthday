package com.example.littlematwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner year,month,day;
    Button next;

    private Object yearSt,monthSt,daySt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDefault();
        //스피너 개객기
        year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                yearSt=parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        month.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                monthSt=parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        day.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                daySt=parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void setDefault() {
        year=(Spinner) findViewById(R.id.yesr_et);
        month=(Spinner) findViewById(R.id.month_et);
        day=(Spinner) findViewById(R.id.day_et);
        next=(Button)findViewById(R.id.next_bt);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.next_bt:
                check();
                break;
        }
    }

    private void check() {
        Intent intent;

        intent = new Intent(MainActivity.this, resultActivity.class);
        intent.putExtra("a",yearSt.toString());
        intent.putExtra("b",monthSt.toString());
        intent.putExtra("c",daySt.toString());

        startActivity(intent);
    }
}
