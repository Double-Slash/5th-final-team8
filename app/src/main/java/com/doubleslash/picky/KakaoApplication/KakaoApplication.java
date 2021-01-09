package com.doubleslash.picky.KakaoApplication;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KakaoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        KakaoSdk.init(this, "9c13236a5b607848eb2a0b35d6b013a2");
    }
}
