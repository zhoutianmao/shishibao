package com.shishibao.shishibao.presenter;

import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.shishibao.shishibao.base.BasePresenter;
import com.shishibao.shishibao.view.MainActivity;

import model.RoomsModel;
import rx.Subscriber;

public class RowPresenter extends BasePresenter<MainActivity> {
    public RowPresenter(MainActivity view) {
        attachView(view);
    }

    public void loadDataByRetrofitRxjava() {
        addSubscription(apiStores.loadRoomList(), new Subscriber<RoomsModel>() {
            public void onCompleted() {
            }
            public void onError(Throwable e) {
            }

            public void onNext(RoomsModel roomsModel) {
                //  Log.e("请求成功","111");
                Log.d("请求成功", JSON.toJSONString(roomsModel));
                mvpView.getRoomsSuccess(roomsModel);
            }
        });
    }
}
