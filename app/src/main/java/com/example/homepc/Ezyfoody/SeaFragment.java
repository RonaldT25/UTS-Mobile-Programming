package com.example.homepc.Ezyfoody;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class SeaFragment extends Fragment {


    public SeaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sea, container, false);

        ArrayList<SeaClass> sea_food = new ArrayList<SeaClass>();
        sea_food.add(new SeaClass("Finger Fish", "Rp.60000", R.drawable.fingerfish,"0"));
        sea_food.add(new SeaClass("Shrimp", "Rp.90000", R.drawable.shrimp,"0"));
        sea_food.add(new SeaClass("Fried Fish", "Rp.65000", R.drawable.fishone,"0"));
        sea_food.add(new SeaClass("Prawn Soup", "Rp.45000", R.drawable.prawnsoup,"0"));

        SeaAdapter seaadapter = new SeaAdapter(getActivity(),sea_food);

        ListView listView = (ListView) view.findViewById(R.id.listview_sea);
        listView.setAdapter(seaadapter);





        return view;
    }

}
