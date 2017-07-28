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

import com.amaker.util.Shop;

public class DecDetial extends Activity{
	
	private TextView text1;
	private TextView text2;
	private TextView text3;
	private TextView text4;
	private Button button;
	private Shop shop;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("ҽʦ����");
		setContentView(R.layout.dec_detial);
		shop = getIntent().getParcelableExtra("shop");
		initView();
		initData();
	}

	private void initData() {
		text1.setText("ҽʦ���ƣ�"+shop.getName());
		text2.setText("���ڿ��ң�"+shop.getType());
		text3.setText("ְ�ƣ�"+shop.getZhicheng());
		text4.setText("�Һż۸�"+shop.getMoney());
	}

	private void initView() {
		text1 =(TextView)findViewById(R.id.text1);
		text2 =(TextView)findViewById(R.id.text2);
		text3 =(TextView)findViewById(R.id.text3);
		text4 =(TextView)findViewById(R.id.text4);
		button =(Button)findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				SharedPreferences sp = DecDetial.this.getSharedPreferences(LoginActivity.name, 1);
				Editor editor = sp.edit();
				String str = sp.getString("str", "");
				String [] strs = str.split(";");
				String newStr = "";
				for(int i=0;i<strs.length;i++){
					if(strs[i].equals(shop.getName())){
						Toast.makeText(DecDetial.this, "�Ѿ�ԤԼ���������ظ�ԤԼ", Toast.LENGTH_LONG).show();
						return;
					}
				}
				
				str = str +";"+shop.getName();
				
				editor.putString("str", str);
				editor.commit();
			}
		});
	}
}
