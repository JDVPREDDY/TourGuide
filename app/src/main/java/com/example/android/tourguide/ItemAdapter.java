package com.example.android.tourguide;

import android.content.ClipData;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<item> {

    private int mColorResourceId;

    public ItemAdapter(Context context, ArrayList<item> items, int colorResourceId) {
        super(context, 0, items);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        item currentItem = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentItem.getNameId());

        TextView addressTV = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTV.setText(currentItem.getAddressId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
            imageView.setImageResource(currentItem.getImageId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
