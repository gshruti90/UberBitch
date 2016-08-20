package com.gargdaughters.uberbitch;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by M1036631 on 01-Aug-16.
 */
public class HomePagerAdapter extends FragmentPagerAdapter {

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new HomeFragment();
            case 1: return new UserProfileFragment();
            case 2: return  new DesignFragment();
            case 3: return new BillFragment();
            case 4:return  new SettingFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

   /* @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0: return "Home";
            case 1:return "Profile";
            case 2: return "Design";
            case 3: return "Bill";
            case 4:return "Settings";
        }
        return "";
    }*/

}
