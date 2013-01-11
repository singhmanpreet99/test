package com.android.gamble;

import java.util.Random;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.renderscript.Type;
import android.support.v4.app.NavUtils;
import android.text.InputType;

public class MainActivity extends Activity {
	int money=6000,bet=0;
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void mcbc(View v1)throws Exception
	{
		Button bu=  (Button) findViewById(R.id.button1);
		EditText et = (EditText) findViewById(R.id.editText1);
		//et.setInputType(InputType.TYPE_CLASS_NUMBER);
		final CharSequence[] Countries = { "1000", "2000", "3000" }; 
		AlertDialog.Builder boom = new AlertDialog.Builder(this);
		//hgelhehe
		boom.setTitle("choose bet amount");
		boom.setPositiveButton("ok",null);
		boom.setSingleChoiceItems(Countries, 0,new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				
				if(which==0)
				{
					bet=1000;
				}
				else if(which==1)
				{
					bet=2000;
				}
				else
				{
					bet=3000;
				}
				
			}
		});
		
		
				
				
				
				
				
				
		boom.create();
		boom.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String superr=et.getText().toString();
		AlertDialog.Builder aad = new AlertDialog.Builder(this);
		aad.setMessage(superr);
		aad.create();
		aad.show();
		aad.setPositiveButton("OK", null);
		/*bu.setText("hogaya");
		
		*/
		  int i=(int)(Math.random()*20);
		   while (i>6||i==0)
	        {
i=(int)(Math.random()*20);
//System.out.println(i);
//System.out.println("vadde paji");
i=((i%10)+1)+((i%10));
i=(i/2)+1;
i=(i/2)+1;  

	        		        	
	        }
		   

		//return(i);
		   if(i%2==0)
		   {
			   money=money+1000;
		   }
		   else
		   {
			   money=money-1000;
		   }
	String p=Integer.toString(money);
	
		bu.setText(p);
		if(money>=10000)
		{
			AlertDialog.Builder ad = new AlertDialog.Builder(this);
			ad.setMessage("You won!");
			ad.create();
			ad.show();
			ad.setPositiveButton("OK", null);
			//bu.setText("you won!");
			finish();
			
		}
		if(money==0)
		{
			//bu.setText("you lose :(");
			AlertDialog.Builder ad = new AlertDialog.Builder(this);
			ad.setMessage("You Lose :(");
			ad.create();
			ad.show();
			ad.setPositiveButton("OK", null);
			finish();
			
		}
		
		//display();
		//return i;
	
		
	}
	/*public void display()
	{
		setTitle("asd");
	}*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
