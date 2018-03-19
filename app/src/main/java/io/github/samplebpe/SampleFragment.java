package io.github.samplebpe;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SampleFragment extends Fragment {

    PagerTabAdapter pagerTabAdapter;

    TabLayout tabLayout;

    ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sample, container, false);

        pagerTabAdapter = new PagerTabAdapter(getChildFragmentManager());

        tabLayout = view.findViewById(R.id.fragment_tab_layout);
        viewPager = view.findViewById(R.id.fragment_viewpager);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        for (int i = 0; i < 20; i++) {
            pagerTabAdapter.addFragment(new SampleTabFragment());
        }

        viewPager.setAdapter(pagerTabAdapter);
        viewPager.setOffscreenPageLimit(2);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(5);

    }
}
