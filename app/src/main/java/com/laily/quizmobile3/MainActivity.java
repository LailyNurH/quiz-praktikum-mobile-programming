package com.laily.quizmobile3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.Toast;

import com.laily.quizmobile3.callbacks.ILoginResultCallbacks;
import com.laily.quizmobile3.databinding.ActivityMainBinding;
import com.laily.quizmobile3.viewModel.LoginViewModel;
import com.laily.quizmobile3.viewModel.LoginViewModelFactory;

public class MainActivity extends AppCompatActivity implements ILoginResultCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(ViewModelProviders.of(this,
                new LoginViewModelFactory(this)).get(LoginViewModel.class));
        activityMainBinding.executePendingBindings();
    }

    @Override
    public void onSuccess(String succesMessage) {
        Toast.makeText(this, succesMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String failureMessage) {
        Toast.makeText(this, failureMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String error) {

    }
}