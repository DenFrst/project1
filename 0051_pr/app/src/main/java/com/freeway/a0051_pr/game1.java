package com.freeway.a0051_pr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.Random;

public class game1 extends AppCompatActivity implements View.OnClickListener {

    TextView indexplayer, hisname, textString, yourname;
    EditText inputname;
    Button btnOk, debuggame1, randomname, btnOk2;
    TableLayout TLup, TLdown;
    TableRow tlup1, tldown1;
    LinearLayout.LayoutParams lParams1;
    String a,b;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);

        indexplayer = (TextView) findViewById(R.id.indexplayer);
        hisname = (TextView) findViewById(R.id.hisname);
        inputname = (EditText) findViewById(R.id.inputname);
        btnOk = (Button) findViewById(R.id.btnOk);
        randomname = (Button) findViewById(R.id.randomname);
        TLup = (TableLayout) findViewById(R.id.TLup);
        TLdown = (TableLayout) findViewById(R.id.TLdown);
        tlup1 = (TableRow) findViewById(R.id.tlup1);
        tldown1 = (TableRow) findViewById(R.id.tldown1);
        yourname = (TextView) findViewById(R.id.yourname);

        randomname.setOnClickListener(this);
        btnOk.setOnClickListener(this);

        debuggame1 = (Button) findViewById(R.id.debuggame1);
        debuggame1.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        Random rand = new Random();
        String str[]=getResources().getStringArray(R.array.names);
        int pos = rand.nextInt(str.length);                             // Создаются заного кнопки и не сравнить с предыдущим значением стр
        Button btnOk2 = new Button(this);
        btnOk2.setId(R.id.layout1);
        btnOk2.setText("OK");
        EditText editname = new EditText(this);
        editname.setText("11");
        btnOk2.setOnClickListener(this);
        switch (v.getId()) {
            case R.id.btnOk:
                hisname.setText(inputname.getText());
                tlup1.removeAllViews();
                tlup1.addView(editname);
                tlup1.addView(btnOk2);
                btnOk.setVisibility(View.INVISIBLE);
                inputname.setVisibility(View.INVISIBLE);
                randomname.setVisibility(View.INVISIBLE);
                btnOk2.setVisibility(View.VISIBLE);
                editname.setVisibility(View.VISIBLE);


                yourname.setText("");
                //a=str[pos];
                a="qwerty";

                Log.d(TAG,a);

                break;
            case R.id.debuggame1:
                hisname.setText("Тут будет имя");
               // tlup1.removeAllViews();
                editname.setText("");
                break;
            case R.id.randomname:
                inputname.setText("");
                inputname.append(str[pos]);

                break;
            case R.id.layout1:
                //yourname.setText(a);
                b = editname.getText().toString();
                editname.setText("1212");
                Log.d(TAG,"tut");
                //Log.d(TAG,"asd");
                if (b.equals(a)){
                    Log.d(TAG,"qwe");
                    yourname.setText("123");
                } else if (editname.length()==0){
                    yourname.setText("null");
                }


                break;

        }
    }
}
