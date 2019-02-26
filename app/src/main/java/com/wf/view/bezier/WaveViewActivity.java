package com.wf.view.bezier;

import android.os.Bundle;

/**
 * 贝塞尔水纹波动效果
 *
 * Created by wangpf
 * Created at 2018/9/17 15:20
 */
public class WaveViewActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waveview);
        pageName = "WaveViewActivity";

        WaveView waveView = (WaveView)findViewById(R.id.waveView);
        waveView.startAnimation();
    }
}
