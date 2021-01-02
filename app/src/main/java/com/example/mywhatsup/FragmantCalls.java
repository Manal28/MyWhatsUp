package com.example.mywhatsup;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmantCalls extends Fragment {


  public FragmantCalls (){

  }

    Context context ;
    View callsView;
    ArrayList<MyContact> arr = new ArrayList<>();
    ListView list ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        callsView=inflater.inflate(R.layout.fragmant_calls,container,false);
        list=callsView.findViewById(R.id.calls_id);
        addArray();
       MyListAdapter adapter =new MyListAdapter(context,arr);
        list.setAdapter(adapter);
        return callsView;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;

    }


    public  void addArray (){

        arr.add(new MyContact("Manal Hamada","123450074",R.raw.call_icon));
        arr.add(new MyContact("Maryam rady","123450074",R.raw.call_icon));
        arr.add(new MyContact("Heba Ayman","123450074",R.raw.call_icon));
        arr.add(new MyContact("Hany Ahmad","123450074",R.raw.call_icon));
        arr.add(new MyContact("Aya Mohammed","123450074",R.raw.call_icon));
        arr.add(new MyContact("Sara Magdy","123450074",R.raw.call_icon));


}

}
