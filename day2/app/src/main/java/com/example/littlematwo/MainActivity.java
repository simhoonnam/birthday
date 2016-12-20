package com.example.littlematwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText year,month,day;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDefault();
    }

    private void setDefault() {
        year=(EditText)findViewById(R.id.yesr_et);
        month=(EditText)findViewById(R.id.month_et);
        day=(EditText)findViewById(R.id.day_et);
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
        intent.putExtra("a",year.getText().toString());
        intent.putExtra("b",month.getText().toString());
        intent.putExtra("c",day.getText().toString());

        startActivity(intent);
    }
}
