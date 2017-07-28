package com.amaker.wlo;

import java.util.ArrayList;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.amaker.util.CheckTable;
import com.amaker.util.HttpUtil;

public class CheckTableActivity extends Activity implements OnItemClickListener{
	private GridView gv;
	private int count;
	private List<CheckTable> list = new ArrayList<CheckTable>();
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("“©ŒÔΩÈ…‹");
		setContentView(R.layout.check_table);
        gv = (GridView) findViewById(R.id.check_table_gridview);
        getTableList();
        gv.setAdapter(new ImageAdapter(this));
        gv.setOnItemClickListener(this);
	}
	
	private void getTableList(){
		String url = HttpUtil.BASE_URL+"servlet/DrugIntroductionServlet";
		String result = HttpUtil.queryStringForPost(url);
		parseJsonMulti(result);
	}
	
    private void parseJsonMulti(String strResult) {   
        try {   
            JSONArray jsonObjs = new JSONObject(strResult).getJSONArray("tablelist");
            String s = "";   
            for(int i = 0; i < jsonObjs.length() ; i++){   
                JSONObject jsonObj = ((JSONObject)jsonObjs.opt(i)).getJSONObject("table");   
                CheckTable shop = new CheckTable();
                shop.setNum(jsonObj.getString("num"));
                shop.setFlag(jsonObj.getString("flag"));
                shop.setPresionName(jsonObj.getString("presionName"));
                shop.setType(jsonObj.getString("type"));
                list.add(shop);
            }   
        } catch (JSONException e) {   
            System.out.println("Jsons parse error !");   
            e.printStackTrace();   
        }   
    }   
	
    public class ImageAdapter extends BaseAdapter {
        private Context mContext;
        public ImageAdapter(Context c) {
            mContext = c;
        }
        public int getCount() {
            return list.size();
        }
        public Object getItem(int position) {
            return null;
        }
        public long getItemId(int position) {
            return 0;
        }
        public View getView(int position, View convertView, ViewGroup parent) {
        	LayoutInflater inflater = 
        		LayoutInflater.from(CheckTableActivity.this);
        	View v = null;
        	ImageView imageView =null;
        	TextView tv =null;
            if (convertView == null) {
            	v = inflater.inflate(R.layout.check_table_view,null);
                v.setPadding(8, 8, 8, 8);
            } else {
                v = (View) convertView;
            }
            imageView = (ImageView) v.findViewById(R.id.check_table_ImageView01);
            tv = (TextView) v.findViewById(R.id.check_tableTextView01);
            CheckTable ct = (CheckTable) list.get(position);
            tv.setText(ct.getNum()+"");
            return v;
        }
    }

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		Intent intent = new Intent(CheckTableActivity.this,DecDetialYaoWu.class);
		Bundle bundle = new Bundle();
		bundle.putSerializable("table", list.get(arg2));
		intent.putExtras(bundle);
		CheckTableActivity.this.startActivity(intent);
	}
}
