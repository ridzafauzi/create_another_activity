package com.example.budakgigibesi.ibeacon;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
	
	private DrawerLayout mDrawerLayout;

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setNavigationDrawer();	//set the drawer
		setToolBar(); //set the toolbar
		
		// display home fragment
		Fragment fragment = null;
		fragment = new fragmentHome();
        displaySelectedFragment(fragment);
	}
	
	//Set the toolbar as the action bar. call setSupportActionBar() and pass the tb object from your layout
	//Note that we also enable the app icon via setHomeButtonEnabled() and enable it for “up” navigation via setDisplayHomeAsUpEnabled(). 
	private void setToolBar() {
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);       
    }	

	// To handle when user clicks on an item
	private void setNavigationDrawer() {
		mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
	
	@SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
		
		int id = item.getItemId();
        Fragment fragment = null;
        if (id == R.id.nav_item_four) {
            fragment = new fragment4();
            displaySelectedFragment(fragment);
        } else if (id == R.id.nav_item_five) {
            fragment = new fragment5();
            displaySelectedFragment(fragment);
		}
		
        // close drawer when item is tapped
		mDrawerLayout = findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

	private void displaySelectedFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.dyn_container, fragment);
        fragmentTransaction.commit();		
    }
}