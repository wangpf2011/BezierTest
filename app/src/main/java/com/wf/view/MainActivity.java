package com.wf.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wf.view.base.CustomViewActivity;
import com.wf.view.base.ViewStubActivity;
import com.wf.view.bezier.BezierCubicActivity;
import com.wf.view.bezier.BezierQuadActivity;
import com.wf.view.bezier.ChargeMonitorActivity;
import com.wf.view.bezier.PageViewActivity;
import com.wf.view.bezier.R;
import com.wf.view.bezier.WaveViewActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //自定义View
    public void customView(View view) {
        Intent intent  = new Intent(MainActivity.this, CustomViewActivity.class);
        startActivity(intent);
    }

    //二次曲线
    public void bezierQuad(View view) {
        Intent intent  = new Intent(MainActivity.this, BezierQuadActivity.class);
        startActivity(intent);
    }

    //三次曲线
    public void bezierCubic(View view) {
        Intent intent  = new Intent(MainActivity.this, BezierCubicActivity.class);
        startActivity(intent);
    }

    //水纹波动
    public void waveView(View view) {
        Intent intent  = new Intent(MainActivity.this, WaveViewActivity.class);
        startActivity(intent);
    }

    //车辆充电效果
    public void chargeMonitor(View view) {
        Intent intent  = new Intent(MainActivity.this, ChargeMonitorActivity.class);
        startActivity(intent);
    }

    //翻页效果
    public void pageView(View view) {
        Intent intent  = new Intent(MainActivity.this, PageViewActivity.class);
        startActivity(intent);
    }

    //界面优化ViewStub
    public void viewStub(View view) {
        Intent intent  = new Intent(MainActivity.this, ViewStubActivity.class);
        startActivity(intent);
    }
}
