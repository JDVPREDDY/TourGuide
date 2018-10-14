package com.example.android.tourguide;

public class item {

    int mImageId;
    int mNameId;
    int mAddressId;

    public item (int nameId,int addressId,int imageId ){
        mAddressId = addressId;
        mImageId =imageId;
        mNameId = nameId;
    }

    public int getImageId(){ return mImageId;}
    public int getNameId(){ return mNameId;}
    public int getAddressId(){return mAddressId;}

}
