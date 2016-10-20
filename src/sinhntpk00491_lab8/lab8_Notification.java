package sinhntpk00491_lab8;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.widget.TextView;
import screenoption.com.R;

public class lab8_Notification extends Activity{
	TextView thongbao;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lab8_notifi);
		
		thongbao =(TextView) findViewById(R.id.txtNoti);
		int requestCode = getIntent().getExtras().getInt("requestCode");
		
		DongNotification(requestCode);
		thongbao.setText("Đã đóng thông báo số "+requestCode+ "\n Có thể dùng ID này để hiển thị chi tiết");
	}
	private void DongNotification(int notiId) {
		NotificationManager notima= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notima.cancel(notiId);
		
	}
}
