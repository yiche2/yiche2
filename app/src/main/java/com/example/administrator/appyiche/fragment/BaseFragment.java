package com.example.administrator.appyiche.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/7/4.
 */
public abstract class BaseFragment extends Fragment{
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(getLayoutId(), container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        initView();
        initEnvent();
        initData();
    }

    /**
    *得到布局文件的ID
     */
    protected abstract int getLayoutId();

    /**
     * 初始化布局里的控件
     */
    protected abstract void initView();

    /**
     * 监听事件
     */
    protected abstract void initEnvent();

    /**
     * 初始化数据
     */
    protected abstract void initData();
}
