package io.github.samplebpe;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SampleTabFragment extends Fragment {

    public SampleTabFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sample_tab, container, false);
        TextView textView = view.findViewById(R.id.text);
        textView.setText(getClass().getCanonicalName());
        return view;
    }

}
