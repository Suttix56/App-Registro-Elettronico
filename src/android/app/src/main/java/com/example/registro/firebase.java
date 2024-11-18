package com.example.registro;
import android.app.Application;
import com.google.firebase.FirebaseApp;

public class firebase extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
