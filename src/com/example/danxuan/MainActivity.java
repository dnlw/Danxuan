package com.example.danxuan;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Spinner spinner;
	private TextView tv1;
	private ArrayAdapter<String> adapter;
	private static final String[] sexs ={"ÄÐ","Å®",""};
	private ArrayList<String> array= new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	spinner=(Spinner)findViewById(R.id.spinner1);
	tv1=(TextView)findViewById(R.id.tv);
	adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,sexs);
	//ArrayAdapter arrayAdapter=ArrayAdapter.createFromResource(this, R.array.arrys, android.R.layout.simple_spinner_item);
	
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
	spinner.setAdapter(adapter);
	spinner. setOnItemSelectedListener(new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> parent, View view, int position,
				long id) {
			// TODO Auto-generated method stub
			//TextView sex=(TextView)view;
			String sex=sexs [position];
			tv1.setText(sex);
			parent.setVisibility(View.VISIBLE);
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			tv1.setText("Ã»Ñ¡Ôñ");	
		}
		
		
	});
	
	
	}

	

}
