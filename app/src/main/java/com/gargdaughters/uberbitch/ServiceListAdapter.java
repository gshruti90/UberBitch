package com.gargdaughters.uberbitch;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by M1036631 on 01-Aug-16.
 */
public class ServiceListAdapter extends RecyclerView.Adapter<ServiceListAdapter.ViewHolder> {

    ArrayList<String> serviceNames;
    ArrayList<String> wCost;
    ArrayList<String> wendCost;

    ServiceListAdapter(ArrayList serviceNames, ArrayList wCost, ArrayList wendCost)
    {
        super();
        this.serviceNames=serviceNames;
        this.wCost=wCost;
        this.wendCost=wendCost;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView serviceName,wCost,wendCost;

        public ViewHolder(View itemView) {
            super(itemView);
            serviceName=(TextView)itemView.findViewById(R.id.textView);
            wCost=(TextView)itemView.findViewById(R.id.textView2);
            wendCost=(TextView)itemView.findViewById(R.id.textView3);

        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.service_item_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.serviceName.setText(serviceNames.get(position));
        holder.wCost.setText(wCost.get(position));
        holder.wendCost.setText(wendCost.get(position));
    }

    @Override
    public int getItemCount() {
        return serviceNames.size();
    }
}
