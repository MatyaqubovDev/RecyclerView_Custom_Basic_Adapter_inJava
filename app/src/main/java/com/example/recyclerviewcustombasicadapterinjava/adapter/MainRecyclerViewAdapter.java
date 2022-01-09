package com.example.recyclerviewcustombasicadapterinjava.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcustombasicadapterinjava.R;
import com.example.recyclerviewcustombasicadapterinjava.model.Member;

import java.util.ArrayList;

public class MainRecyclerViewAdapter extends RecyclerView.Adapter<MainRecyclerViewAdapter.ViewHolder> {

    ArrayList<Member> members;

    public MainRecyclerViewAdapter(ArrayList<Member> members) {
        this.members = members;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Member member = members.get(position);
        holder.callImageView.setImageResource(member.getPhoneImage());
        holder.personImageView.setImageResource(member.getImage());
        holder.nameTextView.setText(member.getName());
        holder.phoneNumberTextView.setText(member.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return members.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        View view;

        ImageView personImageView;
        TextView nameTextView ;
        TextView phoneNumberTextView ;
        ImageView callImageView ;

        public ViewHolder(View view) {
            super(view);

            this.personImageView = view.findViewById(R.id.img_photo);
            this.nameTextView = view.findViewById(R.id.tv_name);
            this.phoneNumberTextView = view.findViewById(R.id.tv_phone_number);
            this.callImageView = view.findViewById(R.id.img_phone);
            this.view = view;
        }
    }
}
