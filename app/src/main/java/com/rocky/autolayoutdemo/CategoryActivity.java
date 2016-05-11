package com.rocky.autolayoutdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.zhy.autolayout.AutoLayoutActivity;
import com.rocky.autolayoutdemo.fragment.SimpleFragment;

public class CategoryActivity extends AutoLayoutActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private String[] mTabTitles = new String[]
            {"单个UI", "正方形"};


    @Override
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.zhy.sample.R.layout.activity_category);


        mTabLayout = (TabLayout) findViewById(com.zhy.sample.R.id.id_tablayout);
        mViewPager = (ViewPager) findViewById(com.zhy.sample.R.id.id_viewpager);

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return new SimpleFragment();
            }

            @Override
            public CharSequence getPageTitle(int position) {

                return mTabTitles[position];
            }

            @Override
            public int getCount() {
                return mTabTitles.length;
            }
        });


        mTabLayout.setupWithViewPager(mViewPager);
    }

}
