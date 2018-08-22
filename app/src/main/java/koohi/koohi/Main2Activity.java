package koohi.koohi;


import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {
    Toolbar toolbar1;
    Button button12, button2323;
    TextView VR_Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button12 = (Button) findViewById(R.id.Button_gmali);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendEmail();
            }
        });

        button2323 = (Button) findViewById(R.id.Button_report);
        button2323.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Button_sd = new Intent(Intent.ACTION_VIEW, Uri.parse("https://telegram.me/joinchat/AAAAAE46F2eQwRB9pLdGwA"));
                startActivity(Button_sd);

            }
        });

        Versionshwocode();

        toolbar1 = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        {
        }
    }

    void Versionshwocode() {
        VR_Name = (TextView) findViewById(R.id.VR_code);
        PackageManager packageManager = getPackageManager();
        PackageInfo info = null;
        try {
            info = packageManager.getPackageInfo(getPackageName(), 0);
            VR_Name.setText(info.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

    }


    private void SendEmail() {

        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "koohi6739@gmail.com", null));
        intent.putExtra("android.intent.extra.SUBJECT", "Send From Application Android");
        startActivity(Intent.createChooser(intent, "لطفا انتخاب کنید"));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        {
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.aboutus_2, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.about_ns:
            case R.id.flsh:
                Intent i = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);

    }
}


