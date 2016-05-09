package com.example.aplicationdemo;

import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {
	private EditText editText;
	private ImageView img;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editText = (EditText) findViewById(R.id.txt);
		img = (ImageView) findViewById(R.id.img);
		findViewById(R.id.btn).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String edString = editText.getText().toString().trim();
				int imgs = R.drawable.tg;
				Map<String, Object> map = MyApplication.getMap();
				map.put("txt", edString);
				map.put("img", imgs);
				Intent intent = new Intent(getApplicationContext(), My.class);
				startActivity(intent);
			}
		});

	}

}
