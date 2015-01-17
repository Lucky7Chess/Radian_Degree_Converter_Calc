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


public class MainActivity extends ActionBarActivity {


   protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1=(EditText) findViewById(R.id.editText1);
        final EditText editText2=(EditText) findViewById(R.id.editText2);
        final EditText editText3=(EditText) findViewById(R.id.editText3);
        final Button button1=(Button) findViewById(R.id.button1);
        final Button button2=(Button) findViewById(R.id.button2);






        button1.setOnClickListener(new View.OnClickListener() {//clear button
            @Override
            public void onClick(View view) {
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            }
        });



        editText1.addTextChangedListener(new TextWatcher() {//listen for when textin textbox1 changed
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
 /*              if (TextUtils.isEmpty(editText1.getText())){//if its empty

                   editText2.setFocusable(true);
                   editText3.setFocusable(true);
               }
                else{*/
                if(editText1.getText()!=null){
                   float number11 =Float.valueOf(editText1.getText().toString());
                   float calcNumber11=number11/180;
                   float calcNumber12= (float) (calcNumber11*3.14);
                   String output11=Float.toString(calcNumber11);
                   String output12=Float.toString(calcNumber12);
                   editText2.setText(output11);
                   editText3.setText(output12);}
            //       editText2.setFocusable(false);
             //      editText3.setFocusable(false);
             //  }

            }

            @Override
            public void afterTextChanged(Editable editable) {

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



