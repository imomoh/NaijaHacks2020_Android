package com.example.naijahacks2020_android;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;

import android.os.Bundle;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


    }

//    public void  signuP() {
//        ParseUser user = new ParseUser();
//// Set the user's username and password, which can be obtained by a forms
//        user.setUsername(<Insert Username Here>);
//        user.setPassword(<Insert User Password Here>);
//        user.signUpInBackground(new SignUpCallback() {
//            @Override
//            public void done(ParseException e) {
//                if (e == null) {
//                    alertDisplayer("Sucessful Sign Up!","Welcome" + <Insert Username Here> + "!");
//                } else {
//                    ParseUser.logOut();
//                    Toast.makeText(SignUpActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//    }
//
//    private void alertDisplayer(String title,String message){
//        AlertDialog.Builder builder = new AlertDialog.Builder(SignUpActivity.this)
//                .setTitle(title)
//                .setMessage(message)
//                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.cancel();
//                        // don't forget to change the line below with the names of your Activities
//                        Intent intent = new Intent(SignUpActivity.this, LogoutActivity.class);
//                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent);
//                    }
//                });
//        AlertDialog ok = builder.create();
//        ok.show();
//    }
}
