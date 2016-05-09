package com.example.aplicationdemo;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class My extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my);
		TextView t = (TextView) findViewById(R.id.t);
		ImageView img = (ImageView) findViewById(R.id.ig);
		Map<String, Object> map = MyApplication.getMap();
		//获取map的键
		Set<String> set = map.keySet();
		if (set != null) {
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String st = it.next();
				//对他的键进行匹配，以免导致数据匹配异常
				if (st.equals("txt")) {
					Object value = map.get(st);
					t.setText(value.toString());
				} else if (st.equals("img")) {
					Object value = map.get(st);
					int i = (int) value;
					img.setImageResource(i);
				}

			}
		}
		
	}
}
