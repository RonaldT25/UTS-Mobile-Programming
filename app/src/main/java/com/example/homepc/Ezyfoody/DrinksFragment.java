package com.example.homepc.Ezyfoody;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;




public class DrinksFragment extends Fragment {
    DatabaseHelper mydb;

    public DrinksFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_drinks, container, false);
        this.mydb = new DatabaseHelper(getContext());
        ArrayList<DrinksClass> D = new ArrayList<DrinksClass>();
        D.add(new DrinksClass("Blue Mojito", "Rp.35.000", R.drawable.drink1,"0"));
        D.add(new DrinksClass("Cherry Punch", "Rp.35.000", R.drawable.drink2,"0"));
        D.add(new DrinksClass("Lemon Squash", "Rp.35.000", R.drawable.drink3,"0"));
        D.add(new DrinksClass("Breeze Mint", "Rp.35.000", R.drawable.drink4,"0"));
        DrinksAdapter dadapter = new DrinksAdapter(getActivity(),D);


        ListView listView = (ListView) view.findViewById(R.id.listview_drinks);
        listView.setAdapter(dadapter);



        return view;
    }





}
