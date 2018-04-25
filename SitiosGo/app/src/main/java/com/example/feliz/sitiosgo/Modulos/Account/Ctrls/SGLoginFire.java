package com.example.feliz.sitiosgo.Modulos.Account.Ctrls;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by feliz on 24/04/2018.
 */

public class SGLoginFire extends Application {
    // método auxiliar de activación de la aplicación del SDK debe invocarse una vez cuando se crea la aplicación.
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }
}
