package com.amrhal.mvp_tests.presenter;

import android.util.Log;

import com.amrhal.mvp_tests.MainContract;
import com.amrhal.mvp_tests.model.MainModel;

public class MainPresenter implements MainContract.IPresenter {

    MainContract.IModel imodel;
    MainContract.IView iView;


    public MainPresenter(MainContract.IView newView) {
        this.imodel = new MainModel();
        iView = newView;
    }

    @Override
    public void clicks() {
        Log.e("TAG", "MainPresenter clicks: ");
        String data =imodel.getData();
        iView.onDataReceived(data);
    }
}
