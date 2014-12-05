package com.example.sooo.twitter4jexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Window;

/**
 * Created by Sou on 2014/12/05.
 */
public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private boolean m_bIsSelect = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate is called");
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        if (!Twitter4jUtils.hasAccessToken(this)) {
//            Intent intent = new Intent(this, TwitterOAuthActivity.class);
//            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart is called");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume is called");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause is called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop is called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onStop is called");
        super.onDestroy();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != KeyEvent.KEYCODE_BACK) {
            return super.onKeyDown(keyCode, event);
        } else {
            // 選択中はバックキーを無視する

            if (m_bIsSelect != true) {
                // バックキー処理
                finish();
            }
            return false;
        }
    }
}
