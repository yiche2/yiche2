package com.example.administrator.appyiche.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.administrator.appyiche.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopLineFragment extends BaseFragment{
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TopLineFragment(){
        // Required empty public constructor
    }

    public static TopLineFragment newInstance(String param1, String param2){
        TopLineFragment fragment = new TopLineFragment();
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
    public int getLayoutId(){
        return R.layout.topline_fragment;
    }
}
