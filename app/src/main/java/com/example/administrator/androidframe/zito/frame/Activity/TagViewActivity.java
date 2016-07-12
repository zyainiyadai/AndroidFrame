package com.example.administrator.androidframe.zito.frame.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.example.administrator.androidframe.R;
import com.example.administrator.androidframe.zito.frame.Adapter.TagViewAdapter;
import com.example.administrator.androidframe.zito.frame.Dto.GsonResult;
import com.example.administrator.androidframe.zito.frame.Utils.JsonUtils;
import com.example.administrator.androidframe.zito.frame.Utils.LogUtils;
import com.example.administrator.androidframe.zito.frame.model.SpecItemSpec;
import com.example.administrator.androidframe.zito.frame.model.SpecItemValue;
import com.example.administrator.androidframe.zito.frame.model.SysCategoryCat;
import com.example.administrator.androidframe.zito.frame.model.SysCategorySubclass;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

import co.hkm.soltag.TagContainerLayout;
import hugo.weaving.DebugLog;

@ContentView(R.layout.activity_tag_view)
public class TagViewActivity extends AppCompatActivity {

    @ViewInject(R.id.lv_tagview_standard)
    private ListView lv_tagview_standard;
    private GsonResult gsonResult;
    private  List<SpecItemSpec> mSysCat;
    private TagViewAdapter mTagViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        initDate();
    }

    private void initDate() {
        String mUrl="http://10.10.50.69:8080/wghvipService/detail/item_itemDetails";
        RequestParams mRequestParams=new RequestParams(mUrl);
        mRequestParams.addBodyParameter("itemId","20724");
        x.http().post(mRequestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.d("Tagviewt",result);
                gsonResult= JsonUtils.object(result,GsonResult.class);
                mSysCat=gsonResult.getSpecItemSpecs();
                System.out.print("Tagviewt"+mSysCat);
                lv_tagview_standard.setAdapter(new TagViewAdapter(TagViewActivity.this,mSysCat));
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {
                LogUtils.d("Taglist",mSysCat+"");
                LogUtils.d("Taglist","work");
            }
        });
    }
}
