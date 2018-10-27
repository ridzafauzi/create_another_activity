package com.example.budakgigibesi.ibeacon;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
	
    private DrawerLayout mDrawerLayout;
	private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
		// start another activity
		Intent intent = new Intent(this, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		this.startActivity(intent);
		
		//setContentView(R.layout.activity_main);		
		
		//setNavigationDrawer();	//set the drawer
		//setToolBar(); //set the toolbar
		
		// display home fragment
		//Fragment fragment = null;
		//fragment = new fragmentHome();
        //displaySelectedFragment(fragment);
		
		//enable beacon features///////////////////////////////////////////////////////////////////////
		
		//BeaconManager beaconManager = org.altbeacon.beacon.BeaconManager.getInstanceForApplication(this);
		//beaconManager.getBeaconParsers().clear();
        //beaconManager.getBeaconParsers().add(new BeaconParser().setBeaconLayout("m:2-3=0215,i:4-19,i:20-21,i:22-23,p:24-24"));
		//beaconManager.setEnableScheduledScanJobs(false);	// disable JobScheduler-based scans (used on Android 8+)
        //beaconManager.setBackgroundBetweenScanPeriod(0);	// set the time between each scan to be 1 hour (3600 seconds)
        //beaconManager.setBackgroundScanPeriod(1100);	// set the duration of the scan to be 1.1 seconds
		
        //Region region = new Region("backgroundRegion", null, null, null);
        //regionBootstrap = new RegionBootstrap(this, region);	// wake up the app when a beacon is seen
		
		//////////////////////////////////////////////////////////////////////////////////////////////
    }
	

	//Set the toolbar as the action bar. call setSupportActionBar() and pass the tb object from your layout
	//Note that we also enable the app icon via setHomeButtonEnabled() and enable it for “up” navigation via setDisplayHomeAsUpEnabled(). 
	//private void setToolBar() {
    //    Toolbar toolbar = findViewById(R.id.toolbar_main);
    //    setSupportActionBar(toolbar);
    //    ActionBar actionbar = getSupportActionBar();
    //    actionbar.setDisplayHomeAsUpEnabled(true);
    //    actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);       
    //}
	

	// To handle when user clicks on an item
	//private void setNavigationDrawer() {
	//	mDrawerLayout = findViewById(R.id.drawer_layout);

    //    NavigationView navigationView = findViewById(R.id.nav_view);
    //    navigationView.setNavigationItemSelectedListener(this);
	//}
	
	
	
	//@Override
    //public boolean onOptionsItemSelected(MenuItem item) {
    //    switch (item.getItemId()) {
    //        case android.R.id.home:
    //            mDrawerLayout.openDrawer(GravityCompat.START);
    //            return true;
    //    }
    //    return super.onOptionsItemSelected(item);
    //}
	
	//@SuppressWarnings("StatementWithEmptyBody")
    //@Override
    //public boolean onNavigationItemSelected(MenuItem item) {
		
	//	int id = item.getItemId();
    //    Fragment fragment = null;
    //    if (id == R.id.nav_item_four) {
    //        fragment = new fragment4();
    //        displaySelectedFragment(fragment);
    //    } else if (id == R.id.nav_item_five) {
    //        fragment = new fragment5();
    //        displaySelectedFragment(fragment);
	//	}
		
        // close drawer when item is tapped
	//	mDrawerLayout = findViewById(R.id.drawer_layout);
    //    mDrawerLayout.closeDrawer(GravityCompat.START);
    //    return true;
    //}

	//private void displaySelectedFragment(Fragment fragment) {
    //    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    //   fragmentTransaction.replace(R.id.dyn_container, fragment);
    //    fragmentTransaction.commit();
		
    //}
	
	//@Override
    //public void didEnterRegion(Region arg0) {
    //    monitoringActivity.logToDisplay("I see a beacon again" );        
    //}
	
	//@Override
    //public void didExitRegion(Region region) {
    //    if (monitoringActivity != null) {
    //        monitoringActivity.logToDisplay("I no longer see a beacon.");
    //    }
    //}
	
}
	

