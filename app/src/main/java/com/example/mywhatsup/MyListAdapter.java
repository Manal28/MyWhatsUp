package com.example.mywhatsup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter {

    Context context;
    ArrayList<MyContact> arr ;

    public MyListAdapter (Context context, ArrayList <MyContact>arrayList){
        super(context,R.layout.calls_item);
        this.arr=arrayList;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View numView = inflater.inflate(R.layout.calls_item,parent,false);
        TextView text1 = (TextView) numView .findViewById(R.id.name_tv1);
        TextView text2= (TextView) numView .findViewById(R.id.num_tv2);
        ImageView image = (ImageView)numView.findViewById(R.id.image_id);


        text1.setText(arr.get(position).getName());
        text2.setText(arr.get(position).getNumber());
        image .setImageResource(arr.get(position).getImage());

        return numView ;
    }

}
