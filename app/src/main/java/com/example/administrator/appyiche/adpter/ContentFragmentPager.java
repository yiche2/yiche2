package com.example.administrator.appyiche.adpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.administrator.appyiche.fragment.TopLineViewPagerFragment;

import java.util.List;

/**
 * Created by Administrator on 2016/7/4.
 */
public class ContentFragmentPager extends FragmentPagerAdapter{
    private List<TopLineViewPagerFragment> topViewPagerFragments;
    String [] titles = {"要闻","说车","图片","视频","推荐","新车","评测","导购"};
    public ContentFragmentPager(FragmentManager fm,List<TopLineViewPagerFragment> topViewPagerFragments){
        super(fm);
        this.topViewPagerFragments = topViewPagerFragments;
    }

    @Override
    public Fragment getItem(int position){
        return topViewPagerFragments.get(position);
    }

    @Override
    public int getCount(){
        return topViewPagerFragments.size()!=0?topViewPagerFragments.size():0;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return titles[position];
    }
}
