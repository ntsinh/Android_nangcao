package sinhntpk00491_lab1;

import screenoption.com.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class lab1 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lab1);
		
		String doc="http://www.mediafire.com/download/69r7a5gu72r8z2z/l%E1%BA%A1c_l%E1%BB%91i.pdf";
		WebView wv = (WebView)findViewById(R.id.Wv);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setAllowFileAccess(true);
		wv.getSettings().setLoadsImagesAutomatically(true);
		wv.loadUrl(doc);
	}
}
