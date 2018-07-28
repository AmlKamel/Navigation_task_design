package com.example.abdulnaser.navigation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

     drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView1 = (NavigationView) findViewById(R.id.nav_view);
        NavigationView navigationView2 = (NavigationView) findViewById(R.id.nav_view2);
        navigationView1.setNavigationItemSelectedListener(this);
        navigationView2.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //@Override
    /*public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

       if (id == R.id.home) {


           Toast.makeText(this,"home",Toast.LENGTH_LONG).show();


        } else if (id == R.id.profile)
        {
            Toast.makeText(this,"profile",Toast.LENGTH_LONG).show();

        } else if (id == R.id.favorite) {

           Toast.makeText(this,"favourite",Toast.LENGTH_LONG).show();

        } else if (id == R.id.inbox) {

           Toast.makeText(this,"inbox",Toast.LENGTH_LONG).show();

        } else if (id == R.id.contact_us) {

           Toast.makeText(this,"contact",Toast.LENGTH_LONG).show();


        } else if (id == R.id.setting) {
           Toast.makeText(this,"setting",Toast.LENGTH_LONG).show();


      }
       else if (id == R.id.event) {
           Toast.makeText(this,"event",Toast.LENGTH_LONG).show();

           }

       else if (id == R.id.feedback) {
           Toast.makeText(this,"feedback",Toast.LENGTH_LONG).show();


       }


        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    public void logOut(View view){

        Toast.makeText(this,"log out ",Toast.LENGTH_LONG).show();
        drawer.closeDrawer(GravityCompat.START);
    }

    public void showSchool(View view){

        Toast.makeText(this,"my school ",Toast.LENGTH_LONG).show();
        drawer.closeDrawer(GravityCompat.START);

    }


    public void howUse(View view){
        Toast.makeText(this,"how to use app ",Toast.LENGTH_LONG).show();
        drawer.closeDrawer(GravityCompat.START);
    }

    public void addSchool(View view){
        Toast.makeText(this,"add new school ",Toast.LENGTH_LONG).show();
        drawer.closeDrawer(GravityCompat.START);
    }
}
