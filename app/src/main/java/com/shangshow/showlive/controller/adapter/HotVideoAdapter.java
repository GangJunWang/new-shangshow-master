package com.shangshow.showlive.controller.adapter;

import android.content.Context;
import android.view.View;

import com.shaojun.widget.superAdapter.SuperAdapter;
import com.shaojun.widget.superAdapter.internal.SuperViewHolder;

import java.util.List;

/**
 * Created by 1 on 2017/5/18.
 */

public class HotVideoAdapter extends SuperAdapter<Object> {
    
    public HotVideoAdapter(Context context, List<Object> items, int layoutResId) {
        super(context, items, layoutResId);
    }

    @Override
    public void onBind(SuperViewHolder holder, int viewType, int layoutPosition, Object item) {

    }

    @Override
    public void noHolder(View convertView, int layoutPosition, Object item) {

    }
}
