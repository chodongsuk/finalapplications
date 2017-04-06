package com.example.ds.finalapplications;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import kr.ds.utils.SharedPreference;

/**
 * Created by Administrator on 2017-04-06.
 */
public class MainActivity extends BaseActivity{
    private Button mButtonLogOut;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mButtonLogOut = (Button) findViewById(R.id.button_logout);

        mButtonLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SharedPreference().putSharedPreference(getApplicationContext(), "md_uid", "");
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                finish();
            }
        });

    }
}
