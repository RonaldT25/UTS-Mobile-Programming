package com.example.homepc.Ezyfoody;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class ContinentalFragment extends Fragment {


    public ContinentalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_continental, container, false);

        ArrayList<ContinentalClass> conti_food = new ArrayList<ContinentalClass>();
        conti_food.add(new ContinentalClass("Salsa", "Rp.30000", R.drawable.coneone,"0"));
        conti_food.add(new ContinentalClass("Arabic Pizza", "Rp.115000", R.drawable.ctwo,"0"));
        conti_food.add(new ContinentalClass("Macaroni", "Rp.25000", R.drawable.cthree,"0"));
        conti_food.add(new ContinentalClass("Pan Burger", "Rp.50000", R.drawable.cfive,"0"));


        ContinentalAdapter continentaladapter = new ContinentalAdapter(getActivity(),conti_food);

        ListView listView = (ListView) view.findViewById(R.id.listview_continental);
        listView.setAdapter(continentaladapter);

        return view;
    }

}
