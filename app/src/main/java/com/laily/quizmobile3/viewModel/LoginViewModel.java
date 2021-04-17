package com.laily.quizmobile3.viewModel;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.laily.quizmobile3.callbacks.ILoginResultCallbacks;
import com.laily.quizmobile3.model.LoginModel;

public class LoginViewModel extends ViewModel {
    private LoginModel mLoginModel;
    private ILoginResultCallbacks mIloginresultsCallbacks;

    public LoginViewModel(ILoginResultCallbacks mIloginresultsCallbacks) {
        this.mIloginresultsCallbacks = mIloginresultsCallbacks;
        this.mLoginModel = new LoginModel();
    }

    /**
     * @brief : Method to get the text entered in email field
     * @return : email adress
     */
    public TextWatcher getEmailText(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mLoginModel.setmUserName(s.toString());
            }
        };

    }



    public TextWatcher getPasswordText(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mLoginModel.setmPassword(s.toString());
            }
        };

    }

    public void onLoginClicked(View view){
        if (mLoginModel.isValidData()){
            mIloginresultsCallbacks.onSuccess("Login Succesfull");
        }else {
            mIloginresultsCallbacks.onFailure("Login Failed");
        }

    }
}
