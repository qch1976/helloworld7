package com.example.app2;

import android.content.Context;

public class ydl1 {
    public static int dip2px(Context context, float dpValue ){
        //get pixel density of the mobile screen
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dpValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue ){
        //get pixel density of the mobile screen
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(pxValue / scale + 0.5f);
    }
}
