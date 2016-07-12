package com.example.administrator.androidframe.zito.frame.Activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.androidframe.R;
import com.example.administrator.androidframe.zito.frame.Dto.GsonResult;
import com.example.administrator.androidframe.zito.frame.Utils.JsonUtils;
import com.example.administrator.androidframe.zito.frame.Utils.LogUtils;
import com.example.administrator.androidframe.zito.frame.model.SysCategoryCat;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import co.hkm.soltag.ColorFactory;
import co.hkm.soltag.TagContainerLayout;

@ContentView(R.layout.adapter_tagview)
public class CeshiActivity extends AppCompatActivity {
    private TagContainerLayout mTagContainerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        initDate();
    }
    private void initDate() {
        String mUrl="http://10.10.50.134:8080/scfService/home/find_firstCats";
        RequestParams mRequestParams=new RequestParams(mUrl);
        x.http().post(mRequestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
               GsonResult gsonResult= JsonUtils.object(result,GsonResult.class);
                System.out.print("Tagviewt"+ gsonResult.getCats());
                List<SysCategoryCat> mSysCat=gsonResult.getCats();
                List<String> mList=new ArrayList<String>();
                for(int i=0;i<mSysCat.size();i++){
                   mList.add(mSysCat.get(i).getCatName().toString());
                    LogUtils.d(mList+"");
                }
                mTagContainerLayout.setTheme(ColorFactory.PURE_CYAN);
                mTagContainerLayout.setBackgroundColor(Color.WHITE);
                mTagContainerLayout.setTagTextDirection(View.TEXT_DIRECTION_ANY_RTL);
                mTagContainerLayout.setTag(mList);
                LogUtils.d("Tagweo",mTagContainerLayout.getTag()+"");
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

    }

}
