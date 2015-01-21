package theteendevs.radiandegreeconvertercalc;

import android.app.ActionBar;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
public int active;

   protected void onCreate(Bundle savedInstanceState) {


       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       final EditText editText1 = (EditText) findViewById(R.id.editText1);
       final EditText editText2 = (EditText) findViewById(R.id.editText2);
       final EditText editText3 = (EditText) findViewById(R.id.editText3);
       final Button button1 = (Button) findViewById(R.id.button1);
       final Button button2 = (Button) findViewById(R.id.button2);


       button1.setOnClickListener(new View.OnClickListener() {//clear button
           @Override
           public void onClick(View view) {
               editText1.setText("");
               editText2.setText("");
               editText3.setText("");
           }
       });
       editText1.setOnClickListener(new View.OnClickListener() {//clear button
           @Override
           public void onClick(View view) {
               Editable text1 = editText1.getText();
               active=1;


               if (text1.length() != 0) {
                   float number11 = Float.valueOf(editText1.getText().toString());
                   float calcNumber11 = number11 / 180;
                   float calcNumber12 = (float) (calcNumber11 * 3.14);
                   String output11 = Float.toString(calcNumber11);
                   String output12 = Float.toString(calcNumber12);
                   editText2.setText(output11);
                   editText3.setText(output12);
               } else {
                   editText2.setText("");
                   editText3.setText("");
               }

           }
       });

       editText2.setOnClickListener(new View.OnClickListener() {//clear button
           @Override
           public void onClick(View view) {
               Editable text2 = editText2.getText();
               active=2;
               if (text2.length() != 0) {
                   float number22 = Float.valueOf(editText2.getText().toString());
                   float calcNumber23 = (float) (number22 * Math.PI);
                   float calcNumber21 = (float) (number22 * 180);
                   String output21 = Float.toString(calcNumber21);
                   String output23 = Float.toString(calcNumber23);
                   editText1.setText(output21);
                   editText3.setText(output23);
               } else {
                   editText1.setText("");
                   editText3.setText("");
               }
           }
       });
       editText3.setOnClickListener(new View.OnClickListener() {//clear button
           @Override
           public void onClick(View view) {
               Editable text3 = editText3.getText();
              active=3;
               if (text3.length() != 0) {
                   float number33 = Float.valueOf(editText3.getText().toString());
                   float calcNumber32 = (float) (number33 / Math.PI);
                   float calcNumber31 = (float) (calcNumber32 * 180);
                   String output31 = Float.toString(calcNumber31);
                   String output32 = Float.toString(calcNumber32);
                   editText1.setText(output31);
                   editText2.setText(output32);
               } else {
                   editText1.setText("");
                   editText2.setText("");
               }
           }
       });


       button2.setOnClickListener(new View.OnClickListener() {//clear button
           @Override
           public void onClick(View view) {
               Editable text1 = editText1.getText();
               Editable text2 = editText2.getText();
               Editable text3 = editText3.getText();
               if (active==1 /*text1.length() != 0 && text2.length()==0 && text3.length()==0*/) {
                   float number11 = Float.valueOf(editText1.getText().toString());
                   float calcNumber11 = number11 / 180;
                   float calcNumber12 = (float) (calcNumber11 * 3.14);
                   String output11 = Float.toString(calcNumber11);
                   String output12 = Float.toString(calcNumber12);
                   editText2.setText(output11);
                   editText3.setText(output12);
               }

               if (active==2/*text1.length() == 0 && text2.length()!=0 && text3.length()==0*/) {
                   float number22 = Float.valueOf(editText2.getText().toString());
                   float calcNumber23 = (float) (number22 * Math.PI);
                   float calcNumber21 = (float) (number22 * 180);
                   String output21 = Float.toString(calcNumber21);
                   String output23 = Float.toString(calcNumber23);
                   editText1.setText(output21);
                   editText3.setText(output23);
               }

               if (active==3/*text1.length() == 0 && text2.length()==0 && text3.length()!=0*/) {
                   float number33 = Float.valueOf(editText3.getText().toString());
                   float calcNumber32 = (float) (number33 / Math.PI);
                   float calcNumber31 = (float) (calcNumber32 * 180);
                   String output31 = Float.toString(calcNumber31);
                   String output32 = Float.toString(calcNumber32);
                   editText1.setText(output31);
                   editText2.setText(output32);
               }
               if (text1.length() == 0 && text2.length()==0 && text3.length()==0) {
                   editText1.setText("");
                   editText2.setText("");
                   editText3.setText("");
               }
               /*if((text1.length()!=0&&text2.length()!=0)||(text1.length()!=0&&text3.length()!=0)||(text2.length()!=0&&text3.length()!=0)||(text1.length()!=0&&text2.length()!=0)&&text3.length()!=0){

                   Toast.makeText(getApplicationContext(), "oKAY", Toast.LENGTH_SHORT).show();


               }*/
           }
       });




   }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();




        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    }



