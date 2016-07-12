package com.example.administrator.androidframe.zito.frame.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.administrator.androidframe.R;
import com.example.administrator.androidframe.zito.frame.Interface.InterfaceClick;
import com.example.administrator.androidframe.zito.frame.Utils.ItemClient;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;
@ContentView(R.layout.activity_recaly)
public class RecalyActivity extends AppCompatActivity implements View.OnClickListener {
    @ViewInject(R.id.recy_list)
    private RecyclerView recyclerView;
    private List<String> inDate;
    private HomeAdtper myViewHolder=new HomeAdtper();
    @ViewInject(R.id.btn_add)
    private Button btn_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        //setContentView(R.layout.activity_recaly);
        initDate();
        initView();
    }

    private void initDate() {
        inDate=new ArrayList<String>();
        for (int i='A';i<'z';i++){
                inDate.add(""+(char)i);
        }


    }

    private void initView() {
        ItemClient itemlayout=new ItemClient(ItemClient.VERTICAL);
        itemlayout.setSize(1);
        //0xDDDDDDDD
        itemlayout.setColor(Color.BLUE);
       // recyclerView= (RecyclerView) findViewById(R.id.recy_list);
        //btn_add= (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(itemlayout);
        recyclerView.setAdapter(myViewHolder);
        myViewHolder.setMinterfaceClick(new InterfaceClick() {
            @Override
            public void OnItemClick(View view, int position) {
                Toast.makeText(RecalyActivity.this,inDate.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_add:
                myViewHolder.notifyItemInserted(2);
                inDate.add(2, "666");
                myViewHolder.notifyItemRangeChanged(2, myViewHolder.getItemCount());
                break;
        }
    }

    class HomeAdtper extends RecyclerView.Adapter<HomeAdtper.MyViewHolder> implements View.OnClickListener {
        private InterfaceClick minterfaceClick;

        public void setMinterfaceClick(InterfaceClick minterfaceClick) {
            this.minterfaceClick = minterfaceClick;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view=LayoutInflater.from(RecalyActivity.this).inflate(R.layout.itemlayout,viewGroup,false);
            view.setOnClickListener(this);
            MyViewHolder myViewHolder=new MyViewHolder(view);
            return myViewHolder;
        }

        @Override
        public void onBindViewHolder(final MyViewHolder myViewHolder, int i) {
            String url="http://10.10.50.69:8080/wghvipService/search/item_byKeyword";
            RequestParams mRequest=new RequestParams(url);
            mRequest.addBodyParameter("keyword","零食");
            mRequest.addBodyParameter("page","1");
            x.http().post(mRequest, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    JSONObject mJsonObject= JSON.parseObject(result);
                    if(mJsonObject!=null){
                        String status= (String) mJsonObject.get("status");
                        myViewHolder.tv.setText(status);
                        Toast.makeText(RecalyActivity.this,status,Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {
                    Toast.makeText(RecalyActivity.this,"请求失败",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onCancelled(CancelledException cex) {

                }

                @Override
                public void onFinished() {

                }
            });


            if(minterfaceClick!=null){
                if(!myViewHolder.itemView.hasOnClickListeners()){
                    Log.e("TAG","setOnClickListener");
                    myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int pos=myViewHolder.getPosition();
                            minterfaceClick.OnItemClick(v,pos);
                        }
                    });
                }
            }
            myViewHolder.itemView.setTag(inDate.get(i));
        }

        @Override
        public int getItemCount() {
            return inDate.size();
        }

        @Override
        public void onClick(View v) {
            if(minterfaceClick!=null){
                minterfaceClick.OnItemClick(v, (Integer) v.getTag());
            }
        }



        class MyViewHolder extends RecyclerView.ViewHolder
        {

            TextView tv;

            public MyViewHolder(View itemview)
            {
                super(itemview);
                tv = (TextView) itemview.findViewById(R.id.tv_re);
            }
        }
    }

}
