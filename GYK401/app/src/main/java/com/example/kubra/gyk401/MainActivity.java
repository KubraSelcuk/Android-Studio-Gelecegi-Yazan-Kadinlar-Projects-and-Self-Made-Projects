package com.example.kubra.gyk401;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.kubra.gyk401.fragments.DietList;
import com.example.kubra.gyk401.fragments.HealthFragment;
import com.example.kubra.gyk401.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment= null;
            switch (item.getItemId()) {
                case R.id.navigation_home:


                    selectedFragment= new HomeFragment();
                    break;
                case R.id.navigation_health:

                    selectedFragment= new HealthFragment();
                    break;
                case R.id.navigation_dietlist:

                    selectedFragment= new DietList();
                    break;
            }
            FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayout,selectedFragment);
            transaction.commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        navigation.setSelectedItemId((R.id.navigation_home));
        navigation.setSelectedItemId((R.id.navigation_health));
        navigation.setSelectedItemId((R.id.navigation_dietlist));


    }

}
