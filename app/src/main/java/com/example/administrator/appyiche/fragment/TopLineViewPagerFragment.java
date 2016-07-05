package com.example.administrator.appyiche.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.administrator.appyiche.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopLineViewPagerFragment extends BaseFragment{
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    public TopLineViewPagerFragment(){
        // Required empty public constructor
    }

    public static TopLineViewPagerFragment newInstance(String param1, String param2){
        TopLineViewPagerFragment fragment = new TopLineViewPagerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    protected int getLayoutId(){
        return R.layout.fragment_top_view_pager;
    }

    @Override
    protected void initView(){
    }

    @Override
    protected void initEnvent(){
    }

    @Override
    protected void initData(){
    }
}
