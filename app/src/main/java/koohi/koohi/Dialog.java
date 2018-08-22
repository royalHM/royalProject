package koohi.koohi;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;

public class Dialog extends android.app.Dialog {

    Context context;


    public Dialog(@NonNull Context context) {
        super(context);
        this.context=context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relationship);
    }
}
