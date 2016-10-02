package sinhntpk00491_lab5;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;
import screenoption.MainActivity;
import screenoption.com.R;

public class lab5 extends Activity{
	ListView Lv;
	ArrayList<Danhba> dsDanhba;
	Danhba_Adapter dbAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lab5_lv);
		
		Lv = (ListView) findViewById(R.id.Lv);
		dsDanhba = new ArrayList<Danhba>();
		dsDanhba.add(new Danhba(1,"Tuấn","0971234567"));
		dsDanhba.add(new Danhba(2,"Nhung","0971234567"));
		dsDanhba.add(new Danhba(3,"Nguyên","0971234567"));
		dsDanhba.add(new Danhba(4,"Tui","0971234567"));
		dsDanhba.add(new Danhba(5,"Duy","0971234567"));
		dsDanhba.add(new Danhba(6,"Hoàng","0971234567"));
		dsDanhba.add(new Danhba(7,"Ánh","0971234567"));
		dsDanhba.add(new Danhba(8,"Nguyệt","0971234567"));
		dsDanhba.add(new Danhba(9,"Hưng","0971234567"));
		dsDanhba.add(new Danhba(10,"Huy","0971234567"));
		dsDanhba.add(new Danhba(11,"Đan","0971234567"));
		dsDanhba.add(new Danhba(12,"Bảo","0971234567"));
		dsDanhba.add(new Danhba(13,"Ngọc","0971234567"));
		dsDanhba.add(new Danhba(14,"Quỳnh","0971234567"));
		dsDanhba.add(new Danhba(15,"Minh","0971234567"));
		dsDanhba.add(new Danhba(16,"Hương","0971234567"));
		dsDanhba.add(new Danhba(17,"Hiếu","0971234567"));
		dsDanhba.add(new Danhba(18,"Trường","0971234567"));
		dsDanhba.add(new Danhba(19,"Lâm","0971234567"));
		dsDanhba.add(new Danhba(20,"Long","0971234567"));
		dbAdapter = new Danhba_Adapter(this, R.layout.item_new, dsDanhba);
		Lv.setAdapter(dbAdapter);
	}
}
