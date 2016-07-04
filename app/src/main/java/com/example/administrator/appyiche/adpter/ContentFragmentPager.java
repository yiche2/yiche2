package com.example.administrator.appyiche.adpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.administrator.appyiche.fragment.TopLineFragment;

import java.util.List;

/**
 * Created by Administrator on 2016/7/4.
 */
public class ContentFragmentPager extends FragmentPagerAdapter{
    List<TopLineFragment> topLineFragments;
    String [] titles = {"要闻","说车","图片","视频","推荐","新车","评测","导购"};
    public ContentFragmentPager(FragmentManager fm,List<TopLineFragment> topLineFragments){
        super(fm);
        this.topLineFragments = topLineFragments;
    }

    @Override
    public Fragment getItem(int position){
        return topLineFragments.get(position);
    }

    @Override
    public int getCount(){
        return topLineFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return titles[position];
    }
}
