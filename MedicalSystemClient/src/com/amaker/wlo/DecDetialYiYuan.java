package com.amaker.wlo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.amaker.util.CheckTable;
import com.amaker.util.HospitalIntro;


public class DecDetialYiYuan extends Activity{
	private TextView text1;
	private TextView text2;
	private TextView text3;
	private TextView text4;
	private HospitalIntro hospital;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("ҽԺ����");
		setContentView(R.layout.dec_detial_yi_yuan);
		hospital =(HospitalIntro) getIntent().getExtras().getSerializable("hospital");
		initView();
		initData();
	}

	private void initData() {
		text1.setText("ҽԺ���ƣ�"+hospital.getName());
		text2.setText("ҽԺ�绰��"+hospital.getPhone());
		text3.setText("ҽԺ����:"+hospital.getIntro());
		text4.setText("ҽԺ��ַ:"+hospital.getAddress());
	}

	private void initView() {
		text1 =(TextView)findViewById(R.id.text5);
		text2 =(TextView)findViewById(R.id.text6);
		text3 =(TextView)findViewById(R.id.text7);
		text4 =(TextView)findViewById(R.id.text8);
	}
}
