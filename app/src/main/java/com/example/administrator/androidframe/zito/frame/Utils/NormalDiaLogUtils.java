package com.example.administrator.androidframe.zito.frame.Utils;

import android.content.Context;

import com.example.administrator.androidframe.zito.frame.Activity.MainActivity;
import com.flyco.animation.BaseAnimatorSet;
import com.flyco.animation.BounceEnter.BounceTopEnter;
import com.flyco.animation.FadeEnter.FadeEnter;
import com.flyco.animation.FlipEnter.FlipBottomEnter;
import com.flyco.animation.SlideExit.SlideBottomExit;
import com.flyco.dialog.listener.OnBtnLeftClickL;
import com.flyco.dialog.listener.OnBtnRightClickL;
import com.flyco.dialog.widget.MaterialDialog;
import com.flyco.dialog.widget.NormalDialog;

import hugo.weaving.DebugLog;

/**
 * DiaLog工具类
 *
 * @author 周跃
 * @time 2016/5/30 13:40
 */
public class NormalDiaLogUtils {
    private BaseAnimatorSet mBasIn;
    private BaseAnimatorSet mBasOut;
    private Context context;

    public NormalDiaLogUtils(Context context) {
        this.context = context;
    }

    public NormalDiaLogUtils(Context context, BaseAnimatorSet bas_in, BaseAnimatorSet bas_out) {
        this.mBasIn = bas_in;
        this.mBasOut = bas_out;
        this.context = context;
    }
    @DebugLog
    public void openDialog(String message) {
        mBasIn= new FlipBottomEnter();
        mBasOut = new FadeEnter();
        final NormalDialog mNormalDialog = new NormalDialog(context);
        mNormalDialog.content(message).showAnim(mBasIn).dismissAnim(mBasOut).show();
        mNormalDialog.setOnBtnLeftClickL(new OnBtnLeftClickL() {
            @Override
            public void onBtnLeftClick() {
                ShortToast.getToast(context,"onBtnLeftClick").show();
                mNormalDialog.dismiss();
            }
        });
        mNormalDialog.setOnBtnRightClickL(new OnBtnRightClickL() {
            @Override
            public void onBtnRightClick() {
                ShortToast.getToast(context,"onBtnRightClick").show();
                mNormalDialog.dismiss();
            }
        });
    }
    public void openMateriaDialog(String message){
        mBasIn = new BounceTopEnter();
        mBasOut = new SlideBottomExit();
        final MaterialDialog materialDialog= new MaterialDialog(context);
        materialDialog.content(message).showAnim(mBasIn).dismissAnim(mBasOut).show();

        materialDialog.setOnBtnLeftClickL(new OnBtnLeftClickL() {
            @Override
            public void onBtnLeftClick() {
                ShortToast.getToast(context,"onBtnLeftClick");
                materialDialog.dismiss();
            }
        });
        materialDialog.setOnBtnRightClickL(new OnBtnRightClickL() {
            @Override
            public void onBtnRightClick() {
                ShortToast.getToast(context,"onBtnRightClick");
                materialDialog.dismiss();
            }
        });

    }


}
