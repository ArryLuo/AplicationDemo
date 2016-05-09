package com.example.aplicationdemo;

import java.util.HashMap;
import java.util.Map;

import android.app.Application;

public class MyApplication extends Application {
	private static Map<String, Object> map;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		map = new HashMap<String, Object>();
	}
//对外提供一个公开方法,还有就是必须在清单文件中对他进行注册
	public static Map<String, Object> getMap() {
		return map;
	}
}
