package com.example.informationbook.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import org.jetbrains.annotations.NotNull;

public class FragmentMoonCrater extends Fragment {

    private ImageView moonCraterImage;
    private ProgressBar progressBar;

    public static FragmentMoonCrater createInstance() {


        return new FragmentMoonCrater();
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_moon_crater, container, false);

        moonCraterImage = view.findViewById(R.id.imageViewCrater);
        progressBar = view.findViewById(R.id.progressBarMoonCrater);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/8/85/AS10-29-4324.jpg")
                .into(moonCraterImage, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBar.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                        progressBar.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
