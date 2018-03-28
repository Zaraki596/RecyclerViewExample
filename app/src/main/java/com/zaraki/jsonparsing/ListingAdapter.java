package com.zaraki.jsonparsing;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

/**
 * Created by hp on 19-03-2018.
 */

public class ListingAdapter extends RecyclerView.Adapter<ListingAdapter.ListViewHolder> {

    private UserModel[] data;
    private Context context;
    public ListingAdapter(Context context, UserModel[] data){
        this.context = context;
        this.data = data;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_view_design, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        final UserModel userModel = data[position];
        holder.txtTitle.setText(userModel.getLogin());
        Glide.with(holder.imgIcon.getContext()).load(userModel.getAvatarUrl()).into(holder.imgIcon);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, userModel.getLogin(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{

        ImageView imgIcon;
        TextView txtTitle;
        public ListViewHolder(View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.UsrImg);
            txtTitle = itemView.findViewById(R.id.UsrTitle);
        }
    }
}
