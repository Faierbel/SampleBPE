package io.github.samplebpe;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pagerAdapter = new PagerAdapter(getSupportFragmentManager());

        viewPager = findViewById(R.id.main_activity_view_pager);

        pagerAdapter.addFragment(new SampleFragment());
        pagerAdapter.addFragment(new SampleFragment());
        pagerAdapter.addFragment(new SampleFragment());


        viewPager.setAdapter(pagerAdapter);
        viewPager.setOffscreenPageLimit(3);
    }
}
