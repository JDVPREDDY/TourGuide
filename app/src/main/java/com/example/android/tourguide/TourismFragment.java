package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TourismFragment extends Fragment {


    public TourismFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<item> items = new ArrayList<item>();
        items.add(new item(R.string.tourism_one, R.string.tour_add_one, R.drawable.sarovaram));
        items.add(new item(R.string.tourism_two, R.string.tourism_add_two, R.drawable.parazhi));
        items.add(new item(R.string.tourism_three, R.string.tourism_add_three, R.drawable.moidu));
        items.add(new item(R.string.tourism_four, R.string.tourism_add_four, R.drawable.kirtads));


        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_tourism);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
