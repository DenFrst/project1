package com.freeway.a0051_pr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class pregame extends AppCompatActivity implements View.OnClickListener {

    Button gogame;
    Spinner numberdrop;
    String[] nd={"2","3","4","5","6","7","8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game1);

        gogame = (Button) findViewById(R.id.gogame);
        gogame.setOnClickListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item,nd);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        numberdrop = (Spinner) findViewById(R.id.numberdrop);
        numberdrop.setAdapter(adapter);
        numberdrop.setPrompt("Выбор");
        numberdrop.setSelection(2);
        numberdrop.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Position = "+ position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.gogame:
                numberdrop.getSelectedItemPosition();
             /*   switch (numberdrop.getSelectedItem().toString()){
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":

                }*/
        }
    }
}
