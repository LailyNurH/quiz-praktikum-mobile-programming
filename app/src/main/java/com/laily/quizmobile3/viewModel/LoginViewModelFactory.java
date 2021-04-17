package com.laily.quizmobile3.viewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.laily.quizmobile3.callbacks.ILoginResultCallbacks;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private ILoginResultCallbacks mIloginResultsCallbacks;

    public LoginViewModelFactory(ILoginResultCallbacks mIloginResultsCallbacks) {
        this.mIloginResultsCallbacks = mIloginResultsCallbacks;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T)new LoginViewModel(mIloginResultsCallbacks);
    }
}
