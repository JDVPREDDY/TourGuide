package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new TourismFragment();
        }else if(position==1){
            return new ShoppingFragment();
        }else if(position==2){
            return new EateryFragment();
        }else {
            return new EventsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_tourism);
        } else if (position == 1) {
            return mContext.getString(R.string.category_shopping);
        } else if (position==2){
            return mContext.getString(R.string.category_eatery);
        }else {
            return mContext.getString(R.string.category_events);
        }
    }
}
