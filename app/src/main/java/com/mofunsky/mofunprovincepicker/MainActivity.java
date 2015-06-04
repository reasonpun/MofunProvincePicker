package com.mofunsky.mofunprovincepicker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mofunsky.mofunprovincepicker.CitiesActivity;
import com.mofunsky.mofunprovincepicker.R;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	
	public void toCities(View view)
	{
		Intent intent = new Intent(this,CitiesActivity.class);
		startActivity(intent);
	}
}
