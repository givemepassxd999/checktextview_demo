package com.example.givemepass.checktextviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckedTextView;

public class MainActivity extends AppCompatActivity {

    private CheckedTextView mCheckedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCheckedTextView = (CheckedTextView)findViewById(R.id.checkTextView01);
        mCheckedTextView.setChecked(true);
        mCheckedTextView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mCheckedTextView.toggle();
            }
        });
    }
}
