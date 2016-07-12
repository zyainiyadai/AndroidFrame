package com.example.administrator.androidframe.zito.frame.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bigkoo.svprogresshud.SVProgressHUD;
import com.example.administrator.androidframe.R;
import com.example.administrator.androidframe.zito.frame.Utils.AppUtils;
import com.example.administrator.androidframe.zito.frame.Utils.KeyBoardUtils;
import com.example.administrator.androidframe.zito.frame.Utils.LogUtils;
import com.example.administrator.androidframe.zito.frame.Utils.NetUtils;
import com.example.administrator.androidframe.zito.frame.Utils.NormalDiaLogUtils;
import com.example.administrator.androidframe.zito.frame.Utils.ScreenUtils;
import com.example.administrator.androidframe.zito.frame.Utils.ShortToast;
import com.flyco.dialog.widget.NormalDialog;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import cn.trinea.android.common.util.ImageUtils;
import cn.trinea.android.common.util.ListUtils;
import cn.trinea.android.common.util.RandomUtils;
import cn.trinea.android.common.util.StringUtils;
import hugo.weaving.DebugLog;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewInject(R.id.btn_login)
    private Button btn_login;
    @ViewInject(R.id.btn_app)
    private Button btn_app;
    @ViewInject(R.id.btn_work)
    private Button btn_work;
    @ViewInject(R.id.edtTxt_look)
    private EditText edtTxt_look;
    @ViewInject(R.id.btn_log)
    private Button btn_log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //注入view和事件
        x.view().inject(this);
        LogUtils.isDebug = true;
        LogUtils.d("TAG", "MainActivity+6666");
        initFont();
    }

    private void initFont() {
        edtTxt_look.setHint("查询");
        edtTxt_look.setTextSize(8);
        KeyBoardUtils.openKeybord(edtTxt_look,MainActivity.this);
    }
    @Event(value = {R.id.btn_login, R.id.btn_app,R.id.btn_work,R.id.btn_log}, type = View.OnClickListener.class)
    private void onButtonClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                Boolean isNet = NetUtils.isConnected(MainActivity.this);
                if (isNet) {
                    Boolean isWifi = NetUtils.isWifi(MainActivity.this);
                    if (isWifi) {
                        LogUtils.i("TAG", "getHotItem");
                        getHotItem();
                        NetUtils.openNetSetting(MainActivity.this);
                    } else {
                        Toast.makeText(MainActivity.this, "当前不是wifi环境", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "网络未连接", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(MainActivity.this, "IOC框架", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_app:
                Toast.makeText(MainActivity.this, "work", Toast.LENGTH_SHORT).show();
                LogUtils.v("TAG", "type=1");
                String mName = AppUtils.getAppName(MainActivity.this);
                String mVersion = AppUtils.getVersionName(MainActivity.this);
                Toast.makeText(MainActivity.this, mName+mVersion, Toast.LENGTH_SHORT).show();
                NormalDiaLogUtils mNormalDiaLogUtil=new NormalDiaLogUtils(MainActivity.this);
                mNormalDiaLogUtil.openDialog("您处于2G网络是否要退出?");
                break;
            case R.id.btn_work:
                LogUtils.i("allen",""+ScreenUtils.getScreenHeight(MainActivity.this));
                LogUtils.i("allen",""+ScreenUtils.getScreenWidth(MainActivity.this));
                LogUtils.i("allen",""+ScreenUtils.getStatusHeight(MainActivity.this));
//                NormalDiaLogUtils mNormalDiaLogUtils=new NormalDiaLogUtils(MainActivity.this);
////                mNormalDiaLogUtils.openDialog("您处于2G网络是否要退出?");
//                mNormalDiaLogUtils.openMateriaDialog("您处于2G网络是否要退出?");
                SVProgressHUD mSVProgressHUD=new SVProgressHUD(MainActivity.this);
                mSVProgressHUD.showWithStatus("正在加载中...");
                //mSVProgressHUD.dismiss();
                break;
            case R.id.btn_log:
               // int urt= RandomUtils.getRandom(1000);
               // MaterialDialog mMaterialDialog=new MaterialDialog.Builder(this).title("这是一个提示").content(""+urt).positiveText("确定").negativeText("取消").show();
               // Intent mIntent=new Intent(MainActivity.this,TagViewActivity.class);
                Intent mIntent=new Intent(MainActivity.this,TagViewActivity.class);
                startActivity(mIntent);
                break;
        }
    }
    @DebugLog
    public void getHotItem() {
        String url = "http://10.10.50.69:8080/wghvipService/search/item_byKeyword";
        RequestParams mRequest = new RequestParams(url);
        mRequest.addBodyParameter("keyword", "零食");
        mRequest.addBodyParameter("page", "1");
        x.http().post(mRequest, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                JSONObject mJsonObject = JSON.parseObject(result);
                if (mJsonObject != null) {
                    String status = (String) mJsonObject.get("itemTitle");
                    Toast.makeText(MainActivity.this, status, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(MainActivity.this, "请求失败", Toast.LENGTH_SHORT).show();
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
