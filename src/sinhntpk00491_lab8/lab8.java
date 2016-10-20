package sinhntpk00491_lab8;

import java.util.Random;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import screenoption.com.R;

public class lab8 extends Activity{
	Button Notifi,Close;
	int notiId;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lab8);
		Notifi=(Button) findViewById(R.id.btnNotifi);
		Close=(Button) findViewById(R.id.btnCloseNotifi);
		Event();
	}
	private void Event() {
		Notifi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TaoNotifi();
				
			}

			

		});
		Close.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DongNotifi();
				
			}

			
		});
		
	}
	private void TaoNotifi() {
		notiId= Hamtaoma();
		Notification.Builder noti = new Notification.Builder(getApplicationContext());
		noti.setSmallIcon(R.drawable.ic_launcher);
		noti.setContentTitle("Có thông báo mới "+notiId);
		noti.setContentText("Cập nhật version");
		
		Intent intent = new Intent(getApplicationContext(),lab8_Notification.class);
		intent.putExtra("requestCode", notiId);
		PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), notiId, intent, PendingIntent.FLAG_UPDATE_CURRENT);
		noti.setContentIntent(pendingIntent);
		Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
		noti.setSound(uri);
		NotificationManager notima= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notima.notify(notiId,noti.build());
	}

	private int Hamtaoma() {
		Random random =new Random();
		int ma = random.nextInt();
		return ma;
	}
	private void DongNotifi() {
		NotificationManager notima= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notima.cancelAll();
	}
}
