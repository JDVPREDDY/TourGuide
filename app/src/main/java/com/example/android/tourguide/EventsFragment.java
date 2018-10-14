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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<item> items = new ArrayList<item>();
        items.add(new item(R.string.even_one, R.string.even_a_one, R.drawable.tathva));
        items.add(new item(R.string.even_two, R.string.even_a_two, R.drawable.tarang));
        items.add(new item(R.string.even_three, R.string.even_a_three, R.drawable.ragam));
        items.add(new item(R.string.even_four, R.string.even_a_four, R.drawable.hilife));


        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_events);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
