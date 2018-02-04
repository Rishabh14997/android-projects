package com.gmail.rishabh23jain.myapplication4;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

/**
 * Created by ST7 on 7/4/2017.
 */

public class Welcome extends Activity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        Intent i=getIntent();
        Bundle extras=i.getExtras();
        String name=extras.getString("name");
        String msg = "welcome "+name;

        TextView TextView_msg =(TextView) findViewById(R.id.textView_msg);
        TextView_msg.setText(msg);
    }
}
