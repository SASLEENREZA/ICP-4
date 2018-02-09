package com.example.rezas.a4th_icp;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void checkCredentials(View v)
    {
        EditText usernameCtrl=(EditText)findViewById(R.id.editText);
        EditText passwordCtrl=(EditText)findViewById(R.id.editText2);
        TextView errorText=(TextView)findViewById(R.id.button);
        String userName=usernameCtrl.getText().toString();
        String password=passwordCtrl.getText().toString();

        boolean validationFlag=false;
        //Verify if the username and password are not empty.

        if(!userName.isEmpty() && !password.isEmpty()) {
            if(userName.equals("sasleen") && password.equals("sasleen")) {
                validationFlag = true;

            }
        }
        if(!validationFlag)
        {
            errorText.setVisibility(View.VISIBLE);
        }
        else
        {
            //This code redirects the from login page to the home page.
            Intent redirect = new Intent(MainActivity.this, translate.class);
            startActivity(redirect);
        }
    }

}
