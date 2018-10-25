package com.amrhal.mvp_tests;

public class MainContract {

    public interface IView {
        void onDataReceived(String Received);
    }

    public interface IPresenter {
        void clicks();
    }

    public interface IModel {
        String getData();
    }

}
