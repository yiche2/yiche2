package com.example.administrator.appyiche;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.RadioGroup;

import com.example.administrator.appyiche.adpter.ContentFragmentPager;
import com.example.administrator.appyiche.fragment.TopLineFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity{

    private ViewPager contentViewPager;
    private RadioGroup contentRadioGroup;
    private TabLayout contentTabLayouy;
    private List<TopLineFragment> topLineFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVieW();
    }

    private void initVieW(){
        contentViewPager = (ViewPager) findViewById(R.id.content_viewPager);
        contentRadioGroup = (RadioGroup) findViewById(R.id.content_radioGroup);
        contentTabLayouy = (TabLayout) findViewById(R.id.content_tableLayout);
        initTopLineFragment();
        Log.d("MainActivity", "topLineFragments.size():" + topLineFragments.size());
        ContentFragmentPager contentFragmentPager = new ContentFragmentPager(getSupportFragmentManager(), topLineFragments);
        //设置适配器
        contentViewPager.setAdapter(contentFragmentPager);
        //contentTabLayouy和contentViewPager相互关联
        contentTabLayouy.setupWithViewPager(contentViewPager);
    }

    //初始化Fragment
    private void initTopLineFragment(){
        topLineFragments = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            TopLineFragment topLineFragment1 = TopLineFragment.newInstance("", "");
            topLineFragments.add(topLineFragment1);
        }
    }
}
