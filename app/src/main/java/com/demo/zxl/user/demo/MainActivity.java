package com.demo.zxl.user.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.demo.zxl.user.demo.base.BaseActivity;
import com.demo.zxl.user.demo.base.BasePresenter;
import com.demo.zxl.user.demo.f2_system.SystemActivity;
import com.demo.zxl.user.demo.f3_video.VideoAvtivity;
import com.demo.zxl.user.demo.f4_viewpager.ViewPagerActivity;
import com.demo.zxl.user.demo.f5_gridlayout.GridActivity;
import com.demo.zxl.user.demo.toast.RunActivity;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_run).setOnClickListener(this);
        findViewById(R.id.tv_system).setOnClickListener(this);
        findViewById(R.id.tv_video).setOnClickListener(this);
        findViewById(R.id.tv_viewpager).setOnClickListener(this);
        findViewById(R.id.tv_gride).setOnClickListener(this);

    }

    @Override
    public BasePresenter createPresenter() {
        return null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_run:
                Intent intent = new Intent(this, RunActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_system:
                Intent intent1 = new Intent(this, SystemActivity.class);
                startActivity(intent1);
                break;
            case R.id.tv_video:
                Intent intent2 = new Intent(this, VideoAvtivity.class);
                startActivity(intent2);
                break;
            case R.id.tv_viewpager:
                Intent intent3 = new Intent(this, ViewPagerActivity.class);
                startActivity(intent3);
                break;
            case R.id.tv_gride:
                Intent intent4 = new Intent(this, GridActivity.class);
                startActivity(intent4);
                break;

        }
    }
}
