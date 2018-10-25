package com.amrhal.mvp_tests.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.amrhal.mvp_tests.MainContract;
import com.amrhal.mvp_tests.R;
import com.amrhal.mvp_tests.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.IView {
    MainPresenter presenter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        textView = findViewById(R.id.text);

    }

    public void onBtnClick(View view) {
        Log.e("TAG", "MainActivity onBtnClick: ");
        presenter.clicks();
    }

    @Override
    public void onDataReceived(String Received) {
        textView.setText(Received);
    }
}
