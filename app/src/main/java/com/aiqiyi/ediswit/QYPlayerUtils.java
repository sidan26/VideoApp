package com.aiqiyi.ediswit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;


import com.aiqiyi.ediswit.activity.PlayActivity;
import com.aiqiyi.ediswit.utils.LogUtils;

/**
 * Created by zhouxiaming on 2017/5/8.
 */

public class QYPlayerUtils {
    private static String TAG = "QYPlayerUtils";
    /**
     * 跳转到播放器播放
     * @param context
     * @param aid
     * @param tid
     */
    public static void jumpToPlayerActivity(Context context, String aid, String tid) {
        LogUtils.i(TAG, "jumpToPlayerActivity aid: " + aid + " tid: " + tid);
        Intent intent = new Intent(context, PlayActivity.class);
        intent.putExtra("aid", aid);
        intent.putExtra("tid", tid);
        if (!(context instanceof Activity)) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        }
        context.startActivity(intent);
    }
}
