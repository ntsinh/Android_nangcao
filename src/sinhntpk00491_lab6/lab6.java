package sinhntpk00491_lab6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import screenoption.com.R;

public class lab6 extends Activity{
	Button Send;
	EditText Text1,Text2,Text3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lab6);
		
		Send=(Button) findViewById(R.id.btnSend);
		Text1 = (EditText) findViewById(R.id.txtName);
		Text2 = (EditText) findViewById(R.id.txtAddress);
		Text3 = (EditText) findViewById(R.id.txtWeight);
		Send.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String text1 =Text1.getText().toString();
				String text2 =Text2.getText().toString();
				String text3 =Text3.getText().toString();
				Intent intent =new Intent(getApplicationContext(),lab6_intent.class);
				intent.putExtra("gift1", text1);
				intent.putExtra("gift2", text2);
				intent.putExtra("gift3", text3);
				startActivity(intent);
			}
		});
	}
}
