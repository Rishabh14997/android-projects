package com.gmail.rishabh23jain.isnotes;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button addNote;
    DatabaseHandler databaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addNote = (Button) findViewById(R.id.addNote);
        addNote.setOnClickListener(this);
        databaseHandler = new DatabaseHandler(this);

    }
    public void onClick(View v){
        Intent myIntent=new Intent(MainActivity.this, EditNoteActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("source", "addPress");
        myIntent.putExtras(bundle);
        startActivity(myIntent);
    }
}