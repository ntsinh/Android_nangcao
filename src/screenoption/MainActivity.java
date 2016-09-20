package screenoption;

import screenoption.com.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import sinhntpk00491_lab1.lab1;
import sinhntpk00491_lab2.lab2;
import sinhntpk00491_lab3.lab3;
import sinhntpk00491_lab4.lab4;

public class MainActivity extends Activity implements OnClickListener{
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screenoption);
		
		btn1= (Button) findViewById(R.id.btn1);
		btn2= (Button) findViewById(R.id.btn2);
		btn3= (Button) findViewById(R.id.btn3);
		btn4= (Button) findViewById(R.id.btn4);
		btn5= (Button) findViewById(R.id.btn5);
		btn6= (Button) findViewById(R.id.btn6);
		btn7= (Button) findViewById(R.id.btn7);
		btn8= (Button) findViewById(R.id.btn8);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		btn7.setOnClickListener(this);
		btn8.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
//		if(v==btn1){
//			Intent intent = new Intent(getApplicationContext(),lab1.class);
//			startActivity(intent);
//		}
		if(v==btn2){
			Intent intent = new Intent(getApplicationContext(),lab2.class);
			startActivity(intent);
		}
		if(v==btn3){
			Intent intent = new Intent(getApplicationContext(),lab3.class);
			startActivity(intent);
		}
//		if(v==btn4){
//			Intent intent = new Intent(getApplicationContext(),lab4.class);
//			startActivity(intent);
//		}
//		if(v==btn5){
//			Intent intent = new Intent(getApplicationContext(),lab5.class);
//			startActivity(intent);
//		}
//		if(v==btn6){
//			Intent intent = new Intent(getApplicationContext(),lab6.class);
//			startActivity(intent);
//		}
//		if(v==btn7){
//			Intent intent = new Intent(getApplicationContext(),lab7.class);
//			startActivity(intent);
//		}
//		if(v==btn8){
//			Intent intent = new Intent(getApplicationContext(),lab8.class);
//			startActivity(intent);
//		}
	}

	
}
