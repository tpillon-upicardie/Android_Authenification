package com.tpillon.authentapp.View.Activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.tpillon.authentapp.Logic.LogOutAuthStateListener;
import com.tpillon.authentapp.R;

/**
 * activity show after authentification
 */
public class MainActivity extends AppCompatActivity {

    private FirebaseAuth _auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get firebase authent instance
        _auth = FirebaseAuth.getInstance();

        // this listener will be called when there is change in firebase user session
        FirebaseAuth.AuthStateListener authListener = new LogOutAuthStateListener(this);
        _auth.addAuthStateListener(authListener);

    }

    /**
     * function to logout user
     * @param view
     */
    public void OnLogoutClick(View view) {
        _auth.signOut();
    }
}
