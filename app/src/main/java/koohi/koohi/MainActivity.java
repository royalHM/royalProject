package koohi.koohi;


import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import koohi.koohi.Adapter.View_pager_Adapter;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    private ViewPager viewPager;
    private View_pager_Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.ViewPager);

        adapter = new View_pager_Adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);



        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    private static final int Time_Between_Two_Back = 4000;
    private long TimeBackPressed;

    @Override
    public void onBackPressed() {
        if (TimeBackPressed + Time_Between_Two_Back > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(getBaseContext(), "برای خروج دوباره فشار کنید", Toast.LENGTH_SHORT).show();
        }
        TimeBackPressed = System.currentTimeMillis();
    }

    public void cardview1(View V) {
        Intent GoActivity = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(GoActivity);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

    }

    public void education(View V) {
        Intent GoActivity = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(GoActivity);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

    }

    public void buysell(View V) {
        Intent GoActivity = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(GoActivity);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.flsh, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.error:
                Dialog dialog = new Dialog(this);
                dialog.show();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;


            case R.id.Button_contact:
                Intent Button_sd = new Intent(Intent.ACTION_VIEW, Uri.parse("https://telegram.me/joinchat/AAAAAE46F2eQwRB9pLdGwA"));
                startActivity(Button_sd);
                return true;


            case R.id.telegram:
                Intent Button_ss = new Intent(Intent.ACTION_VIEW, Uri.parse("https://telegram.me/joinchat/AAAAAEobFD4gVJmQnCEfWw"));
                startActivity(Button_ss);
                return true;


            case R.id.flsh:
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;


            case R.id.subscribe:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "@Clichy_and_the_Royal");
                startActivity(Intent.createChooser(intent, "اشتراک گذاری به وسيله"));
                return true;


        }
        return super.onOptionsItemSelected(item);

    }
}


