package com.example.administrator.appyiche;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.example.administrator.appyiche.fragment.CommunityFragment;
import com.example.administrator.appyiche.fragment.MySelfFragment;
import com.example.administrator.appyiche.fragment.SelectCarFragment;
import com.example.administrator.appyiche.fragment.ServiceFragment;
import com.example.administrator.appyiche.fragment.TopLineFragment;

import java.util.List;

public class MainActivity extends BaseActivity{

    private ViewPager contentViewPager;
    private RadioGroup contentRadioGroup;
    private TabLayout contentTabLayouy;
    private List<TopLineFragment> topLineFragments;
    private FrameLayout contentFragment;
    private FragmentManager contentFragmentManager;
    private TopLineFragment topLineFragment;
    private FragmentTransaction contentfragmentTransaction;
    private Fragment[] fragments  =
    {new TopLineFragment(),new CommunityFragment(),new SelectCarFragment(),new ServiceFragment(),new MySelfFragment()};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVieW();
    }

    private void initVieW(){
        contentFragmentManager = getSupportFragmentManager();
        contentRadioGroup = (RadioGroup) findViewById(R.id.content_radioGroup);
        initFramgment();
        contentRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                int index = 0;
                switch(checkedId){
                    case R.id.content_title:
                        index=0;
                        contentfragmentTransaction = contentFragmentManager.beginTransaction();
                        contentfragmentTransaction.replace(R.id.content_FrameLayout,fragments[index]);
                        contentfragmentTransaction.show(fragments[0]);
                        contentfragmentTransaction.commit();
                        break;
                    case R.id.content_community:
                        index=1;
                        contentfragmentTransaction = contentFragmentManager.beginTransaction();
                        contentfragmentTransaction.replace(R.id.content_FrameLayout,fragments[index]);
                        contentfragmentTransaction.show(fragments[1]);
                        contentfragmentTransaction.commit();
                        break;
                    case R.id.content_selectCar:
                        index=2;
                        contentfragmentTransaction = contentFragmentManager.beginTransaction();
                        contentfragmentTransaction.replace(R.id.content_FrameLayout,fragments[index]);
                        contentfragmentTransaction.show(fragments[2]);
                        contentfragmentTransaction.commit();
                        break;
                    case R.id.content_service:
                        index=3;
                        contentfragmentTransaction = contentFragmentManager.beginTransaction();
                        contentfragmentTransaction.replace(R.id.content_FrameLayout,fragments[index]);
                        contentfragmentTransaction.replace(R.id.content_FrameLayout,fragments[index]);

                        contentfragmentTransaction.show(fragments[3]);
                        contentfragmentTransaction.commit();
                        break;
                    case R.id.content_myself:
                        index=4;
                        contentfragmentTransaction = contentFragmentManager.beginTransaction();
                        contentfragmentTransaction.replace(R.id.content_FrameLayout,fragments[index]);
                        contentfragmentTransaction.replace(R.id.content_FrameLayout,fragments[4]);
                        contentfragmentTransaction.show(fragments[4]);
                        contentfragmentTransaction.commit();
                        break;
                }
            }
        });
    }
    //把fragment添加到布局里 并显示默认的页面
    private void initFramgment(){
        contentfragmentTransaction = contentFragmentManager.beginTransaction();
        for(int i = 0; i < fragments.length ; i++){
            Fragment fragment = fragments[i];
            contentfragmentTransaction.add(R.id.content_FrameLayout,fragment);
        }
        contentfragmentTransaction.show(fragments[0]);
        contentfragmentTransaction.commit();

    }
}
