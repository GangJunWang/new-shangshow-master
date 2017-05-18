package com.shangshow.showlive.controller.hotvideoexcel;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.shangshow.showlive.R;
import com.shangshow.showlive.base.BaseActivity;
import com.shangshow.showlive.controller.adapter.HotVideoAdapter;
import com.shangshow.showlive.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class HotVideo extends BaseActivity {


    private UserModel userModel;
    private List<Object> data = new ArrayList<>();

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_hot_video;
    }

    @Override
    protected void bindEven() {

    }

    @Override
    protected void setView() {

    }

    @Override
    protected void initWidget() {
        userModel = new UserModel(this);
        super.initWidget();
        titleBarView.initCenterTitle("视频列表");
        titleBarView.getCenterTitle().setTextColor(getResources().getColor(R.color.a1_color));
        initData();
        initView();
    }

    private void initView() {

        RecyclerView hot_list_recyclerview = (RecyclerView) findViewById(R.id.hot_list_recyclerview);
        hot_list_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        HotVideoAdapter hotVideoAdapter = new HotVideoAdapter(getBaseContext(), data, R.layout.item_commit_video);
        hot_list_recyclerview.setAdapter(hotVideoAdapter);

    }

    private void initData() {
        for (int i = 0; i < 10; i++) {
            data.add(new Object());
        }
    }
}
