package com.example.roshangulgulia.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void reset(View view){
        ImageView iv=(ImageView)findViewById(R.id.iv);
        TextView t1=(TextView)findViewById(R.id.t1);
        TextView t2=(TextView)findViewById(R.id.t2);
        iv.setImageResource(R.drawable.indian);
        t1.setText("");
        t2.setText("");

    }
    public void click(View view){
        ImageView iv=(ImageView)findViewById(R.id.iv);
        TextView t1=(TextView)findViewById(R.id.t1);
        TextView t2=(TextView)findViewById(R.id.t2);
        String rs=t1.getText().toString();
        double ps;
        try {
            ps = Double.parseDouble(rs);
            ps=ps*0.015;
            rs=Double.toString(ps);
        } catch(NumberFormatException nfe) {
            Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_SHORT).show();
        }
        t2.setText(rs);
        iv.setImageResource(R.drawable.dollar);
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
