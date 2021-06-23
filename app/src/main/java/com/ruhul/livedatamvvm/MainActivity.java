package com.ruhul.livedatamvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.database.Observable;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView livetextdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        livetextdata=findViewById(R.id.livedataid);

        MyViewModellivedata myViewModellivedata = new ViewModelProvider(this).get(MyViewModellivedata.class);
        //String LiveData<String> myrandomvalue= myViewModellivedata.getrandomvalue();

        LiveData<String> myrandomvalue= myViewModellivedata.getrandomvalue();

        myrandomvalue.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                livetextdata.setText(s);
            }
        });





    }
}