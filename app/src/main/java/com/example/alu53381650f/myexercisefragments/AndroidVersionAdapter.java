package com.example.alu53381650f.myexercisefragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class AndroidVersionAdapter extends ArrayAdapter<AndroidVersion>{

    private ArrayList<AndroidVersion> listAndroidVersions;
    private Context context;
    int resourceId;

    public AndroidVersionAdapter(Context context, int resourceID,
                                 ArrayList<AndroidVersion> objects) {
        super(context, resourceID, objects);
        listAndroidVersions = objects;
        this.context = context;
        this.resourceId = resourceID;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater)
                    context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(resourceId, parent, false);
        }
        AndroidVersion obj = listAndroidVersions.get(position);
        if (obj != null) {
            TextView tv = (TextView) v.findViewById(R.id.labelNameVersion);
            TextView tn = (TextView) v.findViewById(R.id.labelNumVersion);
            if (tv != null)
                tv.setText("Version name: " + obj.getVersionName());
            if (tn != null)
                tn.setText("Version number: " + obj.getVersionNumber());
            int imageID = obj.getImage();
            if (imageID!=0) {
                ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
                imageView.setImageDrawable(getContext().getResources().getDrawable(imageID));
            }
        }
        return  v;
    }
}
