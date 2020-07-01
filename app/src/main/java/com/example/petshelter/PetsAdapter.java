package com.example.petshelter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.List;

public class PetsAdapter extends ArrayAdapter<PetAttributes> {

    List<PetAttributes> mAttributesList;
    Context context;

    public PetsAdapter(Context context, List<PetAttributes> objects) {
        super(context, 0, objects);
        mAttributesList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        try {

            if (convertView == null || convertView.getTag() == null) {
                convertView = LayoutInflater.from(getContext()).
                        inflate(R.layout.pets_adapter_layout, parent, false);

                holder = new ViewHolder();
                holder.petName = (TextView) convertView.findViewById(R.id.petName);
                holder.petBreed = (TextView) convertView.findViewById(R.id.petBreed);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.petName.setText(mAttributesList.get(position).getName());
            holder.petBreed.setText(mAttributesList.get(position).getBreed());
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }

        return convertView;
    }

    private static class ViewHolder{
        TextView petName;
        TextView petBreed;
    }
}
