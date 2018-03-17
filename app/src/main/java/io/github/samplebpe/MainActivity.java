package io.github.samplebpe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationViewPager;

public class MainActivity extends AppCompatActivity {

    AHBottomNavigation bottomNavigation;

    AHBottomNavigationViewPager viewPager;

    PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pagerAdapter = new PagerAdapter(getSupportFragmentManager());

        bottomNavigation = findViewById(R.id.main_activity_nav);
        viewPager = findViewById(R.id.main_activity_view_pager);

        bottomNavigation.addItem(new AHBottomNavigationItem("Sample", R.drawable.ic_menu_dashboard_24dp));
        bottomNavigation.addItem(new AHBottomNavigationItem("Sample", R.drawable.ic_menu_dashboard_24dp));
        bottomNavigation.addItem(new AHBottomNavigationItem("Sample", R.drawable.ic_menu_dashboard_24dp));

        pagerAdapter.addFragment(new SampleFragment());
        pagerAdapter.addFragment(new SampleFragment());
        pagerAdapter.addFragment(new SampleFragment());

        viewPager.setPagingEnabled(false);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOffscreenPageLimit(3);
    }
}
