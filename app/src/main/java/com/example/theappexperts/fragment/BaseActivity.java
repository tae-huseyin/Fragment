package com.example.theappexperts.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.theappexperts.fragment.fragments.FirstFragment;
import com.example.theappexperts.fragment.fragments.SecondFragment;

public class BaseActivity extends AppCompatActivity{

    FragmentManager fragmentManager;
    private Button btnReplace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        btnReplace = (Button) findViewById(R.id.btnNews);
        fragmentManager=getSupportFragmentManager();

        if(savedInstanceState==null)
        {
            fragmentManager.beginTransaction()
                    .add(R.id.fragmentContainer, new FirstFragment())
                    .commit();
        }

        btnReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, new SecondFragment())
                        .commit();
            }
        });

    }
}
