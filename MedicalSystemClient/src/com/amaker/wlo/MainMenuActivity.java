package com.amaker.wlo;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.amaker.adapters.JsonArrayAdapter;
import com.amaker.util.HttpUtil;

public class MainMenuActivity extends Activity {
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("医疗信息管理系统-主菜单");
        setContentView(R.layout.main_menu);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
    }
    
    // 继承BaseAdapter
    public class ImageAdapter extends BaseAdapter {
    	// 上下文
        private Context mContext;
        // 构造方法
        public ImageAdapter(Context c) {
            mContext = c;
        }
        // 组件个数
        public int getCount() {
            return mThumbIds.length;
        }
        // 当前组件
        public Object getItem(int position) {
            return null;
        }
        // 当前组件id
        public long getItemId(int position) {
            return 0;
        }
        // 获得当前视图
        public View getView(int position, View convertView, ViewGroup parent) {
        	// 声明图片视图
            TextView text;
            if (convertView == null) {
            	// 实例化图片视图
            	text = new TextView(mContext);
                // 设置图片视图属性
            	text.setLayoutParams(new GridView.LayoutParams(100, 100));
            	text.setPadding(8, 8, 8, 8);
            } else {
            	text = (TextView) convertView;
            }
            // 设置图片视图图片资源
            text.setText(mThumbIds[position]);
            // 为当前视图添加监听器
            switch (position) {
			case 0:
				text.setOnClickListener(orderLinstener);
				break;
			case 1:
				text.setOnClickListener(unionTableLinstener);
				break;
			case 2:
				text.setOnClickListener(changeTableLinstener1);
				break;
			case 3:
				
				text.setOnClickListener(numberLinstener);
			break;
			
			case 4:
			text.setOnClickListener(changeTableLinstener);
			break;
			case 5:
			text.setOnClickListener(hospitallinstener);
			break;
//				final SharedPreferences sp = MainMenuActivity.this.getSharedPreferences(LoginActivity.name, 1);
//				final String str = sp.getString("str", "");
//				final String [] strs = str.split(";");
//				int index = 0 ;
//				for(int i=0;i<strs.length;i++){
//					if(strs[i].equals("")){
//						continue;
//					}else{
//						index++;
//					}
//				}
//				Toast.makeText(MainMenuActivity.this, "预约总人数为："+index, Toast.LENGTH_LONG).show();
				
				
			default:
				break;
			}
            
            return text;
        }
        private String[] mThumbIds = {
        		"在线挂号与预约",
        		"药物介绍",
        		"病历记录",
        		"候诊人数",
        		"医生交流",
        		"医院介绍"
        		
        };
    }
    
    OnClickListener hospitallinstener = new OnClickListener() {
  		@Override
  		public void onClick(View v) {
  			Intent intent = new Intent();
  			intent.setClass(MainMenuActivity.this, HospitalIntroActivity.class);
  			startActivity(intent);
  		}
  	};
    OnClickListener checkTableLinstener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainMenuActivity.this, CheckTableActivity.class);
			startActivity(intent);
		}
	};
    
    
    OnClickListener orderLinstener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(MainMenuActivity.this,ShopDisplayActivity.class);
			startActivity(intent);
		}
	};
    OnClickListener exitLinstener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			logout();
		}
	};
	
    OnClickListener numberLinstener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			final SharedPreferences sp = MainMenuActivity.this.getSharedPreferences(LoginActivity.name, 1);
			final String str = sp.getString("str", "");
			final String [] strs = str.split(";");
			int index = 0 ;
			for(int i=0;i<strs.length;i++){
				if(strs[i].equals("")){
					continue;
				}else{
					index++;
				}
			}
			Toast.makeText(MainMenuActivity.this, "预约总人数为："+index, Toast.LENGTH_LONG).show();
		}
	};
	
	OnClickListener changeTableLinstener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(MainMenuActivity.this,DecTallAboutActivity.class);
			startActivity(intent);
		}
	};
	
    OnClickListener unionTableLinstener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(MainMenuActivity.this,CheckTableActivity.class);
			startActivity(intent);
		}
	};
	OnClickListener changeTableLinstener1 = new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(MainMenuActivity.this,Decrecord.class);
			startActivity(intent);
		}
	};
	private void logout(){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("真的要退出系统吗？")
		       .setCancelable(false)
		       .setPositiveButton("确定", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		        	  SharedPreferences pres = getSharedPreferences("user_msg", MODE_WORLD_WRITEABLE);
		        	  SharedPreferences.Editor editor = pres.edit();
		        	  editor.putString("id", "");
		        	  editor.putString("name", "");
		        	  Intent intent = new Intent();
		        	  intent.setClass(MainMenuActivity.this, LoginActivity.class);
		        	  startActivity(intent);
		           }
		       })
		       .setNegativeButton("取消", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		                dialog.cancel();
		           }
		       });
		AlertDialog alert = builder.create();
		alert.show();
	}
}