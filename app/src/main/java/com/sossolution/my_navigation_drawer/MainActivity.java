package com.sossolution.my_navigation_drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private Toolbar toolbar;
    private NavigationView view;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initiazation();
        drawerLayout = findViewById(R.id.drawer_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(MainActivity.this);
       // navigationView.setNavigationItemSelectedListener(this);
        //displaySelectedScreen(R.id.account);
       /* navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                int id = item.getItemId();
               // Fragment fm=null;
                switch(id)
                {
                    case R.id.account:
                        Toast.makeText(MainActivity.this, "My Account",Toast.LENGTH_SHORT).show();break;
                       // First_Fragment fm= new First_Fragment();
                        //getSupportFragmentManager().beginTransaction().replace(R.id.container1,fm).commit();
                    case R.id.settings:
                        Toast.makeText(MainActivity.this, "Settings",Toast.LENGTH_SHORT).show();break;
                    case R.id.mycart:
                        Toast.makeText(MainActivity.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    default:
                        return true;
                }


                return true;

            }
        });*/


    }

   /* private void displaySelectedScreen(int account)
    {
        Fragment fragment = null;

        //initializing the fragment object which is selected
        switch (account) {
            case R.id.account1:
                fragment = new First_Fragment();
                break;
            case R.id.settings:
                fragment = new Second_Fragment();
                break;
            case R.id.mycart:
                fragment = new third_Fragment();
                break;
        }

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.container1, fragment);
            ft.commit();
        }

        ////  DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // drawer.closeDrawer(GravityCompat.START);


    }*/


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        Fragment fragment=null;

        switch (item.getItemId())
        {
            case R.id.account:
               fragment=new First_Fragment();
               break;
            case R.id.settings:
                fragment=new Second_Fragment();
                break;
            case R.id.mycart:
                fragment=new third_Fragment();
                break;
            case R.id.account1:
                fragment=new Fourth_Fragment();
                break;
            case R.id.settings1:
                fragment=new Five_Fragment();
                break;

        }
        if (fragment != null)
        {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.container2, fragment);
            ft.commit();
        }

       // DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
         drawerLayout.closeDrawer(GravityCompat.START);

       return true;
    }
}


