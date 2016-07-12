package com.example.administrator.androidframe.zito.frame.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.androidframe.R;
import com.example.administrator.androidframe.zito.frame.Utils.LogUtils;
import com.example.administrator.androidframe.zito.frame.model.SpecItemSpec;
import com.example.administrator.androidframe.zito.frame.model.SpecItemValue;
import com.example.administrator.androidframe.zito.frame.model.SysCategoryCat;
import com.example.administrator.androidframe.zito.frame.model.SysCategorySubclass;

import java.util.ArrayList;
import java.util.List;

import co.hkm.soltag.ColorFactory;
import co.hkm.soltag.TagContainerLayout;
import hugo.weaving.DebugLog;

/**
 * Created by Administrator on 2016/6/1.
 */
public class TagViewAdapter extends BaseAdapter {

    private Context context;
    private List<SpecItemSpec> mList;
    private List<SpecItemValue> mSysCate;

    public TagViewAdapter(Context context, List<SpecItemSpec> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder=null;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.adapter_tagview,null,false);
            mViewHolder=new ViewHolder();
            mViewHolder.tv_tagview_list= (TextView) convertView.findViewById(R.id.tv_tagview_list);
            mViewHolder.mTagContainerLayout= (TagContainerLayout) convertView.findViewById(R.id.tl_tagview_la);
            convertView.setTag(mViewHolder);
        }else{
            mViewHolder= (ViewHolder) convertView.getTag();
        }

        mViewHolder.tv_tagview_list.setText(mList.get(position).getItemSpecName()+"");
        List<String> list=new ArrayList<String>();
        mSysCate=mList.get(position).getSpecItemValue();
        for(int i=0;i<mSysCate.size();i++){
            list.add(mSysCate.get(i).getItemSpecVal());
        }
        LogUtils.d("wocoa",list+"");
        mViewHolder.mTagContainerLayout.setTheme(ColorFactory.PURE_CYAN);
        mViewHolder.mTagContainerLayout.setBackgroundColor(Color.WHITE);
        mViewHolder.mTagContainerLayout.setTagTextDirection(View.TEXT_DIRECTION_ANY_RTL);
        mViewHolder.mTagContainerLayout.setTag(1,"work");
        LogUtils.d("wocoa",mViewHolder.mTagContainerLayout.getTag()+"");
        return convertView;
    }
    public class ViewHolder{
        TextView tv_tagview_list;
        TagContainerLayout mTagContainerLayout;
    }


}
