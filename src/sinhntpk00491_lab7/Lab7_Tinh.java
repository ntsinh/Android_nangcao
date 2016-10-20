package sinhntpk00491_lab7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import screenoption.com.R;

public class Lab7_Tinh extends Activity{
	TextView ketqua;
	Button Xoa,Back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lab7_pt);
		Xoa=(Button) findViewById(R.id.btnDel);
		Back=(Button) findViewById(R.id.btnback);
		ketqua=(TextView) findViewById(R.id.txtKetqua);
		String kq =getIntent().getExtras().getString("gt1");
		ketqua.setText(kq);
		Xoa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ketqua.setText("");
				
			}
		});
		Back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),lab7.class);
				startActivity(intent);
			}
		});
	}
}
