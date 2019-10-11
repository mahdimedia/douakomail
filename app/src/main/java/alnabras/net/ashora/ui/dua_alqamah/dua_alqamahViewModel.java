package alnabras.net.ashora.ui.dua_alqamah;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class dua_alqamahViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public dua_alqamahViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dua_alqamah fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}