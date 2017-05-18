package com.shangshow.showlive.controller.hotvideoexcel;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.shangshow.showlive.R;
import com.shangshow.showlive.base.BaseActivity;
import com.shangshow.showlive.common.model.ImageInfo;
import com.shangshow.showlive.controller.adapter.HotmannlerAdapter;
import com.shangshow.showlive.model.UserModel;
import com.shangshow.showlive.model.callback.Callback;

import java.util.ArrayList;
import java.util.List;

public class HotMannler extends BaseActivity {


    private RecyclerView hot_recyclerview;
    private List<Object> data = new ArrayList<>();
    private HotmannlerAdapter hotmannlerAdapter;
    private UserModel userModel;
    private List<ImageInfo> imageInfos = new ArrayList<ImageInfo>();

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_hot_mannler;
    }

    @Override
    protected void bindEven() {

    }

    @Override
    protected void setView() {

    }

    @Override
    protected void initWidget() {
        super.initWidget();
        userModel = new UserModel(getBaseContext());
        titleBarView.initCenterTitle("热门分类");
        //设置字体颜色
        titleBarView.getCenterTitle().setTextColor(getResources().getColor(R.color.a1_color));
        initData();
        initView();
    }

    private void initData() {

        userModel.getPGCVideoType(new Callback<List<ImageInfo>>() {
            @Override
            public void onSuccess(List<ImageInfo> datas) {
                imageInfos.addAll(datas);
                hotmannlerAdapter.addAll(datas);
                hotmannlerAdapter.notifyDataSetHasChanged();
            }

            @Override
            public void onFailure(int resultCode, String message) {

            }
        });
    }
    private void initView() {
        hot_recyclerview = (RecyclerView) findViewById(R.id.hot_recyclerview);
        hot_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        hotmannlerAdapter = new HotmannlerAdapter(getBaseContext(), imageInfos, R.layout.image_info_layout);
        hot_recyclerview.setAdapter(hotmannlerAdapter);
    }
}
