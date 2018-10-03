package com.why.project.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by HaiyuKing
 * Used Application基类
 * https://blog.csdn.net/zsf442553199/article/details/78675769
 */

public class BaseApplication extends Application{

	/**系统上下文*/
	private static Context mAppContext;

	@Override
	public void onCreate() {
		super.onCreate();
		mAppContext = getApplicationContext();
	}

	/**获取系统上下文：用于ToastUtil类*/
	public static Context getAppContext()
	{
		return mAppContext;
	}

}
