package com.example.homepc.Ezyfoody;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class FastFoodFragment extends Fragment {


    public FastFoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fast_food, container, false);

        ArrayList<FastfoodClass> fastfood = new ArrayList<FastfoodClass>();
        fastfood.add(new FastfoodClass("Beef Burger", "Rp.25000", R.drawable.beef,"0"));
        fastfood.add(new FastfoodClass("Chicken Burger", "Rp.22000", R.drawable.chicken,"0"));
        fastfood.add(new FastfoodClass("Zinger Burger", "Rp.35000", R.drawable.zinger,"0"));
        fastfood.add(new FastfoodClass("Fries", "Rp.12000", R.drawable.fries,"0"));
        fastfood.add(new FastfoodClass("Zinger Roll", "Rp.20000", R.drawable.roll,"0"));
        fastfood.add(new FastfoodClass("Club Sandwich", "Rp.25000", R.drawable.club,"0"));
        fastfood.add(new FastfoodClass("Chicken Wings", "Rp.17000", R.drawable.wings,"0"));
        fastfood.add(new FastfoodClass("Chicken Broast", "Rp.55000", R.drawable.broast,"0"));
        fastfood.add(new FastfoodClass("Chicken Nuggets", "Rp.20000", R.drawable.nuggets,"0"));

        FastFoodAdapter fastfoodadapter = new FastFoodAdapter(getActivity(),fastfood);

        ListView listView = (ListView) view.findViewById(R.id.listview_fastfood);
        listView.setAdapter(fastfoodadapter);
        return view;

    }

}
