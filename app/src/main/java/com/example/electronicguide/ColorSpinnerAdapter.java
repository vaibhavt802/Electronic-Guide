package com.example.electronicguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorSpinnerAdapter extends ArrayAdapter<ColorSpinnerItem> {

    public ColorSpinnerAdapter(Context context, ArrayList<ColorSpinnerItem> colorList){

        super(context,0,colorList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    private View initView(int position,View convertView, ViewGroup parent){

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.color_spinner_row,parent,false
            );
        }

        ImageView imageView=convertView.findViewById(R.id.imgcolor);
        TextView textView=convertView.findViewById(R.id.txtcolor);

        ColorSpinnerItem colorSpinnerItem=getItem(position);

        if(colorSpinnerItem!=null){
            imageView.setImageResource(colorSpinnerItem.getColorImage());
            textView.setText(colorSpinnerItem.getColorName());
        }



        return convertView;
    }
}
