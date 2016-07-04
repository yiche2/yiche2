package com.example.administrator.appyiche.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/7/4.
 */
public class BaseFragment extends Fragment{

    public BaseFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        // Inflate the layout for this fragment
        return inflater.inflate(getLayoutId(), container, false);
    }

    public int getLayoutId(){
        return 0;
    }
}
