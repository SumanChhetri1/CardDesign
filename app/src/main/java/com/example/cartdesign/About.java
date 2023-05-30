package com.example.cartdesign;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void delete(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(About.this);
        builder.setMessage("Do you want to delete");
        builder.setTitle("Alert!!");
        builder.setCancelable(true);
        builder.setPositiveButton("Yes",(DialogInterface.OnClickListener)(dialog,which)->{
            finish();
        });
        builder.setNegativeButton("No",(DialogInterface.OnClickListener)(dialog,which)->{
            dialog.cancel();
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}