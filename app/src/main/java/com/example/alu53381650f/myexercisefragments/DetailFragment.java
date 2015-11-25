package com.example.alu53381650f.myexercisefragments;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.detail_fragment, container, false);
        return view;
    }

    public void setAndroidVersion(AndroidVersion av){
        View view = getView();
        TextView textName = (TextView) view.findViewById(R.id.detailName);
        textName.setText("Version name: "+av.getVersionName());
        TextView textNumber = (TextView) view.findViewById(R.id.detailNumber);
        textNumber.setText("Version number: "+av.getVersionNumber());
        ImageView imageView = (ImageView) view.findViewById(R.id.detailImageView);
        imageView.setImageDrawable(getActivity().getApplicationContext().getResources().getDrawable(av.getImage()));
        TextView text = (TextView) view.findViewById(R.id.detailText);
        text.setText(av.getText());
    }




}
