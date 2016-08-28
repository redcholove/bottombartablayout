package com.example.redcholove.bottombar.MainFragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redcholove.bottombar.R;
import com.example.redcholove.bottombar.FoodFragment.ADFragment;
import com.example.redcholove.bottombar.FoodFragment.CategoryShopFragment;
import com.example.redcholove.bottombar.FoodFragment.HotShopFragment;

/**
 * Created by redcholove on 2016/8/24.
 */
public class FoodFragment extends Fragment {


    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.food, container, false);


        viewPager = (ViewPager) v.findViewById(R.id.viewPager);
        viewPager.setAdapter(new CustomAdapter(getChildFragmentManager(),
                getContext()));
        tabLayout = (TabLayout) v.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
        });

        return v;
    }
        private class CustomAdapter extends FragmentPagerAdapter {

            private String fragments [] = {"分類版","熱門餐廳","近期活動"};

            public CustomAdapter(FragmentManager supportFragmentManager,
                                 Context applicationContext) {
                super(supportFragmentManager);
            }

            @Override
            public Fragment getItem(int position) {
                switch (position){
                    case 0:
                        return new CategoryShopFragment();

                    case 1:
                        return new HotShopFragment();

                    case 2:
                        return new ADFragment();

                    default:
                        return null;
                }
            }

            @Override
            public int getCount() {
                return fragments.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return fragments[position];

            }
        }



    }


