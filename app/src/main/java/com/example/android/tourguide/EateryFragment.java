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
public class EateryFragment extends Fragment {


    public EateryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<item> items = new ArrayList<item>();
        items.add(new item(R.string.e_one, R.string.e_a_one, R.drawable.kigsb));
        items.add(new item(R.string.e_two, R.string.e_a_two, R.drawable.garlicr));
        items.add(new item(R.string.e_three, R.string.e_a_three, R.drawable.mgrill));
        items.add(new item(R.string.e_four, R.string.e_a_four, R.drawable.hotels));


        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_eatery);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
