package com.example.bj.calendarwork1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity
{
    //狀態欄的寬度
    int statusBarHeight;

    //TopBar下面的border
    int topBarBorderHeight = 3;

    //螢幕的長寬
    int screenHeight;
    int screenWidth;

    //topBar的height
    int topBarHeight = 90;

    //一個dayBlock的長寬
    int dayBlockWidth;
    int dayBlockHeight;

    //defaultRow
    int defaultRowHeight = 60;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getStatusBarHeight();
        getScreenWidth();
        getDayBlockSize();
        setTopBar();
        setCalendarRow1();
        setCalendarRow2();
        setCalendarRow3();
        setCalendarRow4();
        setCalendarRow5();
        setCalendarRow6();
    }

    public void getStatusBarHeight()
    {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0)
        {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        Log.d("MyLog" , "Height of status bar : "+result);
        statusBarHeight = result;
    }

    public void getScreenWidth()
    {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int height = metrics.heightPixels;
        int width = metrics.widthPixels;
        Log.d("MyLog" , "Screen height : "+height);
        Log.d("MyLog" , "Screen width : "+width);

        screenHeight = height;
        screenWidth = width;
    }

    public void getDayBlockSize()
    {
        dayBlockWidth = screenWidth/7;
        dayBlockHeight = (screenHeight - statusBarHeight - topBarHeight - defaultRowHeight)/6;
    }

    public void setTopBar()
    {
        RelativeLayout topBar = (RelativeLayout) findViewById(R.id.TopBar);
        ViewGroup.LayoutParams params = topBar.getLayoutParams();

        params.height = topBarHeight;
        topBar.setLayoutParams(params);
    }

    public void setCalendarRow1()
    {
        RelativeLayout dayBlock1 = (RelativeLayout) findViewById(R.id.DayBlock1);
        ViewGroup.LayoutParams params1 = dayBlock1.getLayoutParams();
        params1.height = dayBlockHeight;
        params1.width = dayBlockWidth;
        dayBlock1.setLayoutParams(params1);

        RelativeLayout dayBlock2 = (RelativeLayout) findViewById(R.id.DayBlock2);
        ViewGroup.LayoutParams params2 = dayBlock2.getLayoutParams();
        params2.height = dayBlockHeight;
        params2.width = dayBlockWidth;
        dayBlock2.setLayoutParams(params2);

        RelativeLayout dayBlock3 = (RelativeLayout) findViewById(R.id.DayBlock3);
        ViewGroup.LayoutParams params3 = dayBlock3.getLayoutParams();
        params3.height = dayBlockHeight;
        params3.width = dayBlockWidth;
        dayBlock3.setLayoutParams(params3);

        RelativeLayout dayBlock4 = (RelativeLayout) findViewById(R.id.DayBlock4);
        ViewGroup.LayoutParams params4 = dayBlock4.getLayoutParams();
        params4.height = dayBlockHeight;
        params4.width = dayBlockWidth;
        dayBlock4.setLayoutParams(params4);

        RelativeLayout dayBlock5 = (RelativeLayout) findViewById(R.id.DayBlock5);
        ViewGroup.LayoutParams params5 = dayBlock5.getLayoutParams();
        params5.height = dayBlockHeight;
        params5.width = dayBlockWidth;
        dayBlock5.setLayoutParams(params5);

        RelativeLayout dayBlock6 = (RelativeLayout) findViewById(R.id.DayBlock6);
        ViewGroup.LayoutParams params6 = dayBlock6.getLayoutParams();
        params6.height = dayBlockHeight;
        params6.width = dayBlockWidth;
        dayBlock6.setLayoutParams(params6);

        RelativeLayout dayBlock7 = (RelativeLayout) findViewById(R.id.DayBlock7);
        ViewGroup.LayoutParams params7 = dayBlock7.getLayoutParams();
        params7.height = dayBlockHeight;
        params7.width = screenWidth-dayBlockWidth*6;
        dayBlock7.setLayoutParams(params7);
    }

    public void setCalendarRow2()
    {
        RelativeLayout dayBlock1 = (RelativeLayout) findViewById(R.id.DayBlock8);
        ViewGroup.LayoutParams params1 = dayBlock1.getLayoutParams();
        params1.height = dayBlockHeight;
        params1.width = dayBlockWidth;
        dayBlock1.setLayoutParams(params1);

        RelativeLayout dayBlock2 = (RelativeLayout) findViewById(R.id.DayBlock9);
        ViewGroup.LayoutParams params2 = dayBlock2.getLayoutParams();
        params2.height = dayBlockHeight;
        params2.width = dayBlockWidth;
        dayBlock2.setLayoutParams(params2);

        RelativeLayout dayBlock3 = (RelativeLayout) findViewById(R.id.DayBlock10);
        ViewGroup.LayoutParams params3 = dayBlock3.getLayoutParams();
        params3.height = dayBlockHeight;
        params3.width = dayBlockWidth;
        dayBlock3.setLayoutParams(params3);

        RelativeLayout dayBlock4 = (RelativeLayout) findViewById(R.id.DayBlock11);
        ViewGroup.LayoutParams params4 = dayBlock4.getLayoutParams();
        params4.height = dayBlockHeight;
        params4.width = dayBlockWidth;
        dayBlock4.setLayoutParams(params4);

        RelativeLayout dayBlock5 = (RelativeLayout) findViewById(R.id.DayBlock12);
        ViewGroup.LayoutParams params5 = dayBlock5.getLayoutParams();
        params5.height = dayBlockHeight;
        params5.width = dayBlockWidth;
        dayBlock5.setLayoutParams(params5);

        RelativeLayout dayBlock6 = (RelativeLayout) findViewById(R.id.DayBlock13);
        ViewGroup.LayoutParams params6 = dayBlock6.getLayoutParams();
        params6.height = dayBlockHeight;
        params6.width = dayBlockWidth;
        dayBlock6.setLayoutParams(params6);

        RelativeLayout dayBlock7 = (RelativeLayout) findViewById(R.id.DayBlock14);
        ViewGroup.LayoutParams params7 = dayBlock7.getLayoutParams();
        params7.height = dayBlockHeight;
        params7.width = screenWidth-dayBlockWidth*6;
        dayBlock7.setLayoutParams(params7);
    }

    public void setCalendarRow3()
    {
        RelativeLayout dayBlock1 = (RelativeLayout) findViewById(R.id.DayBlock15);
        ViewGroup.LayoutParams params1 = dayBlock1.getLayoutParams();
        params1.height = dayBlockHeight;
        params1.width = dayBlockWidth;
        dayBlock1.setLayoutParams(params1);

        RelativeLayout dayBlock2 = (RelativeLayout) findViewById(R.id.DayBlock16);
        ViewGroup.LayoutParams params2 = dayBlock2.getLayoutParams();
        params2.height = dayBlockHeight;
        params2.width = dayBlockWidth;
        dayBlock2.setLayoutParams(params2);

        RelativeLayout dayBlock3 = (RelativeLayout) findViewById(R.id.DayBlock17);
        ViewGroup.LayoutParams params3 = dayBlock3.getLayoutParams();
        params3.height = dayBlockHeight;
        params3.width = dayBlockWidth;
        dayBlock3.setLayoutParams(params3);

        RelativeLayout dayBlock4 = (RelativeLayout) findViewById(R.id.DayBlock18);
        ViewGroup.LayoutParams params4 = dayBlock4.getLayoutParams();
        params4.height = dayBlockHeight;
        params4.width = dayBlockWidth;
        dayBlock4.setLayoutParams(params4);

        RelativeLayout dayBlock5 = (RelativeLayout) findViewById(R.id.DayBlock19);
        ViewGroup.LayoutParams params5 = dayBlock5.getLayoutParams();
        params5.height = dayBlockHeight;
        params5.width = dayBlockWidth;
        dayBlock5.setLayoutParams(params5);

        RelativeLayout dayBlock6 = (RelativeLayout) findViewById(R.id.DayBlock20);
        ViewGroup.LayoutParams params6 = dayBlock6.getLayoutParams();
        params6.height = dayBlockHeight;
        params6.width = dayBlockWidth;
        dayBlock6.setLayoutParams(params6);

        RelativeLayout dayBlock7 = (RelativeLayout) findViewById(R.id.DayBlock21);
        ViewGroup.LayoutParams params7 = dayBlock7.getLayoutParams();
        params7.height = dayBlockHeight;
        params7.width = screenWidth-dayBlockWidth*6;
        dayBlock7.setLayoutParams(params7);
    }

    public void setCalendarRow4()
    {
        RelativeLayout dayBlock1 = (RelativeLayout) findViewById(R.id.DayBlock22);
        ViewGroup.LayoutParams params1 = dayBlock1.getLayoutParams();
        params1.height = dayBlockHeight;
        params1.width = dayBlockWidth;
        dayBlock1.setLayoutParams(params1);

        RelativeLayout dayBlock2 = (RelativeLayout) findViewById(R.id.DayBlock23);
        ViewGroup.LayoutParams params2 = dayBlock2.getLayoutParams();
        params2.height = dayBlockHeight;
        params2.width = dayBlockWidth;
        dayBlock2.setLayoutParams(params2);

        RelativeLayout dayBlock3 = (RelativeLayout) findViewById(R.id.DayBlock24);
        ViewGroup.LayoutParams params3 = dayBlock3.getLayoutParams();
        params3.height = dayBlockHeight;
        params3.width = dayBlockWidth;
        dayBlock3.setLayoutParams(params3);

        RelativeLayout dayBlock4 = (RelativeLayout) findViewById(R.id.DayBlock25);
        ViewGroup.LayoutParams params4 = dayBlock4.getLayoutParams();
        params4.height = dayBlockHeight;
        params4.width = dayBlockWidth;
        dayBlock4.setLayoutParams(params4);

        RelativeLayout dayBlock5 = (RelativeLayout) findViewById(R.id.DayBlock26);
        ViewGroup.LayoutParams params5 = dayBlock5.getLayoutParams();
        params5.height = dayBlockHeight;
        params5.width = dayBlockWidth;
        dayBlock5.setLayoutParams(params5);

        RelativeLayout dayBlock6 = (RelativeLayout) findViewById(R.id.DayBlock27);
        ViewGroup.LayoutParams params6 = dayBlock6.getLayoutParams();
        params6.height = dayBlockHeight;
        params6.width = dayBlockWidth;
        dayBlock6.setLayoutParams(params6);

        RelativeLayout dayBlock7 = (RelativeLayout) findViewById(R.id.DayBlock28);
        ViewGroup.LayoutParams params7 = dayBlock7.getLayoutParams();
        params7.height = dayBlockHeight;
        params7.width = screenWidth-dayBlockWidth*6;
        dayBlock7.setLayoutParams(params7);
    }

    public void setCalendarRow5()
    {
        RelativeLayout dayBlock1 = (RelativeLayout) findViewById(R.id.DayBlock29);
        ViewGroup.LayoutParams params1 = dayBlock1.getLayoutParams();
        params1.height = dayBlockHeight;
        params1.width = dayBlockWidth;
        dayBlock1.setLayoutParams(params1);

        RelativeLayout dayBlock2 = (RelativeLayout) findViewById(R.id.DayBlock30);
        ViewGroup.LayoutParams params2 = dayBlock2.getLayoutParams();
        params2.height = dayBlockHeight;
        params2.width = dayBlockWidth;
        dayBlock2.setLayoutParams(params2);

        RelativeLayout dayBlock3 = (RelativeLayout) findViewById(R.id.DayBlock31);
        ViewGroup.LayoutParams params3 = dayBlock3.getLayoutParams();
        params3.height = dayBlockHeight;
        params3.width = dayBlockWidth;
        dayBlock3.setLayoutParams(params3);

        RelativeLayout dayBlock4 = (RelativeLayout) findViewById(R.id.DayBlock32);
        ViewGroup.LayoutParams params4 = dayBlock4.getLayoutParams();
        params4.height = dayBlockHeight;
        params4.width = dayBlockWidth;
        dayBlock4.setLayoutParams(params4);

        RelativeLayout dayBlock5 = (RelativeLayout) findViewById(R.id.DayBlock33);
        ViewGroup.LayoutParams params5 = dayBlock5.getLayoutParams();
        params5.height = dayBlockHeight;
        params5.width = dayBlockWidth;
        dayBlock5.setLayoutParams(params5);

        RelativeLayout dayBlock6 = (RelativeLayout) findViewById(R.id.DayBlock34);
        ViewGroup.LayoutParams params6 = dayBlock6.getLayoutParams();
        params6.height = dayBlockHeight;
        params6.width = dayBlockWidth;
        dayBlock6.setLayoutParams(params6);

        RelativeLayout dayBlock7 = (RelativeLayout) findViewById(R.id.DayBlock35);
        ViewGroup.LayoutParams params7 = dayBlock7.getLayoutParams();
        params7.height = dayBlockHeight;
        params7.width = screenWidth-dayBlockWidth*6;
        dayBlock7.setLayoutParams(params7);
    }

    public void setCalendarRow6()
    {
        RelativeLayout dayBlock1 = (RelativeLayout) findViewById(R.id.DayBlock36);
        ViewGroup.LayoutParams params1 = dayBlock1.getLayoutParams();
        params1.height = dayBlockHeight;
        params1.width = dayBlockWidth;
        dayBlock1.setLayoutParams(params1);

        RelativeLayout dayBlock2 = (RelativeLayout) findViewById(R.id.DayBlock37);
        ViewGroup.LayoutParams params2 = dayBlock2.getLayoutParams();
        params2.height = dayBlockHeight;
        params2.width = dayBlockWidth;
        dayBlock2.setLayoutParams(params2);

        RelativeLayout dayBlock3 = (RelativeLayout) findViewById(R.id.DayBlock38);
        ViewGroup.LayoutParams params3 = dayBlock3.getLayoutParams();
        params3.height = dayBlockHeight;
        params3.width = dayBlockWidth;
        dayBlock3.setLayoutParams(params3);

        RelativeLayout dayBlock4 = (RelativeLayout) findViewById(R.id.DayBlock39);
        ViewGroup.LayoutParams params4 = dayBlock4.getLayoutParams();
        params4.height = dayBlockHeight;
        params4.width = dayBlockWidth;
        dayBlock4.setLayoutParams(params4);

        RelativeLayout dayBlock5 = (RelativeLayout) findViewById(R.id.DayBlock40);
        ViewGroup.LayoutParams params5 = dayBlock5.getLayoutParams();
        params5.height = dayBlockHeight;
        params5.width = dayBlockWidth;
        dayBlock5.setLayoutParams(params5);

        RelativeLayout dayBlock6 = (RelativeLayout) findViewById(R.id.DayBlock41);
        ViewGroup.LayoutParams params6 = dayBlock6.getLayoutParams();
        params6.height = dayBlockHeight;
        params6.width = dayBlockWidth;
        dayBlock6.setLayoutParams(params6);

        RelativeLayout dayBlock7 = (RelativeLayout) findViewById(R.id.DayBlock42);
        ViewGroup.LayoutParams params7 = dayBlock7.getLayoutParams();
        params7.height = dayBlockHeight;
        params7.width = screenWidth-dayBlockWidth*6;
        dayBlock7.setLayoutParams(params7);
    }
}
