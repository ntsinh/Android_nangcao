package sinhntpk00491_lab3;

import screenoption.com.R;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import sinhntpk00491_lab3.lab3_1;

public class lab3 extends Activity implements OnClickListener{
	EditText user,pass;
	TextView Register,Forgot;
	Button btnlog;
	TextView register,forgot;
	
	BroadcastReceiver Receiver = new BroadcastReceiver() {
		
		@Override
		public void onReceive(Context context, Intent intent) {
			ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
			if(connectivityManager.getActiveNetworkInfo()!=null){
				btnlog.setEnabled(true);
				Toast.makeText(getApplicationContext(), "Đã kết nối wifi", Toast.LENGTH_LONG).show();
			}else{
				btnlog.setEnabled(false);
				Toast.makeText(getApplicationContext(), "Không thể kết nối wifi", Toast.LENGTH_LONG).show();
			}
		}
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lab3);
		user = (EditText) findViewById(R.id.username);
		Register = (TextView) findViewById(R.id.register);
		Forgot = (TextView) findViewById(R.id.forgot);
		pass = (EditText) findViewById(R.id.repass);
		btnlog = (Button) findViewById(R.id.btnLogin);
		Register.setOnClickListener(this);
		Forgot.setOnClickListener(this);
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		IntentFilter fillterwifi = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
		registerReceiver(Receiver, fillterwifi);
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if(Receiver!=null){
			unregisterReceiver(Receiver);
		}
	}
	@Override
	public void onClick(View v) {
		if(v==Register){
			Intent intent = new Intent(getApplicationContext(),lab3_1.class);
			startActivity(intent);
		}
		if(v==Forgot){
			Intent intent = new Intent(getApplicationContext(),lab3_2.class);
			startActivity(intent);
		}
	}
}
