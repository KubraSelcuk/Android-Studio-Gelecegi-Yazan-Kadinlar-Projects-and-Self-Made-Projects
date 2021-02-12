package com.turkcell.gyk401.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.turkcell.gyk401.R;
import com.turkcell.gyk401.adapters.YemekAdapter;
import com.turkcell.gyk401.models.Yemek;

import java.util.ArrayList;
import java.util.List;

public class DietListFragment extends Fragment {

    public DietListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    List<Yemek> yemekList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_diet_list, container, false);

        ListView lvDiet = view.findViewById(R.id.lvDiet);

        yemekList.add(new Yemek("Zeytinyağlı Brokoli", "https://www.iyihisset.com/sites/default/files/ye-ic/shutterstock_649561816.jpg", 78));
        yemekList.add(new Yemek("Mercimek Köfte", "https://www.iyihisset.com/sites/default/files/ye-ic/shutterstock_692062945.jpg", 225));
        yemekList.add(new Yemek("Sebzeli Kepekli Makarna", "https://www.iyihisset.com/sites/default/files/ye-ic/shutterstock_302396369.jpg", 233));
        yemekList.add(new Yemek("Somon Balığı", "https://www.iyihisset.com/sites/default/files/ye-ic/shutterstock_566638006.jpg", 347));

        YemekAdapter adapter = new YemekAdapter(yemekList, getActivity());
        lvDiet.setAdapter(adapter);


        return view;
    }

}
