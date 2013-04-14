package com.example.animalsounds;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class PlaySoundActivity extends Activity {
int count=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play_sound);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_play_sound, menu);
		return true;
	}
	
	public void click_sound(View view)
	{
		
		int rawfile=R.raw.cow;
		Log.d("in click", "in click hello");
		MediaPlayer ourSong=MediaPlayer.create(this, rawfile);
		ourSong.start();
		ImageView imageView=(ImageView)findViewById(R.id.imageView1);
		if(count>1){
			imageView.setImageResource(R.drawable.birds);
			count++;
		}
		else{
		imageView.setImageResource(R.drawable.cow);
		count++;
		}
	}

}
