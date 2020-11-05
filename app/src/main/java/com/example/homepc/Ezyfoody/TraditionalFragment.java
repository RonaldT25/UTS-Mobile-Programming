package com.example.homepc.Ezyfoody;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class TraditionalFragment extends Fragment {


    public TraditionalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_traditional, container, false);

        ArrayList<TraditionalfoodClass> trad_food = new ArrayList<TraditionalfoodClass>();
        trad_food.add(new TraditionalfoodClass("Karahi", "Rp.125000", R.drawable.karahi,"0"));
        trad_food.add(new TraditionalfoodClass("Biryani", "Rp.15000", R.drawable.biryani,"0"));
        trad_food.add(new TraditionalfoodClass("Malai Boti", "Rp.45000", R.drawable.malaiboti,"0"));
        trad_food.add(new TraditionalfoodClass("Seekh Kabab", "Rp.40000", R.drawable.kabab,"0"));
        trad_food.add(new TraditionalfoodClass("Tikka", "Rp.25000", R.drawable.tikka,"0"));
        trad_food.add(new TraditionalfoodClass("Sajji", "Rp.155000", R.drawable.sajjione,"0"));

        TraditionalFoodAdapter tradfoodadapter = new TraditionalFoodAdapter(getActivity(),trad_food);

        ListView listView = (ListView) view.findViewById(R.id.listview_traditional);
        listView.setAdapter(tradfoodadapter);

        return view;
    }

}
