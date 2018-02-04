package com.gmail.rishabh23jain.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Simple_FormActivity extends Activity {

    EditText et_name;
    Button but_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        et_name=(EditText) findViewById(R.id.editText_name);
        but_submit=(Button) findViewById(R.id.button_submit);
        but_submit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String name=et_name.getText().toString();
                if(name == "" || name.trim().length() == 0 || name== null)
                {
                    Toast.makeText(getApplicationContext(),"Kindly Enter Your Name",Toast.LENGTH_LONG).show();
                }else
                {
                    try{
                        Bundle b = new Bundle();
                        b.putString("name",name);
                        String pack=getPackageName() + ".Welcome";
                        Class cls = Class.forName(pack);
                        Intent i= new Intent(Simple_FormActivity.this,cls);
                        i.putExtras(b);
                        startActivity(i);

                    }catch (ClassNotFoundException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
