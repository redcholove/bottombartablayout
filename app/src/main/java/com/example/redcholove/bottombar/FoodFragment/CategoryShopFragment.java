package com.example.redcholove.bottombar.FoodFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redcholove.bottombar.R;

/**
 * Created by redcholove on 2016/8/28.
 */
public class CategoryShopFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.categoryshopfragment, container, false);
    }
}
