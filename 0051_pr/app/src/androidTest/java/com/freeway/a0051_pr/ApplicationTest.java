package com.freeway.a0051_pr;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.widget.Toast;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }
}

/*    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnPlay:
//                        tvOut.setText(R.string.Play);
                    Log.d(TAG, "Buttpress 'Play'");
                    setContentView(R.layout.screen);
                    break;
                case R.id.btnTutorial:
                    Log.d(TAG, "Buttpress ''");
                    setContentView(R.layout.);
                    break;
                case R.id.btnExit:
                    tvOut.setText(R.string.Exit);
                    Log.d(TAG, "Buttpress 'Exit'");
                    break;
            }
        }
    }; */
/*
        Button myBtn =  (Button) findViewById(R.id.button5);
        myBtn.setText("KNOPKA");
        myBtn.setEnabled(false);

        CheckBox checkb = (CheckBox) findViewById(R.id.checkBox);
        checkb.setText("Najmi");
        checkb.setChecked(true);

                setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Toast c KARTINKOY

        Toast toast = Toast.makeText(Main1Activity.this,"TEXT", Toast.LENGTH_SHORT);
    toast.setGravity(Gravity.Center,0,0); //raspolojenie
    LinearLayout toastImage = (LinerLayout) toast.getView();
    Image
        */

