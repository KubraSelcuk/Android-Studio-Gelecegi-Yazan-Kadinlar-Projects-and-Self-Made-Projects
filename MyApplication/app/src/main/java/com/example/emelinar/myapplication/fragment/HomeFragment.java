package com.example.emelinar.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.emelinar.myapplication.R;
import com.example.emelinar.myapplication.adapters.geziAdapter;
import com.example.emelinar.myapplication.adapters.geziAdapter;
import com.example.emelinar.myapplication.models.gezi;
import com.example.emelinar.myapplication.models.gezi;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DietListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    List<gezi> geziList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        ListView lvGezi = view.findViewById(R.id.lvGezi);

        geziList.add(new gezi("Peynir","https://pngimage.net/wp-content/uploads/2018/05/beyaz-peynir-png-3.png","93"));
        geziList.add(new gezi("Zeytin","http://pngimg.com/uploads/olives/olives_PNG14314.png","41"));
        geziList.add(new gezi("Salatalık","https://pngimage.net/wp-content/uploads/2018/06/salatal%C4%B1k-png-.png","18"));
        geziList.add(new gezi("Domates","http://www.torku.com.tr/Upload/Contents/6563900_domates.png","20"));

        geziAdapter adapter = new geziAdapter(geziList, getActivity());
        lvGezi.setAdapter(adapter);

        return view;
    }

}
