package com.example.meterialdesigntutorial;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

public class Main2ActivityTextField extends AppCompatActivity {

    AppCompatEditText user;
    AppCompatEditText passs;
    RelativeLayout relativeLayout;
    TextInputLayout userlayout;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_text_field);

        toolbar =findViewById(R.id.toolbar);
        setActionBar(toolbar);
        getSupportActionBar();

        user=findViewById(R.id.textField);
        relativeLayout =findViewById(R.id.realativeLayout);
        relativeLayout.setOnClickListener(null);
        userlayout.findViewById(R.id.usernmaetextInput);

        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(user.getText().toString().isEmpty()){
                    userlayout.setError("Please enter User name");
                    userlayout.setErrorEnabled(true);
                }else{
                    userlayout.setErrorEnabled(false);
                }
            }
        });
        user.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(user.getText().toString().isEmpty()){
                    userlayout.setError("Please enter User name");
                    userlayout.setErrorEnabled(true);
                }else{
                    userlayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
