package com.example.mywhatsup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;

public class AppAdapter extends RecyclerView.Adapter <AppAdapter.ViewHolderAdapter> {

    ArrayList<ChatCard> arrayList;

    public AppAdapter(ArrayList<ChatCard> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolderAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderAdapter(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_chat_card,null,false)) {
        };
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAdapter holder, int position) {

        ChatCard card = arrayList.get(position);
        holder.card_name.setText(card.getName());
        holder.message.setText(card.getMessage());
    }

    @Override
    public int getItemCount() {
      return   arrayList.size();
    }


    public class ViewHolderAdapter extends RecyclerView.ViewHolder{

      TextView card_name;
      TextView message;

      public ViewHolderAdapter(@NonNull View itemView){

          super(itemView);
          card_name=itemView.findViewById(R.id.card_name);
          message=itemView.findViewById(R.id.card_message);

        }

    }
}
