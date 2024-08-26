package com.example.organizerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class homepage extends AppCompatActivity implements View.OnClickListener {

    View rootView;
    TextView text_welcome;
    Button button_dataTree, button_notes, button_reminders, button_expenditures;
    ImageView icon_welcome;
    boolean changed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        rootView = getWindow().getDecorView().getRootView();

        button_notes = findViewById(R.id.btn_notes);
        button_notes.setOnClickListener(this);

        button_reminders = findViewById(R.id.btn_reminder);
        button_reminders.setOnClickListener(this);

        button_dataTree = findViewById(R.id.btn_dataTree);
        button_dataTree.setOnClickListener(this);

        button_expenditures = findViewById(R.id.btn_expenditure);
        button_expenditures.setOnClickListener(this);

        icon_welcome = findViewById(R.id.icon_welcome);
        icon_welcome.setOnClickListener(this);

        text_welcome = findViewById(R.id.text_welcome);
        text_welcome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.equals(button_notes)) {
            clicked_notes();
        } else if (v.equals(button_reminders)) {
            clicked_reminder();
        } else if (v.equals(button_expenditures)) {
            clicked_expenditure();
        } else if (v.equals(button_dataTree)) {
            clicked_dataTrees();
        } else if (v.equals(icon_welcome)) {
            clicked_welcome_icon();
        } else if (v.equals(text_welcome)) {
            clicked_welcome_text();
        }
    }

    public void clicked_dataTrees(){
//        Toast.makeText(MainActivity.this, "TEST MESSAGE: DATA TREES CLICKED", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(homepage.this, dataTree.class);
        startActivity(intent);
    }

    public void clicked_notes(){
        Intent intent = new Intent(homepage.this, notes.class);
        startActivity(intent);
    }

    public void clicked_reminder(){
        Intent intent = new Intent(homepage.this, reminders.class);
        startActivity(intent);
    }

    public void clicked_expenditure(){
        Intent intent = new Intent(homepage.this, expenditures.class);
        startActivity(intent);
    }

    public void clicked_welcome_icon(){
        if(!changed) {
            rootView.setBackgroundColor(ContextCompat.getColor(getBaseContext(),R.color.grey));
            icon_welcome.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(getBaseContext(),R.color.white)));
            text_welcome.setTextColor(ContextCompat.getColor(getBaseContext(),R.color.white));
            Toast.makeText(homepage.this, "Welcome to the Dark Side!", Toast.LENGTH_SHORT).show();
            changed = true;
        }
        else {
            rootView.setBackgroundColor((ContextCompat.getColor(getBaseContext(),R.color.white)));
            icon_welcome.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(getBaseContext(),R.color.black)));
            text_welcome.setTextColor((ContextCompat.getColor(getBaseContext(),R.color.black)));
            Toast.makeText(homepage.this, "Welcome to the Light Side!", Toast.LENGTH_SHORT).show();
            changed = false;
        }
    }

    public void clicked_welcome_text(){

    }
}