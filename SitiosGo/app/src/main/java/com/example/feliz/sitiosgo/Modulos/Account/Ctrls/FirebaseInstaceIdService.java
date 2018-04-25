package com.example.feliz.sitiosgo.Modulos.Account.Ctrls;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by feliz on 24/04/2018.
 */

public class FirebaseInstaceIdService extends FirebaseInstanceIdService{

    public static final String TAG = "Noticias";

    //Metodo que se ejecuta cuando recibimos un token

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String token = FirebaseInstanceId.getInstance().getToken();

        //Para mostrar en consola

        Log.d(TAG, " Token: " + token);
    }
}
