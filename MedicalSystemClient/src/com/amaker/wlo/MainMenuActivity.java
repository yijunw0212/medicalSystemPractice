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
        setTitle("ҽ����Ϣ����ϵͳ-���˵�");
        setContentView(R.layout.main_menu);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
    }
    
    // �̳�BaseAdapter
    public class ImageAdapter extends BaseAdapter {
    	// ������
        private Context mContext;
        // ���췽��
        public ImageAdapter(Context c) {
            mContext = c;
        }
        // �������
        public int getCount() {
            return mThumbIds.length;
        }
        // ��ǰ���
        public Object getItem(int position) {
            return null;
        }
        // ��ǰ���id
        public long getItemId(int position) {
            return 0;
        }
        // ��õ�ǰ��ͼ
        public View getView(int position, View convertView, ViewGroup parent) {
        	// ����ͼƬ��ͼ
            TextView text;
            if (convertView == null) {
            	// ʵ����ͼƬ��ͼ
            	text = new TextView(mContext);
                // ����ͼƬ��ͼ����
            	text.setLayoutParams(new GridView.LayoutParams(100, 100));
            	text.setPadding(8, 8, 8, 8);
            } else {
            	text = (TextView) convertView;
            }
            // ����ͼƬ��ͼͼƬ��Դ
            text.setText(mThumbIds[position]);
            // Ϊ��ǰ��ͼ��Ӽ�����
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
//				Toast.makeText(MainMenuActivity.this, "ԤԼ������Ϊ��"+index, Toast.LENGTH_LONG).show();
				
				
			default:
				break;
			}
            
            return text;
        }
        private String[] mThumbIds = {
        		"���߹Һ���ԤԼ",
        		"ҩ�����",
        		"������¼",
        		"��������",
        		"ҽ������",
        		"ҽԺ����"
        		
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
			Toast.makeText(MainMenuActivity.this, "ԤԼ������Ϊ��"+index, Toast.LENGTH_LONG).show();
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
		builder.setMessage("���Ҫ�˳�ϵͳ��")
		       .setCancelable(false)
		       .setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
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
		       .setNegativeButton("ȡ��", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		                dialog.cancel();
		           }
		       });
		AlertDialog alert = builder.create();
		alert.show();
	}
}