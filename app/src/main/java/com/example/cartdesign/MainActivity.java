package com.example.cartdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_example,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, "Click Me", Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){
            case R.id.item1:
                return true;
            case R.id.item2:
                Intent intent=new Intent(getApplicationContext(),About.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}