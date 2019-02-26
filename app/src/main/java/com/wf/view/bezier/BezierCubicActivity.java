package com.wf.view.bezier;

import android.os.Bundle;

/**
 * 二次贝塞尔曲线，拖动效果
 * Created by wangpf
 * Created at 2019/2/26 21:33
 */
public class BezierCubicActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beziercubic);
        pageName = "BezierQuadActivity";
    }
}
