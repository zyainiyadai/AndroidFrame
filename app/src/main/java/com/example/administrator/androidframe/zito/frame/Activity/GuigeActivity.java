package com.example.administrator.androidframe.zito.frame.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.example.administrator.androidframe.R;
import com.example.administrator.androidframe.zito.frame.Adapter.GuigeAdapter;
import com.example.administrator.androidframe.zito.frame.Dto.CartDtos;
import com.example.administrator.androidframe.zito.frame.Dto.GsonResult;
import com.example.administrator.androidframe.zito.frame.model.SysCategoryCat;
import com.example.administrator.androidframe.zito.frame.model.SysCategorySubclass;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Handler;

@ContentView(R.layout.activity_guige)
public class GuigeActivity extends AppCompatActivity {
    @ViewInject(R.id.lv_guigeactivity_guige)
    private ListView lv_guigeactivity_guige;
    private Handler handler;
    private List<SysCategoryCat> cats;
    private ArrayList<HashMap<String,Object>> mlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        inDate();



    }

    private void inDate() {
       String url="http://10.10.50.134:8080/scfService/home/find_firstCats";
        RequestParams requestParams=new RequestParams();
        x.http().post(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                GsonResult gsonResult= (GsonResult) JSON.toJSON(result);
                cats=gsonResult.getCats();
                String url="http://10.10.50.134:8080/scfService/home/find_subItemByCatId";
                RequestParams mRequestParams=new RequestParams();
                mRequestParams.addBodyParameter("catId",cats.get(1).getCatId()+"");
                x.http().post(mRequestParams, new CommonCallback<String>() {
                    @Override
                    public void onSuccess(String result) {
                        GsonResult gsonResult= (GsonResult) JSON.toJSON(result);
                        ArrayList<SysCategorySubclass> cattwo= (ArrayList<SysCategorySubclass>) gsonResult.getSubclasses();
                        GuigeAdapter mGuigeAdapter=new GuigeAdapter(GuigeActivity.this,handler,cats,cattwo);
                        lv_guigeactivity_guige.setAdapter(mGuigeAdapter);
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
