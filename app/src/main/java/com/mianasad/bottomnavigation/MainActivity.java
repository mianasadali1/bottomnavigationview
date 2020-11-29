package com.mianasad.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.fxn.OnBubbleClickListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.iammert.library.readablebottombar.ReadableBottomBar;
import com.mianasad.bottomnavigation.databinding.ActivityMainBinding;

import me.ibrahimsn.lib.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentTransaction homeTrans = getSupportFragmentManager().beginTransaction();
        homeTrans.replace(R.id.content, new HomeFragment());
        homeTrans.commit();

//        binding.bottomNav.addBubbleListener(new OnBubbleClickListener() {
//            @Override
//            public void onBubbleClick(int i) {
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                switch (i) {
//                    case 0:
//                        transaction.replace(R.id.content, new HomeFragment());
//                        break;
//                    case 1:
//                        transaction.replace(R.id.content, new SearchFragment());
//                        break;
//                    case 2:
//                        transaction.replace(R.id.content, new CartFragment());
//                        break;
//                    case 3:
//                        transaction.replace(R.id.content, new SettingsFragment());
//                        break;
//                }
//                transaction.commit();
//            }
//        });

        // ---------- Readable Bottom Bar ---------- //

//        binding.bottomNav.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
//            @Override
//            public void onItemSelected(int i) {
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                switch (i) {
//                    case 0:
//                        transaction.replace(R.id.content, new HomeFragment());
//                        break;
//                    case 1:
//                        transaction.replace(R.id.content, new SearchFragment());
//                        break;
//                    case 2:
//                        transaction.replace(R.id.content, new CartFragment());
//                        break;
//                    case 3:
//                        transaction.replace(R.id.content, new SettingsFragment());
//                        break;
//                }
//                transaction.commit();
//            }
//        });

        // ----------- Smooth Bar ----------//

//        binding.bottomNav.setOnItemSelectedListener(new OnItemSelectedListener() {
//            @Override
//            public boolean onItemSelect(int i) {
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                switch (i) {
//                    case 0:
//                        transaction.replace(R.id.content, new HomeFragment());
//                        break;
//                    case 1:
//                        transaction.replace(R.id.content, new SearchFragment());
//                        break;
//                    case 2:
//                        transaction.replace(R.id.content, new CartFragment());
//                        break;
//                    case 3:
//                        transaction.replace(R.id.content, new SettingsFragment());
//                        break;
//                }
//                transaction.commit();
//                return false;
//            }
//        });


        // ------------ Default Bar -------------- //

//        binding.bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                switch (item.getItemId()) {
//                    case R.id.home:
//                        transaction.replace(R.id.content, new HomeFragment());
//                        break;
//                    case R.id.search:
//                        transaction.replace(R.id.content, new SearchFragment());
//                        break;
//                    case R.id.cart:
//                        transaction.replace(R.id.content, new CartFragment());
//                        break;
//                    case R.id.settings:
//                        transaction.replace(R.id.content, new SettingsFragment());
//                        break;
//                }
//                transaction.commit();
//                return true;
//            }
//        });
    }
}