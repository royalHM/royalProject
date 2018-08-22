package koohi.koohi.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import koohi.koohi.BlankFragment;
import layout.BlankFragment1;
import layout.BlankFragment2;

public class View_pager_Adapter extends FragmentStatePagerAdapter {


    public View_pager_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        if (position == 0)
            fragment = new BlankFragment1();
        else
            fragment = new BlankFragment2();

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
