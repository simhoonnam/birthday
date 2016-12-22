package com.example.sunrin.ensol4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Sunrin on 2016-12-22.
 */
public class customAdapterDown extends BaseAdapter{

    private List<downList> petlist;

    public customAdapterDown(List<downList> petlist) {
        this.petlist = petlist;
    }

    @Override
    public int getCount() {
        return petlist.size();
    }

    @Override
    public Object getItem(int position) {
        return petlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.downlist,null);

        TextView textViewName = (TextView)view.findViewById(R.id.petName);
        TextView textViewType = (TextView)view.findViewById(R.id.petType);
        TextView textViewAge = (TextView)view.findViewById(R.id.petAge);

        downList downList = petlist.get(position);
        String petName = downList.getPetname();
        String petType= downList.getPettype();
        String petAge = String.valueOf(downList.getPetage());

        textViewName.setText(petName);
        textViewType.setText(petType);
        textViewAge.setText(petAge);;

        return view;
    }
}
