package com.example.alu53381650f.myexercisefragments;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends android.app.ListFragment {


    public interface AndroidVersionReceiver {
        void setAndroidVersion(AndroidVersion av);
    }

    private AndroidVersionReceiver androidVersionReceiver;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<AndroidVersion> androidList = new ArrayList<AndroidVersion>();
        initList(androidList);

        final AndroidVersionAdapter adapter = new AndroidVersionAdapter(getActivity(),R.layout.item_layout,androidList);
        setListAdapter(adapter);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof AndroidVersionReceiver) {
            androidVersionReceiver = (AndroidVersionReceiver) activity;
        } else {
            throw new ClassCastException(activity.toString()
                    + " must implement ListFragment.AndroidVersionReceiver");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.list_layout, container, false);

    }



    public void onListItemClick(ListView parent, View v, int position, long id) {
        //Toast.makeText(getActivity(),
        //        "You have selected " + presidents[position], Toast.LENGTH_SHORT).show();
        AndroidVersion androidVersion = new AndroidVersion();
        androidVersion = (AndroidVersion) parent.getItemAtPosition(position);
        androidVersionReceiver.setAndroidVersion(androidVersion);
    }

    private void initList(ArrayList<AndroidVersion> list) {
        AndroidVersion version = new AndroidVersion();
        version.setVersionName("Cupcake");
        version.setVersionNumber("1.5");
        version.setImage(R.drawable.donut);
        version.setText("Support for an on-screen soft keyboard (like the iPhone). This will be essential, of course, for phones that do not have a hardware keyboard (like the Magic). But even if you do have a physical keyboard it's sometimes not worth the trouble to slide it out just to type in a couple of words.\n" +
                "Video recording and upload to YouTube. Now you can capture your barbershop frog quartet in action and post them for all the word to see.\n" +
                "Faster and more polished user interface in all applications. It was already fast, but now it's even more fasterer. Double-plus fast. With smoother, creamier controls and gradients.");
        list.add(version);

        AndroidVersion version2 = new AndroidVersion();
        version2.setVersionName("Donut");
        version2.setVersionNumber("1.6");
        version2.setImage(R.drawable.cupcake);
        version2.setText("Support for an on-screen soft keyboard (like the iPhone). This will be essential, of course, for phones that do not have a hardware keyboard (like the Magic). But even if you do have a physical keyboard it's sometimes not worth the trouble to slide it out just to type in a couple of words.\n" +
                "Video recording and upload to YouTube. Now you can capture your barbershop frog quartet in action and post them for all the word to see.\n" +
                "Faster and more polished user interface in all applications. It was already fast, but now it's even more fasterer. Double-plus fast. With smoother, creamier controls and gradients.");
        list.add(version2);

        AndroidVersion version3 = new AndroidVersion();
        version3.setVersionName("Eclair");
        version3.setVersionNumber("2.0");
        version3.setImage(R.drawable.eclair);
        version3.setText("Support for an on-screen soft keyboard (like the iPhone). This will be essential, of course, for phones that do not have a hardware keyboard (like the Magic). But even if you do have a physical keyboard it's sometimes not worth the trouble to slide it out just to type in a couple of words.\n" +
                "Video recording and upload to YouTube. Now you can capture your barbershop frog quartet in action and post them for all the word to see.\n" +
                "Faster and more polished user interface in all applications. It was already fast, but now it's even more fasterer. Double-plus fast. With smoother, creamier controls and gradients.");
        list.add(version3);

        AndroidVersion version4 = new AndroidVersion();
        version4.setVersionName("Froyo");
        version4.setVersionNumber("2.2");
        version4.setImage(R.drawable.froyo);
        version4.setText("Support for an on-screen soft keyboard (like the iPhone). This will be essential, of course, for phones that do not have a hardware keyboard (like the Magic). But even if you do have a physical keyboard it's sometimes not worth the trouble to slide it out just to type in a couple of words.\n" +
                "Video recording and upload to YouTube. Now you can capture your barbershop frog quartet in action and post them for all the word to see.\n" +
                "Faster and more polished user interface in all applications. It was already fast, but now it's even more fasterer. Double-plus fast. With smoother, creamier controls and gradients.");
        list.add(version4);

    }
}
