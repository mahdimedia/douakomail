package alnabras.net.ashora.ui.zayart_ashora;

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

public class zayart_ashora_Fragment extends Fragment {

    private zayart_ashora_ViewModel zayartashoraViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        zayartashoraViewModel =
                ViewModelProviders.of(this).get(zayart_ashora_ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_zayart_ashora, container, false);
        final TextView textView = root.findViewById(R.id.text_dua_alqamah);
        zayartashoraViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}