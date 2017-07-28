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

public class DecTallAboutActivity extends Activity{
	
	private EditText edit;
	private LinearLayout layout;
	private Button button;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("医生交流");
		setContentView(R.layout.dectall_about);
		initView();
	}

	private void initView() {
		edit = (EditText)findViewById(R.id.edit);
		layout = (LinearLayout)findViewById(R.id.layout);
		button = (Button)findViewById(R.id.button);
		
		SharedPreferences sp = DecTallAboutActivity.this.getSharedPreferences("about", 1);
		Editor editor = sp.edit();
		String str = sp.getString(LoginActivity.name, "");
		String [] strs = str.split(";");
		layout.removeAllViews();
		for(int i =0;i<strs.length;i++){
			if(!strs[i].equals("")){
				TextView tx = new TextView(DecTallAboutActivity.this);
				tx.setText(strs[i]);
				layout.addView(tx);
			}
		}
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(edit.getText().toString().equals("")){
					Toast.makeText(DecTallAboutActivity.this , "留言不能为空", Toast.LENGTH_LONG).show();
					return;
				}
				SharedPreferences sp = DecTallAboutActivity.this.getSharedPreferences("about", 1);
				Editor editor = sp.edit();
				String str = sp.getString(LoginActivity.name, "");
				str = str+";"+LoginActivity.name+"说："+edit.getText().toString();
				editor.putString(LoginActivity.name, str);
				editor.commit();
				TextView tx = new TextView(DecTallAboutActivity.this);
				tx.setText(LoginActivity.name+"说："+edit.getText().toString());
				layout.addView(tx);
				edit.setText("");
			}
		});
	}
	
	
}
