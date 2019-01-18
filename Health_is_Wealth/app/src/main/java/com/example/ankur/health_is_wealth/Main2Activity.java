package com.example.ankur.health_is_wealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView table;
    TextView tab;
    TextView tablet;          //new
    EditText editText;
    EditText edit;
    Button button;
    int a;
    float b;
    float c;
    public void tap(View view)
    {
        Intent content=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(content);
    }


    public void were(View view){
      //  Log.i("gfd","ghgh");
        a=Integer.parseInt(editText.getText().toString());
        b=Float.parseFloat(edit.getText().toString());
        c=a/(b*b);

        //Commonly accepted BMI ranges are underweight: under 18.5 kg/m2, normal weight: 18.5 to 25, overweight: 25 to 30, obese: over 30.


        tab.setText("Your BMI is "+c);

        if (c>=25){
            tablet.setText("OOPS!! You are OVERWEIGHT.GO down to get fit ");
        } else if (c<=18.5)
        {
           tablet.setText("OOPS!! You are UNDERWEIGHT.GO down to get fit");
        }else {

            tablet.setText("GREAT!! You are fit");
        }


    }
    public void wow(View view){
        Intent from=new Intent(Main2Activity.this,Main3Activity.class);

        startActivity(from);

    }
    public void ear(View view){
        Intent yes=new Intent(Main2Activity.this,Main4Activity.class);

        startActivity(yes);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Intent intent=getIntent();
        String name=intent.getStringExtra("name");

        table=(TextView)findViewById(R.id.textView4);
        tab=(TextView)findViewById(R.id.textView3);
        tablet=(TextView)findViewById(R.id.textView5);
        editText=(EditText)findViewById(R.id.editText2) ;
        edit=(EditText)findViewById(R.id.editText3) ;
        table.setText("Lets find "+ name+", How healthy you are");









    }
}
