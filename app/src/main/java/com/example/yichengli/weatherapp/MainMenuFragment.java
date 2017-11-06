package com.example.yichengli.weatherapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainMenuFragment extends Fragment {


    public MainMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);

        String[] menuItems = {"Do something!",
                                "Do something else!",
                                 "Do yet another thing!"};

        ListView listView = (ListView) view.findViewById(R.id.mainMenu);
        final Button addBtn = (Button) view.findViewById(R.id.addCity);

        addBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), SearchCity.class);
                startActivity(intent);
            }
        });
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(getActivity(), DetailActivity.class);
                    startActivity(intent);
                } else if (i == 1) {
                    Toast.makeText(getActivity(), "You clicked the second message", Toast.LENGTH_SHORT).show();
                } else if (i == 2) {
                    Toast.makeText(getActivity(), "You clicked the third message", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
