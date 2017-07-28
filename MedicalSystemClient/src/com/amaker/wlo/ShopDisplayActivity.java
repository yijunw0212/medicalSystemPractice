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
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.amaker.util.HttpUtil;
import com.amaker.util.Shop;

public class ShopDisplayActivity extends Activity implements OnItemClickListener,OnClickListener{

	private GridView gv;
	private ArrayList<Shop> list = new ArrayList<Shop>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shop_display);
		initView();
		initData();
	}

	private void initData() {
		getShopList();
	}

	private void initView() {
		gv = (GridView) findViewById(R.id.shop_gridview);
		gv.setAdapter(new ImageAdapter(this));
		gv.setOnItemClickListener(this);
		Button map = (Button)findViewById(R.id.map);
		map.setOnClickListener(this);
		
	}
	
	private void getShopList(){
		String url = HttpUtil.BASE_URL+"servlet/CheckShopServlet";
		String result = HttpUtil.queryStringForPost(url);
		parseJsonMulti(result);
		
	}
	
    private void parseJsonMulti(String strResult) {   
        try {   
            JSONArray jsonObjs = new JSONObject(strResult).getJSONArray("shoplist");
            String s = "";   
            for(int i = 0; i < jsonObjs.length() ; i++){   
                JSONObject jsonObj = ((JSONObject)jsonObjs.opt(i)).getJSONObject("shop");   
                Shop shop = new Shop();
                shop.setName(jsonObj.getString("name"));
                shop.setType(jsonObj.getString("type"));
                shop.setMoney(jsonObj.getString("money"));
                shop.setZhicheng(jsonObj.getString("zhicheng"));
                list.add(shop);
            }   
        } catch (JSONException e) {   
            System.out.println("Jsons parse error !");   
            e.printStackTrace();   
        }   
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
            return list.size();
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
        	LayoutInflater inflater = 
        		LayoutInflater.from(ShopDisplayActivity.this);
        	View v = null;
        	ImageView imageView =null;
        	TextView tv =null;
            if (convertView == null) {
            	// 实例化图片视图
            	v = inflater.inflate(R.layout.check_table_view,null);
            	// 设置图片视图属性
                v.setPadding(8, 8, 8, 8);
            } else {
                v = (View) convertView;
            }
            imageView = (ImageView) v.findViewById(R.id.check_table_ImageView01);
            tv = (TextView) v.findViewById(R.id.check_tableTextView01);
            Shop ct = (Shop) list.get(position);
            imageView.setImageResource(R.drawable.business_default_image);
            tv.setText(ct.getName());
            return v;
        }
    }

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		Intent intent = new Intent(ShopDisplayActivity.this,DecDetial.class);
		intent.putExtra("shop",list.get(arg2) );
		ShopDisplayActivity.this.startActivity(intent);
	}

	@Override
	public void onClick(View arg0) {
		Intent intent = new Intent(this,DecCheckHist.class);
		this.startActivity(intent);
	}
	
	
}
