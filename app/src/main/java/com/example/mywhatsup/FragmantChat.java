package com.example.mywhatsup;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmantChat extends Fragment {

Context context;
View chatView ;



    RecyclerView chatRecyclerView;
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
    ArrayList<ChatCard> arr = new ArrayList<>();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        chatView=inflater.inflate(R.layout.fragmant_chat,container,false);
        chatRecyclerView=chatView.findViewById(R.id.chat_id);
        chatRecyclerView.setHasFixedSize(true);
        chatRecyclerView.setLayoutManager(layoutManager);
        addArrayList();
        AppAdapter adapter =new AppAdapter(arr);
        chatRecyclerView.setAdapter(adapter);
        return chatView;
    }

    public void addArrayList(){

        arr.add(new ChatCard("Manal","Hi"));
        arr.add(new ChatCard("Maryam","Yaaaaaaaa"));
        arr.add(new ChatCard("Maha","Realy"));
        arr.add(new ChatCard("Aya","No"));
        arr.add(new ChatCard("Ahmad","Thanks"));
        arr.add(new ChatCard("Heba","Happy birth day"));
        arr.add(new ChatCard("Radwa","Happy new year"));
        arr.add(new ChatCard("Manal","Hi"));
        arr.add(new ChatCard("Manal","Hi"));
        arr.add(new ChatCard("Manal","Hi"));


    }

}
