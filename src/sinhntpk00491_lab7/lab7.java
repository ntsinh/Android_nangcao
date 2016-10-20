package sinhntpk00491_lab7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import screenoption.com.R;

public class lab7 extends Activity{
	EditText a,b,c;
	TextView Notifi;
	Button Tinh;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lab7);
		a =(EditText) findViewById(R.id.txtA);
		b =(EditText) findViewById(R.id.txtB);
		c =(EditText) findViewById(R.id.txtC);
		Tinh=(Button) findViewById(R.id.btnTinh);
		Notifi=(TextView) findViewById(R.id.txtNotifi);
		Event();
	}
	private void Event() {
		Tinh.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Lab7_Tinh.class);
				int A,B,C;
				A=Integer.parseInt(a.getText().toString());
				B=Integer.parseInt(b.getText().toString());
				C=Integer.parseInt(c.getText().toString());
				double delta,x1,x2;
				delta = (B*B)-4*A*C;
				if( (a.equals("")) || (b.equals(""))||(c.equals(""))){
					Notifi.setText("Vui lòng nhập giá trị vào");
				}else
				if(delta<0.0){
					intent.putExtra("gt1", "Phương trình vô nghiệm");
					startActivity(intent);
				}else if(delta==0.0){
					x1=(-B/(2*A));
					x1=Math.round(x1);
					
					intent.putExtra("gt1", "Phương trình có 2 nghiệm kép: x1= "+x1);
					startActivity(intent);
				}else{
					double delta_sqrt = Math.sqrt(delta);
					
					x1=((-B+delta_sqrt)/2*A);
					x2=((-B-delta_sqrt)/2*A);
					x1=Math.round(x1);
					x2=Math.round(x2);
					intent.putExtra("gt1", "x1= "+x1+"\nx2="+x2);
					startActivity(intent);
				}
			}
		});
		
	}
}
