package koohi.koohi.Statics;

import android.app.Activity;
import android.net.ConnectivityManager;

import koohi.koohi.Main3Activity;

public class StaticMetods {

    public static boolean isNetworkConnected(Activity activity) {
        ConnectivityManager cm = (ConnectivityManager) activity.getSystemService(Main3Activity.CONNECTIVITY_SERVICE);
        return (cm != null ? cm.getActiveNetworkInfo() : null) != null;
    }
}
