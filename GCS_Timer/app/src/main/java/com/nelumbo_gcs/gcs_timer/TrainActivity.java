package com.nelumbo_gcs.gcs_timer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import java.util.Timer;

public class TrainActivity extends Activity {

    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        ok = (Button)findViewById(R.id.buttonOk);



    }
}
