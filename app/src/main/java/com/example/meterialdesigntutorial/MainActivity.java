package com.example.meterialdesigntutorial;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);
        toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerLayout =findViewById(R.id.drawer_layout);
        navigationView =findViewById(R.id.navigation_view);

        ActionBarDrawerToggle actionBarDrawerToggle =new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,R.string.open_drwer,R.string.close_drawer);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id =menuItem.getItemId();
                switch (id){
                    default:
                        Snackbar.make(findViewById(R.id.relative),"Working Navigation Drawer items", Snackbar.LENGTH_SHORT).show();
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });


    }


    // for toolbar

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.item1:
                Snackbar.make(findViewById(R.id.relative),"Item 01", Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Snackbar.make(findViewById(R.id.relative),"Item 02", Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Snackbar.make(findViewById(R.id.relative),"Item 03", Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Snackbar.make(findViewById(R.id.relative),"Search", Snackbar.LENGTH_SHORT).show();
                break;
            case  R.id.cart:
                Snackbar.make(findViewById(R.id.relative),"Search", Snackbar.LENGTH_SHORT).show();
                break;
            case  android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
