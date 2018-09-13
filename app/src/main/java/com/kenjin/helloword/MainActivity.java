package com.kenjin.helloword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hsl;
    public static String Data_Intent="dataIntent";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText pjg = (EditText) findViewById(R.id.panjang);
        final EditText lbr = findViewById(R.id.lebar);
        final EditText tg = findViewById(R.id.tinggi);
        Button btn = findViewById(R.id.button);
        hsl = findViewById(R.id.hasil);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungVolume(pjg.getText().toString(), lbr.getEditableText().toString(), tg.getEditableText().toString());
            }
        });
        if(getIntent().getStringExtra("string1")!=null) {
            String s = getIntent().getStringExtra("string1");
            hsl.setText(s);
        }
        if(getIntent().getStringExtra(Data_Intent)!=null) {
            String s = getIntent().getStringExtra(Data_Intent);
            hsl.setText(s);
        }
        if(getIntent().getSerializableExtra("data3")!=null) {
            Isi isi = (Isi) getIntent().getSerializableExtra("data3");
            hsl.setText(isi.getA()+" dan "+isi.getB());
        }
    }

    private void hitungVolume(String panjang, String lebar, String tinggi) {
        try {
            int hasil = Integer.parseInt(panjang) * Integer.parseInt(lebar) * Integer.parseInt(tinggi);
            hsl.setText(String.valueOf(hasil));
        } catch (Exception e) {
            hsl.setText("Err!!!!!");
        }
    }

}
