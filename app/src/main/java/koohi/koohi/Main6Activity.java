package koohi.koohi;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import koohi.koohi.Statics.Const;
import koohi.koohi.Statics.StaticMetods;

public class Main6Activity extends AppCompatActivity {

    String whichActivity = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        whichActivity = getIntent().getStringExtra(Const.WHICH_ACTIVITY);


    }

    public void retryBtn(View view) {
        if (StaticMetods.isNetworkConnected(Main6Activity.this)) {
            setResult(200);
            finish();
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        } else
            Toast.makeText(this, "اینترنت قطع است دوباره تلاش کنید", Toast.LENGTH_SHORT).show();

    }



    @Override
    public void onBackPressed() {
        setResult(404);
        finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
