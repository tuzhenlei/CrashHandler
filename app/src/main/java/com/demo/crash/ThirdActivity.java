package com.demo.crash;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * author：tuzhenlei
 * time  ：2017/2/20 13:57
 * note  ：
 */

public class ThirdActivity extends AppCompatActivity {

	TextView mTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);
		Button button = (Button) findViewById(R.id.button);
		/**
		 * 点击crash
		 */
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mTextView.setTextColor(Color.parseColor("#000"));
			}
		});
	}
}
