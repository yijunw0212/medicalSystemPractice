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

import com.amaker.util.HospitalIntro;
import com.amaker.util.HttpUtil;

public class HospitalIntroActivity extends Activity implements OnItemClickListener{
	private GridView gv;
	private int count;
	private List<HospitalIntro> list = new ArrayList<HospitalIntro>();
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("“Ω‘∫ΩÈ…‹");
		setContentView(R.layout.hospitalintro);
        gv = (GridView) findViewById(R.id.hospitalintro);
        getHospitals();
        gv.setAdapter(new ImageAdapter(this));
        gv.setOnItemClickListener(this);
	}
	
	private void getHospitals(){
		String url = HttpUtil.BASE_URL+"servlet/CheckHospitalsServlet";
		String result = HttpUtil.queryStringForPost(url);
		parseJsonMulti(result);
	}
	
    private void parseJsonMulti(String strResult) {   
        try {   
            JSONArray jsonObjs = new JSONObject(strResult).getJSONArray("hospitallist");
            String s = "";   
            for(int i = 0; i < jsonObjs.length() ; i++){   
                JSONObject jsonObj = ((JSONObject)jsonObjs.opt(i)).getJSONObject("hospital");   
                HospitalIntro hospitals = new HospitalIntro();
                hospitals.setName(jsonObj.getString("name"));
                hospitals.setPhone(jsonObj.getString("phone"));
                hospitals.setIntro(jsonObj.getString("intro"));
                hospitals.setAddress(jsonObj.getString("address"));
                list.add(hospitals);
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
        		LayoutInflater.from(HospitalIntroActivity.this);
        	View v = null;
        	ImageView imageView =null;
        	TextView tv =null;
            if (convertView == null) {
            	v = inflater.inflate(R.layout.check_hospital_view,null);
                v.setPadding(8, 8, 8, 8);
            } else {
                v = (View) convertView;
            }
            imageView = (ImageView) v.findViewById(R.id.check_hospital_ImageView01);
            tv = (TextView) v.findViewById(R.id.check_hospitalTextView01);
            HospitalIntro ct = (HospitalIntro) list.get(position);
            tv.setText(ct.getName()+"");
            return v;
        }
    }

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		Intent intent = new Intent(HospitalIntroActivity.this,DecDetialYiYuan.class);
		Bundle bundle = new Bundle();
		bundle.putSerializable("hospital", list.get(arg2));
		intent.putExtras(bundle);
		HospitalIntroActivity.this.startActivity(intent);
	}
}
