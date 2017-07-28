package com.amaker.wlo;


import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Decrecord extends Activity{
	
	private EditText edit;
	private LinearLayout layout;
	private Button button;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("病历记录");
		setContentView(R.layout.dec_record);
		initView();
	}

	private void initView() {
		edit = (EditText)findViewById(R.id.edit1);
		layout = (LinearLayout)findViewById(R.id.layout1);
		button = (Button)findViewById(R.id.button1);
		
		SharedPreferences sp = Decrecord.this.getSharedPreferences("about", 1);
		Editor editor = sp.edit();
		String str = sp.getString(LoginActivity.name, "");
		String [] strs = str.split(";");
		layout.removeAllViews();
		for(int i =0;i<strs.length;i++){
			if(!strs[i].equals("")){
				TextView tx = new TextView(Decrecord.this);
				tx.setText(strs[i]);
				layout.addView(tx);
			}
		}
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(edit.getText().toString().equals("")){
					Toast.makeText(Decrecord.this , "不能为空", Toast.LENGTH_LONG).show();
					return;
				}
				SharedPreferences sp = Decrecord.this.getSharedPreferences("about", 1);
				Editor editor = sp.edit();
				String str = sp.getString(LoginActivity.name, "");
				str = str+";"+LoginActivity.name+"记录："+edit.getText().toString();
				editor.putString(LoginActivity.name, str);
				editor.commit();
				TextView tx = new TextView(Decrecord.this);
				tx.setText(LoginActivity.name+"记录："+edit.getText().toString());
				layout.addView(tx);
				edit.setText("");
			}
		});
	}
	
	
}
