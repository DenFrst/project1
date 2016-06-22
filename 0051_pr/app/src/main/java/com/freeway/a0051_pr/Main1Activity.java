package com.freeway.a0051_pr;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Main1Activity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btnPlay, btnTutorial, btnExit, pregame;

final int MENU_COLOR_RED =1;
final int MENU_COLOR_GREEN =2;
final int MENU_COLOR_BLUE =3;

    final int MENU_ALPHA_ID =4;
    final int MENU_SCALE_ID =5;
    final int MENU_TRANSLATE_ID =6;
    final int MENU_ROTATE_ID =7;
    final int MENU_COMBO_ID =8;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thscr);
      //  Log.d(TAG, "View elem");
        tvOut = (TextView) findViewById(R.id.tvOut);

        registerForContextMenu(tvOut);

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnTutorial = (Button) findViewById(R.id.btnTutorial);
        btnExit = (Button) findViewById(R.id.btnExit);
        pregame = (Button) findViewById(R.id.pregame);
        //    btnTutBack = (Button) findViewById(R.id.btnTutBack);

        btnPlay.setOnClickListener(this);
        btnTutorial.setOnClickListener(this);
        btnExit.setOnClickListener(this);
        pregame.setOnClickListener(this);
        //   btnTutBack.setOnClickListener(this);
//___________________________________

    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        switch (v.getId()){
            case R.id.tvOut:
                menu.add(0, MENU_COLOR_BLUE,0,"Blue");
                menu.add(0, MENU_COLOR_RED,0,"Red");
                menu.add(0, MENU_COLOR_GREEN,0,"Green");
                menu.add(0, MENU_ALPHA_ID,0,"Alpha");
                menu.add(0, MENU_SCALE_ID,0,"Scale");
                menu.add(0, MENU_TRANSLATE_ID,0,"Translate");
                menu.add(0, MENU_ROTATE_ID,0,"Rotate");
                menu.add(0, MENU_COMBO_ID,0,"Combo");

                break;
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Animation anim = null;
        switch (item.getItemId()){
            case MENU_ALPHA_ID:
                anim= AnimationUtils.loadAnimation(this, R.anim.myalpha);
                break;
            case MENU_SCALE_ID:
                anim= AnimationUtils.loadAnimation(this, R.anim.myscale);
                break;
            case MENU_TRANSLATE_ID:
                anim= AnimationUtils.loadAnimation(this, R.anim.mytrans);
                break;
            case MENU_ROTATE_ID:
                anim= AnimationUtils.loadAnimation(this, R.anim.myrotate);
                break;
            case MENU_COMBO_ID:
                anim= AnimationUtils.loadAnimation(this, R.anim.mycombo);
                break;
            case MENU_COLOR_BLUE:
                tvOut.setTextColor(Color.BLUE);
                tvOut.setText("Text Blue");
                break;
            case MENU_COLOR_GREEN:
                tvOut.setTextColor(Color.GREEN);
                tvOut.setText("Text green");
                break;
            case MENU_COLOR_RED:
                tvOut.setTextColor(Color.RED);
                tvOut.setText("Text red");
                break;
        }
        tvOut.startAnimation(anim);
        return super.onContextItemSelected(item);
    }
    @Override
    public void onClick(View view) {
       // Log.d(TAG, "Vi2");
        //   Toast toast = Toast.makeText(Main1Activity.this, "Tlol", Toast.LENGTH_SHORT);  ToatNotif
     /*   toast.setGravity(Gravity.CENTER, 0, 0); //raspolojenie
        LinearLayout toastImage = (LinearLayout) toast.getView();
        ImageView imageView = new ImageView(Main1Activity.this);
        imageView.setImageResource(R.drawable.wami);
        toastImage.addView(imageView, 0);*/
        //   toast.show();
        switch (view.getId()) {
            case R.id.btnPlay:
                Intent game11 = new Intent(this, game1.class);
                startActivity(game11);
                break;
            case R.id.btnTutorial:
                Intent intent = new Intent(this, secondact.class);
                startActivity(intent);
                break;
            case R.id.btnExit:
                finish();
                System.exit(0);
                break;
            case R.id.pregame:
                Intent pregame1 = new Intent(this, pregame.class);
                startActivity(pregame1);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action1:
                Toast.makeText(Main1Activity.this, getString(R.string.action1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.action2:
                Toast.makeText(Main1Activity.this, getString(R.string.action1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.action3:
                Toast.makeText(Main1Activity.this, getString(R.string.action1), Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
