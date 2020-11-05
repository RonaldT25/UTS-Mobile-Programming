package com.example.homepc.Ezyfoody;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;





public class ChineseFragment extends Fragment {
    DatabaseHelper mydb;

    public ChineseFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_chinese, container, false);
        this.mydb = new DatabaseHelper(getContext());
        ArrayList<ChineseClass> c_food = new ArrayList<ChineseClass>();
        c_food.add(new ChineseClass("Fried Rice", "Rp.15000", R.drawable.friedrice,"0"));
        c_food.add(new ChineseClass("Sushi", "Rp.55000", R.drawable.sushi,"0"));
        c_food.add(new ChineseClass("Haka Noodles", "Rp.25000", R.drawable.haka,"0"));
        c_food.add(new ChineseClass("Corn Soup", "Rp.10000", R.drawable.soup,"0"));

        ChineseAdapter cadapter = new ChineseAdapter(getActivity(),c_food);


        ListView listView = (ListView) view.findViewById(R.id.listview_chinese);
        listView.setAdapter(cadapter);



        return view;
    }





}
