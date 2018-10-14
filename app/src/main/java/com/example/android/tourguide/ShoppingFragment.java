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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.item_list, container, false);

            final ArrayList<item> items = new ArrayList<item>();
            items.add(new item(R.string.sh_one, R.string.sh_a_one, R.drawable.hilite));
            items.add(new item(R.string.sh_two, R.string.sh_a_two, R.drawable.focus));
            items.add(new item(R.string.sh_three, R.string.sh_a_three, R.drawable.emarald));
            items.add(new item(R.string.sh_four, R.string.sh_a_four, R.drawable.raymond));


            ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_shopping);
            ListView listView = rootView.findViewById(R.id.list);
            listView.setAdapter(adapter);
            return rootView;
        }
}