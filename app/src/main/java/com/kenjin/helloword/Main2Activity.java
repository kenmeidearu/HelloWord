package com.kenjin.helloword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View view) {
        //Log.e("tes", "tes"+view.getId());
        switch (view.getId()){
            case R.id.button1:
                Intent intent=new Intent(this,MainActivity.class);
                intent.putExtra("string1","belajar intent");
                startActivity(intent);
                break;
            case  R.id.button2:
                Intent intent2=new Intent(this,MainActivity.class);
                intent2.putExtra(MainActivity.Data_Intent,"Data inent");
                startActivity(intent2);
                break;
            case  R.id.button3:
                Intent intent3=new Intent(this,MainActivity.class);
                Isi isi=new Isi("aku","kamu");
                intent3.putExtra("data3",isi);
                startActivity(intent3);
                break;
        }
    }
}
