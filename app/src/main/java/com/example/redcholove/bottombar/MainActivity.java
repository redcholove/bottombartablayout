package com.example.redcholove.bottombar;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.redcholove.bottombar.MainFragment.DrinkFragment;
import com.example.redcholove.bottombar.MainFragment.FoodFragment;
import com.example.redcholove.bottombar.MainFragment.LocationFragment;
import com.example.redcholove.bottombar.MainFragment.TurnTable;
import com.example.redcholove.bottombar.MainFragment.UserFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {

    BottomBar bottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomBar = BottomBar.attach(this, savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.Buttombaritemone)
                {
                    FoodFragment f = new FoodFragment();
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.frame, f).commit();
                }else

                if (i == R.id.Buttombaritemtwo)
                {
                    DrinkFragment f = new DrinkFragment();
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.frame, f).commit();
                }else

                if (i == R.id.Buttombaritemthree)
                {
                    TurnTable f = new TurnTable();
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.frame, f).commit();
                }else

                if (i == R.id.Buttombaritemfour)
                {
                    LocationFragment f = new LocationFragment();
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.frame, f).commit();
                }else
                if (i == R.id.Buttombaritemfive)
                {
                    UserFragment f = new UserFragment();
                    getSupportFragmentManager().beginTransaction().
                    replace(R.id.frame, f).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int i) {

            }

        });
        bottomBar.mapColorForTab(0, "#5B00AE");
        bottomBar.mapColorForTab(1, "#5B00AE");
        bottomBar.mapColorForTab(2, "#5B00AE");
        bottomBar.mapColorForTab(3, "#5B00AE");
        bottomBar.mapColorForTab(4, "#5B00AE");



        BottomBarBadge unread;
        unread = bottomBar.makeBadgeForTabAt(3,"#FF79BC",13);
        unread.show();

    }
}
