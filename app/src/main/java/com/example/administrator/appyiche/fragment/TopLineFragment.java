package com.example.administrator.appyiche.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.administrator.appyiche.R;
import com.example.administrator.appyiche.adpter.ContentFragmentPager;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopLineFragment extends BaseFragment{

    private List<TopLineViewPagerFragment> topViewPagerFragments;

    private TabLayout topLineTableLayout;
    private ViewPager topLineViewPager;

    public TopLineFragment(){
        // Required empty public constructor
    }

    @Override
    protected int getLayoutId(){
        return R.layout.fragment_topline_layout;
    }

    @Override
    protected void initView(){
        topLineViewPager = (ViewPager) getView().findViewById(R.id.topline_ViewPager);
        topLineTableLayout = (TabLayout) getView().findViewById(R.id.topline_tableLayout);
        topViewPagerFragments = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            TopLineViewPagerFragment topViewPagerFragment = TopLineViewPagerFragment.newInstance("", "");
            topViewPagerFragments.add(topViewPagerFragment);
        }
        ContentFragmentPager contentFragmentPager = new ContentFragmentPager(getActivity().getSupportFragmentManager(),topViewPagerFragments);
        topLineViewPager.setAdapter(contentFragmentPager);
        topLineTableLayout.setupWithViewPager(topLineViewPager);
    }

    @Override
    protected void initEnvent(){
    }

    @Override
    protected void initData(){
    }
}
