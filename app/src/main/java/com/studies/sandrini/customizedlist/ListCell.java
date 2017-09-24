package com.studies.sandrini.customizedlist;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sandrini on 24/09/2017.
 */

public class ListCell extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] soda;
    private final Integer[] imageId;

    public ListCell(Activity context, String[] soda, Integer[] imageId) {
        super(context, R.layout.list_cell, soda);
        this.context = context;
        this.soda = soda;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_cell, null,true);
        TextView sodaName = (TextView) rowView.findViewById(R.id.txt);
        ImageView sodaImage = (ImageView) rowView.findViewById(R.id.img);
        sodaName.setText(soda[position]);
        sodaImage.setImageResource(imageId[position]);
        return rowView;
    }
}
