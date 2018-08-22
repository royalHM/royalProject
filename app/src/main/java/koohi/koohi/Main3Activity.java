package koohi.koohi;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import koohi.koohi.Adapter.MovieAdapter;
import koohi.koohi.Model.Movie1;
import koohi.koohi.Statics.Const;
import koohi.koohi.Statics.StaticMetods;


public class Main3Activity extends AppCompatActivity {

    Toolbar toolbar;
    public RecyclerView recyclerView;
    MovieAdapter movieAdapter;
    ArrayList<Movie1> movie1s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        movie1s = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_View);

        recyclerView.setLayoutManager(new LinearLayoutManager(Main3Activity.this));
        movieAdapter = new MovieAdapter(Main3Activity.this, movie1s);
        recyclerView.setAdapter(movieAdapter);

        if (StaticMetods.isNetworkConnected(Main3Activity.this))
            getProductFromServer();
        else {
            Intent intent = new Intent(Main3Activity.this, Main6Activity.class);
            intent.putExtra(Const.WHICH_ACTIVITY, "Main3");
            startActivityForResult(intent, 100);
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 100) {

            if (resultCode == 404)
                finish();
            else if (resultCode == 200)
                getProductFromServer();

        }
    }

    public void getProductFromServer() {
        String URL = "http://192.168.42.205/koohistormphp/getroyal.php";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.POST, URL, null, new Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response) {

                if (response.length() != 0) {
                    for (int i = 0; i < response.length(); i++) {
                        try {
                            JSONObject jsonObject = response.getJSONObject(i);
                            String id = jsonObject.getString("id");
                            String name = jsonObject.getString("name");
                            String swing = jsonObject.getString("swing");
                            String ynuow = jsonObject.getString("ynuow");
                            String number = jsonObject.getString("number");
                            String account = jsonObject.getString("account");
                            String queen = jsonObject.getString("queen");
                            String king = jsonObject.getString("king");
                            String inserthh = jsonObject.getString("inserthh");
                            String price = jsonObject.getString("price");
                            String lnsert = jsonObject.getString("lnsert");
                            String advertising = jsonObject.getString("advertising");

                            movie1s.add(new Movie1(name, swing, ynuow, number, account, queen, king, inserthh, price, lnsert, advertising));


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    movieAdapter.addData(movie1s);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        jsonArrayRequest.setRetryPolicy(new DefaultRetryPolicy(10000, 2, 5f));
        Volley.newRequestQueue(Main3Activity.this).add(jsonArrayRequest);
    }


}