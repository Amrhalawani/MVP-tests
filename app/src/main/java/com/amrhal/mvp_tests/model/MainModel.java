package com.amrhal.mvp_tests.model;

import android.util.Log;

import com.amrhal.mvp_tests.MainContract;

import java.util.Random;

public class MainModel implements MainContract.IModel {
String[] rndString = {"hello","are you fine?","nice to know you","whats your name","hope everything is going well",
        "lorem ipsem4","lorem ipsem3","lorem ipsem2","lorem ipsem1"};


    @Override
    public String getData() {
        Log.e("TAG", "MainModel getData: ");
        int rnd = new Random().nextInt(rndString.length);
        return rndString[rnd];
    }
}
