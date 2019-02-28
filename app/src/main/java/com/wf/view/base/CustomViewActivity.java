package com.wf.view.base;

import android.os.Bundle;

import com.wf.view.bezier.BaseActivity;
import com.wf.view.bezier.R;

/**
 * 自定义View
 * Created by wang on 2019/2/28.
 */

public class CustomViewActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customview);
        pageName = "CustomViewActivity";
    }
}
