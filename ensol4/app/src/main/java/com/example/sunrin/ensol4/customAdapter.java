package com.example.sunrin.ensol4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sunrin on 2016-12-22.
 */
public class customAdapter extends BaseAdapter {

    private List<idList> idlist1;

    public customAdapter(List<idList> peopleIdlist) {
        this.idlist1=peopleIdlist;
    }

    @Override
    public int getCount() {
        return idlist1.size();
    }

    @Override
    public Object getItem(int position) {
        return idlist1.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.uplist,null);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageV);
        TextView textViewName = (TextView)view.findViewById(R.id.nameTv);
        TextView textViewPhone = (TextView)view.findViewById(R.id.phoneTv);

        idList idList=idlist1.get(position);
        String name = String.valueOf(idList.getPhone());
        String phone = idList.getName();

        textViewName.setText(name);
        textViewPhone.setText(phone);

        return view;
    }
}
