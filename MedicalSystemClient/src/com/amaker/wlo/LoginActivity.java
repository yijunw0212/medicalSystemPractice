package com.amaker.wlo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.amaker.util.HttpUtil;

public class LoginActivity extends Activity {
	private Button cancelBtn,loginBtn;
	private EditText userEditText,pwdEditText;
	public static String name;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("医疗信息管理系统-用户登录");
		setContentView(R.layout.login_system);
		cancelBtn = (Button)findViewById(R.id.cancelButton);
		loginBtn = (Button)findViewById(R.id.loginButton);
		userEditText = (EditText)findViewById(R.id.userEditText);
		pwdEditText = (EditText)findViewById(R.id.pwdEditText);
		
		cancelBtn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				finish();
			}
		});
		
		loginBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if(validate()){
					if(login()){
						name = userEditText.getText().toString();
						Intent intent = new Intent(LoginActivity.this,MainMenuActivity.class);
						startActivity(intent);
					}else{
						showDialog("用户不存在或输入有误，请重新输入！");
					}
				}
			}
		});
	}
	private boolean login(){
		String username = userEditText.getText().toString();
		String pwd = pwdEditText.getText().toString();
		String result=query(username,pwd);
		if(result!=null&&result.equals("0")){
			return false;
		}else{
			saveUserMsg(result);
			return true;
		}
	}
	
	private void saveUserMsg(String msg){
		String id = "";
		String name = "";
		String[] msgs = msg.split(";");
		int idx = msgs[0].indexOf("=");
		id = msgs[0].substring(idx+1);
		idx = msgs[1].indexOf("=");
		name = msgs[1].substring(idx+1);
		SharedPreferences pre = getSharedPreferences("user_msg", MODE_WORLD_WRITEABLE);
		SharedPreferences.Editor editor = pre.edit();
		
		editor.putString("id", id);
		editor.putString("name", name);
		editor.commit();
	}
	
	private boolean validate(){
		String username = userEditText.getText().toString();
		if(username.equals("")){
			
			showDialog("用户名称是必填项！");
			return false;
		}
		String pwd = pwdEditText.getText().toString();
		if(pwd.equals("")){
			showDialog("用户密码是必填项！");
			return false;
		}
		return true;
	}
	private void showDialog(String msg){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage(msg)
		       .setCancelable(false)
		       .setPositiveButton("确定", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		           }
		       });
		AlertDialog alert = builder.create();
		alert.show();
	}
	private String query(String account,String password){
		String queryString = "account="+account+"&password="+password;
		String url = HttpUtil.BASE_URL+"servlet/LoginServlet?"+queryString;
		return HttpUtil.queryStringForPost(url);
    }
}