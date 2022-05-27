package com.example.my;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int value = 0;
    public void addone(View view){
        TextView tt = (TextView) findViewById(R.id.value);
        value++;
        tt.setText(""+value);
    }
    public void subone(View view){
        TextView tt = (TextView) findViewById(R.id.value);
        value--;
        tt.setText(""+value);
    }
    public void calculateprice(View view){
        TextView ttt = (TextView) findViewById(R.id.price);
        if(value<0){
            TextView tt = (TextView) findViewById(R.id.value);
            Toast.makeText(getApplicationContext(),"No of coffees can't be negative.",Toast.LENGTH_LONG).show();
            value = 0;
            tt.setText(""+0);

        }
        else{
            int price= value*5;
            ttt.setText("Price: $"+price);
        }

    }
    public void goto2ndpage(View view){
        Intent ii = new Intent(this,MainActivity2.class);
        startActivity(ii);
    }
    

}