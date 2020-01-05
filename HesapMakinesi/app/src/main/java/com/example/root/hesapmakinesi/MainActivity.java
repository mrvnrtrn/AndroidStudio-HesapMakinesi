package com.example.root.hesapmakinesi;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button[] butonlar;
    EditText et;
    TextView tv;
    String a="",islem="";
    double sonuc=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.editText);
        butonlar = new Button[17];
        tv=findViewById(R.id.tv);

        Resources res = getResources();
        for (int i = 0; i < 17; i++)
        {
            String b = "b" + i;
            butonlar[i] = findViewById(res.getIdentifier(b, "id", getPackageName()));
            butonlar[i].setOnClickListener(this);
        }


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.b0:
                a+="0";
                et.setText(a);
                break;
            case R.id.b1:
                a+="1";
                et.setText(a);
                break;
            case R.id.b2:
                a+="2";
                et.setText(a);
                break;
            case R.id.b3:
                a+="3";
                et.setText(a);
                break;
            case R.id.b4:
                a+="4";
                et.setText(a);
                break;
            case R.id.b5:
                a+="5";
                et.setText(a);
                break;
            case R.id.b6:
                a+="6";
                et.setText(a);
                break;
            case R.id.b7:
                a+="7";
                et.setText(a);
                break;
            case R.id.b8:
                a+="8";
                et.setText(a);
                break;
            case R.id.b9:
                a+="9";
                et.setText(a);
                break;
            case R.id.b15:
                a+=".";
                et.setText(a);
                break;

            case R.id.b10:
                et.setText("0");
                sonuc=0;
                a="";
                break;

            case R.id.b11:
                if(a.length()>0)
                {
                    sonuc=Double.parseDouble(a);
                    et.setText("0");
                    islem="/";
                    a="";
                    tv.setText("/");
                }
                break;
            case R.id.b12:
                if(a.length()>0)
                {
                    sonuc=Double.parseDouble(a);
                    et.setText("0");
                    islem="*";
                    a="";
                    tv.setText("x");
                }
                break;
            case R.id.b13:
                if(a.length()>0)
                {
                    sonuc=Double.parseDouble(a);
                    et.setText("0");
                    islem="-";
                    a="";
                    tv.setText("-");
                }
                break;
            case R.id.b16:
                if(a.length()>0)
                {
                    sonuc=Double.parseDouble(a);
                    et.setText("0");
                    islem="+";
                    a="";
                    tv.setText("+");
                }
                break;

            case R.id.b14:
                if(islem=="/")
                {
                    sonuc/=Double.parseDouble(a);
                    et.setText(sonuc+"");
                    a=sonuc+"";
                }
                else if (islem=="*")
                {
                    sonuc*=Double.parseDouble(a);
                    et.setText(sonuc+"");
                    a=sonuc+"";
                }
                else if (islem=="-")
                {
                    sonuc-=Double.parseDouble(a);
                    et.setText(sonuc+"");
                    a=sonuc+"";
                }
                else if (islem=="+")
                {
                    sonuc+=Double.parseDouble(a);
                    et.setText(sonuc+"");
                    a=sonuc+"";
                }
                tv.setText("");
                break;

        }

    }
}
