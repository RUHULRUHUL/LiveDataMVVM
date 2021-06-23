package com.ruhul.livedatamvvm;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MyViewModellivedata extends ViewModel {

    public MutableLiveData<String> myrandomvalue;

    public  MutableLiveData<String> getrandomvalue()
    {
        Log.d("getrandomevalue","getrandomevalue");
        if (myrandomvalue==null)
        {
            myrandomvalue = new MutableLiveData<>();
            createrandomvalue();

        }

        return myrandomvalue;

    }

    public void createrandomvalue() {
        Log.d("createrandomevalue","createrandomevalue");


        Random random = new Random();
        myrandomvalue.postValue("create random value : "+ random.nextInt(10));
    }


}
