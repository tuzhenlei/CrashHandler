package com.demo.crash;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

	TextView mTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		Button button = (Button) findViewById(R.id.button);
		Button button2 = (Button) findViewById(R.id.button2);

		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
			}
		});

		/**
		 * 点击crash
		 */
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mTextView.setTextColor(Color.parseColor("#000"));
			}
		});
	}
}
