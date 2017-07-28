package com.amaker.wlo;


import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DecCheckHist extends Activity {
	
	LinearLayout layout;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("预约列表");
		setContentView(R.layout.dec_check_hist);
		initView();
		initData();
	}

	private void initData() {
		final SharedPreferences sp = this.getSharedPreferences(LoginActivity.name, 1);
		final String str = sp.getString("str", "");
		final String [] strs = str.split(";");
		//layout.removeAllViews();
		for(int i=0;i<strs.length;i++){
			if(strs[i].equals("")){
				continue;
			}
			TextView textVie = new TextView(this);
			textVie.setText("预约医师："+strs[i]);
			LinearLayout ly = new LinearLayout(this);
			ly.setOrientation(LinearLayout.HORIZONTAL);
			final Button but = new Button(this);
			but.setText("删除");
			but.setId(i);
			ly.addView(textVie);
			ly.addView(but);
			layout.addView(ly);
			but.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					int i = but.getId();
					str.replace(strs[i],"");
					str.replaceAll(strs[i], "");
					//refresh();
					Editor editor = sp.edit();
					editor.putString("str", str);
					editor.commit();
				}
			});
		}
	}

	/*public void refresh(){
		final SharedPreferences sp = this.getSharedPreferences(LoginActivity.name, 1);
		final String str = sp.getString("str", "");
		final String [] strs = str.split(";");
		//layout.removeAllViews();
		for(int i=0;i<strs.length;i++){
			if(strs[i].equals("")){
				continue;
			}
			TextView textVie = new TextView(this);
			textVie.setText("预约医师："+strs[i]);
			LinearLayout ly = new LinearLayout(this);
			ly.setOrientation(LinearLayout.HORIZONTAL);
			final Button but = new Button(this);
			but.setText("删除");
			but.setId(i);
			ly.addView(textVie);
			ly.addView(but);
			layout.addView(ly);
			but.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					int i = but.getId();
					str.replace(strs[i],"");
					refresh();
					Editor editor = sp.edit();
					editor.putString("str", str);
					editor.commit();
				}
			});
		}
	}*/
	
	private void initView() {
		layout = (LinearLayout)findViewById(R.id.layout);
	}
	
}
