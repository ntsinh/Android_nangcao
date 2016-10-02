package sinhntpk00491_lab3;

import screenoption.com.R;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.*;
import sinhntpk00491_lab3.lab3_1;

public class lab3 extends Activity implements OnClickListener{
	EditText user,pass;
	TextView Register,Forgot,notifi;
	Button btnlog;
	TextView register,forgot;
	Dialog dialogRegister;
	BroadcastReceiver Receiver = new BroadcastReceiver() {
		
		@Override
		public void onReceive(Context context, Intent intent) {
			ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
			if(connectivityManager.getActiveNetworkInfo()!=null){
				btnlog.setEnabled(true);
				Toast.makeText(getApplicationContext(), "Đã kết nối wifi", Toast.LENGTH_SHORT).show();
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
		user = (EditText) findViewById(R.id.txtUsername);
		pass = (EditText) findViewById(R.id.txtRepass);
		notifi = (TextView) findViewById(R.id.Notifi);
		Register = (TextView) findViewById(R.id.register);
		Forgot = (TextView) findViewById(R.id.forgot);
		btnlog = (Button) findViewById(R.id.btnLogin);
		Register.setOnClickListener(this);
		Forgot.setOnClickListener(this);
		btnlog.setOnClickListener(this);
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
	public void DialogDangky() {
		dialogRegister = new Dialog(this);
		dialogRegister.requestWindowFeature(dialogRegister.getWindow().FEATURE_NO_TITLE);
		dialogRegister.setContentView(R.layout.lab3_1_register); 
		final TextView Notifi;
		final EditText Password;
		final EditText repass;
		final EditText username;
		Button close = (Button) dialogRegister.findViewById(R.id.btnClose);
		Button register = (Button) dialogRegister.findViewById(R.id.btnRegister);
		Notifi=(TextView) dialogRegister.findViewById(R.id.txtnotifi);
		username=(EditText) dialogRegister.findViewById(R.id.txtUsername);
		Password=(EditText) dialogRegister.findViewById(R.id.txtPassword);
		repass=(EditText) dialogRegister.findViewById(R.id.txtRepass);
		dialogRegister.show();
		close.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialogRegister.dismiss();
				
			}
		});
		register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String Users = username.getText().toString();
				String Pass = Password.getText().toString();
				String Repass = repass.getText().toString();
				
				if((Users.equals("")) || (Pass.equals(""))){
					Notifi.setText("Bạn chưa nhập tài khoản");
				}else if((Pass.equals(Repass))){
					Notifi.setText("Đăng kí thành công");
				}else{
					Notifi.setText("Mật khẩu không khớp");
		 		}
				
			}
		});
	} 
	@Override
	public void onClick(View v) {
		
		if(v==btnlog){
			String users=user.getText().toString();
			String password = pass.getText().toString();
			if((users.equals("") || password.equals(""))){
				notifi.setText("Bạn chưa nhập tài khoản");
			}else
			if((users.equals("admin")) && (password.equals("admin")) ){
				Intent intent = new Intent(getApplicationContext(),lab3_manager.class);
				startActivity(intent);
			}else{
				notifi.setText("Sai tài khoản hoặc mật khẩu");
			}
		}
		if(v==Register){
			DialogDangky();
		}
		if(v==Forgot){
			Intent intent = new Intent(getApplicationContext(),lab3_2.class);
			startActivity(intent);
		}
	}
}
