package com.example.jokesapp.view;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jokesapp.R;

import org.w3c.dom.Text;

public class FavJokeViewHolder extends RecyclerView.ViewHolder {

    private TextView txtFavJoke;
    private ImageButton imageButtonShare;

    public FavJokeViewHolder(@NonNull View itemView) {
        super(itemView);
        txtFavJoke = itemView.findViewById(R.id.txtFavJoke);
        imageButtonShare = itemView.findViewById(R.id.shareButtonFavListItem);
    }

    public TextView getTxtFavJoke() {
        return txtFavJoke;
    }

    public ImageButton getImageButtonShare() {
        return imageButtonShare;
    }
}
