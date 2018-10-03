package com.why.project.myapptemplet.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Window;

/**
 * Created by HaiyuKing
 * Used
 */
public class BaseActivity extends AppCompatActivity {
	private static final String TAG = BaseActivity.class.getSimpleName();
	public static int screenWidth;//屏幕宽度
	public static int screenHeight;//屏幕高度
	public static int screenDendity;//屏幕密度比例
	public static int screenDendityDpi;//屏幕密度

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// 去掉标题栏
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		//保持屏幕为横屏或者竖屏，禁止旋转
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//竖屏
		//setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//横屏

		//将Acitivity 中的Window 的背景图设置为空,解决Android Activity切换时出现白屏问题
		getWindow().setBackgroundDrawable(null);

		//打印当前活动的activity
		Log.d(TAG, getClass().getSimpleName());// 知晓当前是在哪一个活动

		//3、获取屏幕宽和高
		DisplayMetrics metric = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metric);
		screenWidth = metric.widthPixels;// 屏幕宽度（像素）
		screenHeight = metric.heightPixels;//屏幕高度（像素）

		screenDendity = (int) metric.density;//屏幕密度比例3
		screenDendityDpi = metric.densityDpi;//屏幕密度480
		super.onCreate(savedInstanceState);
	}
}
