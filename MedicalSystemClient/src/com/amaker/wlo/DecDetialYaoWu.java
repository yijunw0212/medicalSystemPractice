package com.amaker.wlo;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.amaker.util.CheckTable;
import com.amaker.util.Shop;

public class DecDetialYaoWu extends Activity{
	
	private TextView text1;
	private TextView text2;
	private TextView text3;
	private TextView text4;
	private CheckTable shop;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("医师详情");
		setContentView(R.layout.dec_detial_yao_wu);
		shop =(CheckTable) getIntent().getExtras().getSerializable("table");
		initView();
		initData();
	}

	private void initData() {
		text1.setText("药物名称："+shop.getNum());
		text2.setText("药物价格："+shop.getFlag());
		text3.setText("药物类型:"+shop.getType());
		text4.setText("药物介绍:"+shop.getPresionName());
	}

	private void initView() {
		text1 =(TextView)findViewById(R.id.text1);
		text2 =(TextView)findViewById(R.id.text2);
		text3 =(TextView)findViewById(R.id.text3);
		text4 =(TextView)findViewById(R.id.text4);
	}
}
