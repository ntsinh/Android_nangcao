package sinhntpk00491_lab5;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import screenoption.com.R;

public class Danhba_Adapter extends ArrayAdapter<Danhba>{
	Activity context;
	int resource;
	List<Danhba> objects;
	public Danhba_Adapter(Activity context, int resource, List<Danhba> objects) {
		super(context, resource, objects);
		this.context = context;
		this.resource = resource;
		this.objects =objects;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// LayoutInflater là 1 lớp dùng để build 1 layout bình thường thành 1 cái code java
		LayoutInflater inflater = this.context.getLayoutInflater();
		View row=inflater.inflate(this.resource, null);
		// để lấy các thành phần trong giao diện >
		TextView Name = (TextView) row.findViewById(R.id.name);
		TextView Phone = (TextView) row.findViewById(R.id.phoneNb);
		ImageButton Call = (ImageButton) row.findViewById(R.id.btnPhone);
		ImageButton SMS = (ImageButton) row.findViewById(R.id.btnSms);
		ImageButton Info = (ImageButton) row.findViewById(R.id.btnInfo);
		// Trả về danh bạ muốn vẽ
		Danhba danhba = this.objects.get(position);
		Name.setText(danhba.getTen());
		Phone.setText(danhba.getPhone());
		return row;
	}

}
