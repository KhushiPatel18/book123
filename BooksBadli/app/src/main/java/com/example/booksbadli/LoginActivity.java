package com.example.booksbadli;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.Toast;
//import booksfortune.bookchor.user.AboutUs;
//import booksfortune.bookchor.utilities.Constants;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity{
  String afterlogindata = "";
  
  ProgressDialog dialog;
  
  boolean doubleBackToExitPressedOnce = false;

  Button btn_login;

  EditText txt_phone_number;

  EditText txt_email;

  EditText txt_password;

  TextView txt_error_email;

  TextView txt_error_password;

  TextView txt_error_phone_number;

  String error_txt_email = "Enter Valid Email";

  String error_txt_password = "Enter Valid Password";

  String error_txt_phone_number = "Enter Valid Phone Number";

  String loginFor = "";

  String emailid = "";
  
  String mobile_txt = "";
  
  EditText phoneLogin;

  private Toolbar toolbar;
  
  int user_exist = 0;


  public void Error_Check() {
    if (this.txt_phone_number.getText().toString().equals("")) {
      this.txt_phone_number.setError("This field is compulsory!");
      this.txt_phone_number.requestFocus();
      return;
    }
    if (this.txt_email.getText().toString().equals("")) {
      this.txt_email.setError("This field is compulsory!");
      this.txt_email.requestFocus();
      return;
    }
    if (this.txt_password.getText().toString().equals("")) {
      this.txt_password.setError("This field is compulsory!");
      this.txt_password.requestFocus();
      return;
    }
    /*
    if (this.txt_phone_number.getText().toString().length() != 10) {
      this.txt_error_phone_number.setVisibility(View.VISIBLE);
      this.txt_phone_number.requestFocus();
      return;
    }
    */
    /*this.txt_error_phone_number.setVisibility(View.GONE);
    this.txt_error_email.setVisibility(View.GONE);
    this.txt_error_password.setVisibility(View.GONE);*/
    //Toast.makeText(getApplicationContext(),"Data entered successfully",Toast.LENGTH_SHORT).show();

    //FirebaseDatabase database = FirebaseDatabase.getInstance();
    //DatabaseReference myRef = database.getReference("message");
    //myRef.setValue("Hello, World!");
    //Toast.makeText(getApplicationContext(),"Database entry successfully",Toast.LENGTH_SHORT).show();

    //Intent intent = new Intent((Context)this, WelcomeActivity.class);
    //intent.putExtra("emailid", this.txt_email.getText().toString());
    //intent.putExtra("password", this.txt_password.getText().toString());
    //startActivity(intent);
    //overridePendingTransition(0, 0);
    //finish();
  }
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(R.layout.activity_login);
    this.btn_login = (Button)findViewById(R.id.btn_login);
    this.txt_phone_number=(EditText)findViewById(R.id.txt_phone_number_login);
    this.txt_email=(EditText) findViewById(R.id.txt_email_login);
    this.txt_password=(EditText)findViewById(R.id.txt_password_login);

    btn_login.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Error_Check();
      }
    });


    /*
    try {
      this.loginFor = getIntent().getExtras().getString("loginFor");
      this.afterlogindata = getIntent().getExtras().getString("afterlogindata");
    } catch (Exception exception) {}
    initializeData();
    */
  }

  /*
  public void signup() {
    Intent intent = new Intent((Context)this, SignUp.class);
    intent.putExtra("loginFor", this.loginFor);
    intent.putExtra("afterlogindata", this.afterlogindata);
    intent.putExtra("mobile", this.phoneLogin.getText().toString());
    startActivity(intent);
    overridePendingTransition(0, 0);
    finish();
  }
  */
}


/* Location:              C:\Users\admin\AndroidStudioProjects\apkextract\method2\dex2jar-2.0\dex2jar-2.0\classes-dex2jar.jar!\booksfortune\bookchor\mainFiles\LoginActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */