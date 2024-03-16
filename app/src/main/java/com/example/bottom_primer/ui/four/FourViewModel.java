package com.example.bottom_primer.ui.four;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FourViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public FourViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Four fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
