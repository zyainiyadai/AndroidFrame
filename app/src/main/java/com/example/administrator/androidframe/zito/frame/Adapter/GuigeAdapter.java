package com.example.administrator.androidframe.zito.frame.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.administrator.androidframe.R;
import com.example.administrator.androidframe.zito.frame.Diy.MyViewGroup;
import com.example.administrator.androidframe.zito.frame.model.SysCategoryCat;
import com.example.administrator.androidframe.zito.frame.model.SysCategorySubclass;

import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.logging.Handler;

/**
 * Created by Administrator on 2016/5/31.
 */
public class GuigeAdapter extends BaseAdapter {
    private Context context;
    private List<SysCategoryCat> mList;
  //  private ArrayList<HashMap<String,Object>> mList;
    private List<SysCategorySubclass> mViewList;
   // private ArrayList<HashMap<String,TextView[]>> mViewList;
    private Drawable mDrawableNormal;
    private Drawable mDrawablePressed;
    private Handler mHandler;

    //用于保存用户的属性集合
    private HashMap<String,String> mSelectProMap=new HashMap<String,String>();

    public HashMap<String, String> getmSelectProMap() {
        return mSelectProMap;
    }

    public void setmSelectProMap(HashMap<String, String> mSelectProMap) {
        this.mSelectProMap = mSelectProMap;
    }
    public GuigeAdapter(Context context, Handler mHandler, List<SysCategoryCat> mList,List<SysCategorySubclass> mViewList) {
        this.context = context;
        this.mHandler = mHandler;
        this.mList = mList;
        this.mViewList=mViewList;
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
            //获取listitem的布局
           convertView=LayoutInflater.from(this.context).inflate(R.layout.list_item,null,true);
            mViewHolder=new ViewHolder();
            convertView.setTag(mViewHolder);
        }else{
            mViewHolder= (ViewHolder) convertView.getTag();
        }

        if(this.mList!=null){
            String labers=this.mViewList.get(position).getSubName();
            String mType=mList.get(position).getCatName();
            mViewHolder.tv_ProList.setText(mType);//规格名称
            //动态加载布局
            //判断布局中的子控件是否为0，如果不为0，就不添加了，防止ListView滚动时重复添加
            if(mViewHolder.myViewGroup.getChildCount()==0){
                TextView[] tv_list=new TextView[mList.size()];
                for (int i=0;i<mList.size();i++){
                    TextView tv_view=new TextView(context);
                    tv_view.setGravity(17);
                    tv_view.setPadding(25,15,25,15);
                    tv_list[i]=tv_view;
                    tv_list[i].setBackgroundColor(Color.WHITE);
                    tv_list[i].setText(mViewList.get(i)+"");
                    tv_list[i].setTag(i);
                    mViewHolder.myViewGroup.addView(tv_list[i]);
                }
                //绑定标签的监听事件
                for(int j=0;j<tv_list.length;j++){
                    tv_list[j].setTag(tv_list);
                    tv_list[j].setOnClickListener(new LableClickListener(mType));
                }
            }
            if(mSelectProMap.get(mType)!=null){
                    for(int m=0;m<mViewHolder.myViewGroup.getChildCount();m++){
                        TextView tv_show= (TextView) mViewHolder.myViewGroup.getChildAt(m);
                        if(mSelectProMap.get(mType).equals(tv_show.getText().toString())){
                            tv_show.setBackgroundColor(Color.parseColor("#EE5500"));
                            tv_show.setTextColor(Color.parseColor("#FFFFFF"));
                            mSelectProMap.put(mType,tv_show.getText().toString());
                        }
                    }
            }

        }

        return convertView;
    }
    public class ViewHolder{
        @ViewInject(R.id.tv_item_guige)
        TextView tv_ProList;
        LinearLayout mLinearLayout;
        @ViewInject(R.id.my_view_group)
        MyViewGroup myViewGroup;
        TableLayout tl_ProLayout;
    }
    class LableClickListener implements View.OnClickListener {
        private String type;
        public LableClickListener(String type){
            this.type=type;
        }

        @Override
        public void onClick(View v) {
            TextView[] textViews=(TextView[])v.getTag();
            TextView tv=(TextView)v;
            for(int i=0;i<textViews.length;i++){
                //让点击的标签背景变成橙色，字体颜色变为白色
                if(tv.equals(textViews[i])){
                    textViews[i].setBackgroundColor(Color.parseColor("#EE5500"));
                    textViews[i].setTextColor(Color.parseColor("#FFFFFF"));
                    mSelectProMap.put(type, textViews[i].getText().toString());
                }else{
                    //其他标签背景变成白色，字体颜色为黑色
                    //textViews[i].setBackgroundDrawable(drawableNormal);
                   // textViews[i].setBackgroundResource();
                    textViews[i].setBackgroundColor(Color.WHITE);
                    textViews[i].setTextColor(Color.parseColor("#000000"));
                }
            }

        }

    }
}
