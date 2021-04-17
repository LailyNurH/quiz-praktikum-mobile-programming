package com.laily.quizmobile3.callbacks;

public interface ILoginResultCallbacks {
    void onSuccess(String succesMessage);
    void onFailure(String failureMessage);
    void onError(String error);
}
