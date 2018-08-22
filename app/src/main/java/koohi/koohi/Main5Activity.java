package koohi.koohi;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import koohi.koohi.Adapter.RoyalAdapter;
import koohi.koohi.Model.RoyalMovie;


public class Main5Activity extends AppCompatActivity {


    private List<RoyalMovie> movies = new ArrayList<>();
    RecyclerView recyclerView;
    RoyalAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        recyclerView = (RecyclerView) findViewById(R.id.view);
        adapter = new RoyalAdapter(movies, this);


        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);
        setData();
        adapter.addData(movies);

    }

    private void setData() {
        movies.add(new RoyalMovie("hamed", R.drawable.koohi1, R.drawable.koohi1, R.drawable.koohi1, R.drawable.koohi1));
        movies.add(new RoyalMovie("android", R.drawable.koohi2, R.drawable.koohi2, R.drawable.koohi2, R.drawable.koohi2));
        movies.add(new RoyalMovie("recycler", R.drawable.koohi3, R.drawable.koohi3, R.drawable.koohi3, R.drawable.koohi3));
        movies.add(new RoyalMovie("hamed", R.drawable.koohi4, R.drawable.koohi4, R.drawable.koohi4, R.drawable.koohi4));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        {
        }
    }
}
