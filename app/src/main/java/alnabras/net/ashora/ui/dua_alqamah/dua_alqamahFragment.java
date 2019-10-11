package alnabras.net.ashora.ui.dua_alqamah;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import alnabras.net.ashora.R;

public class dua_alqamahFragment extends Fragment {

    private dua_alqamahViewModel dua_alqamahViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dua_alqamahViewModel =
                ViewModelProviders.of(this).get(dua_alqamahViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dua_alqamah, container, false);
        final TextView textView = root.findViewById(R.id.text_dua_alqamah);
        dua_alqamahViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}