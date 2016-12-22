package com.example.sunrin.ensol4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listone;
    private ListView listtwo;

    private List<idList> peopleIdlist = new ArrayList<>();
    private List<downList> petListDown = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peopleIdlist.add(new idList("심훈",01062760147));
        peopleIdlist.add(new idList("심훈",01062760147));
        peopleIdlist.add(new idList("심훈",01062760147));
        peopleIdlist.add(new idList("심훈",01062760147));
        peopleIdlist.add(new idList("심훈",01062760147));
        peopleIdlist.add(new idList("심훈",01062760147));
        peopleIdlist.add(new idList("심훈",01062760147));
        peopleIdlist.add(new idList("심훈",01062760147));
        peopleIdlist.add(new idList("심훈",01062760147));


        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));
        petListDown.add(new downList("민재","인",17));


        setDefault();

    }

    private void setDefault() {

        listone=(ListView)findViewById(R.id.listone);
        listtwo=(ListView)findViewById(R.id.listtwo);

        customAdapter adapter = new customAdapter(peopleIdlist);

        customAdapterDown adapterDown = new customAdapterDown(petListDown);

        listone.setAdapter(adapter);
        listtwo.setAdapter(adapterDown);

    }
}
