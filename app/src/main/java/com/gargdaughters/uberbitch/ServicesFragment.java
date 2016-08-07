package com.gargdaughters.uberbitch;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by M1036631 on 01-Aug-16.
 */
public class ServicesFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ServiceListAdapter adapter;
    RecyclerView.ItemDecoration dividerItemDecoration;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        ArrayList<String> serviceNames=new ArrayList<>();
        serviceNames.add("Service Name 1");
        serviceNames.add("Service Name 2");
        serviceNames.add("Service Name 3");
        serviceNames.add("Service Name 4");
        serviceNames.add("Service Name 5");
        serviceNames.add("Service Name 6");
        serviceNames.add("Service Name 7");
        serviceNames.add("Service Name 8");
        serviceNames.add("Service Name 9");
        serviceNames.add("Service Name 10");
        serviceNames.add("Service Name 11");
        serviceNames.add("Service Name 12");
        serviceNames.add("Service Name 13");
        serviceNames.add("Service Name 14");
        ArrayList<String> wCost=new ArrayList<>();

        for(int i=0;i<14;i++)
            wCost.add("500");
        ArrayList<String> wendCost=new ArrayList<>();


        for(int i=0;i<14;i++)
        wendCost.add("500");

        adapter=new ServiceListAdapter(serviceNames,wCost,wendCost);
        dividerItemDecoration=new DividerItemDecorator(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view=inflater.inflate(R.layout.service_fragment,container,false);
        recyclerView=(RecyclerView) view.findViewById(R.id.recylerview);
        recyclerView.setAdapter(adapter);
        layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(dividerItemDecoration);
         return view;

    }
}
