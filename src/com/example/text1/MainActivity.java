package com.example.text1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	ImageView imgc,imgu;
	Button btn;
	TextView txt;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imgc = (ImageView)findViewById(R.id.imageView1);
        imgu = (ImageView)findViewById(R.id.imageView2);
        btn = (Button)findViewById(R.id.button1);
        txt = (TextView)findViewById(R.id.textView4);
        
        btn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		int randc = (int)Math.round(Math.random() * 5);
		int randu = (int)Math.round(Math.random() * 5);
		
		imgc.setImageResource(R.drawable.dice21 + randc);
		imgu.setImageResource(R.drawable.dice21 + randu);
		
		if(randc > randu)
			txt.setText("컴퓨터 이김 너집 ㅃㅇ 집가");
		else if(randc < randu)
			txt.setText("내가이김 컴터 꺼져 너 집가");
		else
			txt.setText("비겼어 다시해 집가지마");
		
	}
}
