package com.example.fin;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class PotActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pot);
		initDisplayButton();
		initDisplayButton2();
		NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker1);

        //Set TextView text color
        //tv.setTextColor(Color.parseColor("#ffd32b3b"));

        //Populate NumberPicker values from minimum and maximum value range
        //Set the minimum value of NumberPicker
        np.setMinValue(0);
        //Specify the maximum value/number of NumberPicker
        np.setMaxValue(100);

        //Gets whether the selector wheel wraps when reaching the min/max value.
        np.setWrapSelectorWheel(false);
        TextView tv = (TextView) findViewById(R.id.textView3);
        TextView tv1 = (TextView) findViewById(R.id.textView4);
        //boolean visible = (boolean) false;
        		tv.setVisibility(View.INVISIBLE);
        		tv1.setVisibility(View.INVISIBLE);

        //Set a value change listener for NumberPicker
        /*np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
                tv.setText("Selected Number : " + newVal);
            }*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pot, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	private void initDisplayButton(){
		Button displayButton = (Button) findViewById( R.id.button1); 
	
	displayButton.setOnClickListener( new OnClickListener() {
		
		public void onClick( View arg0) {
			EditText editName = (EditText) findViewById( R.id.editText1);
			NumberPicker number = (NumberPicker) findViewById(R.id.numberPicker1);
            int tip= (number.getValue());
           // int tip=Integer.parseInt(tip1);
            TextView textDisplay = (TextView) findViewById( R.id.textView3);
            TextView textDisplay1 = (TextView) findViewById( R.id.textView4);
            boolean visible = (boolean) true;
            textDisplay.setCursorVisible(visible);
		String nameToDisplay = (editName.getText(). toString()); 
		textDisplay.setVisibility(View.VISIBLE);
textDisplay.setVisibility(View.VISIBLE);
		int num=Integer.parseInt(nameToDisplay);
		float calculate=(float) (num*tip/100);
		textDisplay1.setText(""+calculate);
		textDisplay.setText(""+(num+calculate));
		
		} }); }
	
	private void initDisplayButton2(){
		Button displayButton1 = (Button) findViewById( R.id.button2); 
	
	displayButton1.setOnClickListener( new OnClickListener() {
		
		public void onClick( View arg0) {
			EditText editName = (EditText) findViewById( R.id.editText1);
			NumberPicker number = (NumberPicker) findViewById(R.id.numberPicker1);

			TextView textDisplay = (TextView) findViewById( R.id.textView2); // 5 
			TextView textDisplay1 = (TextView) findViewById( R.id.textView3); // 5 

			editName.setText("");
			textDisplay1.setText("");

		} }); }
		}

