package com.example.samuel.projet_android_644;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jacques on 26.10.2016.
 */

public class WorkerAdapter extends ArrayAdapter<Worker> {


    public WorkerAdapter(Context context, List<Worker> workers) {
        super(context, 0, workers);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_worker,parent, false);
        }

        WorkerViewHolder viewHolder = (WorkerViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new WorkerViewHolder();
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.birthdate = (TextView) convertView.findViewById(R.id.birthdate);
            viewHolder.sex = (ImageView) convertView.findViewById(R.id.sex);
            //viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Worker worker = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.name.setText(worker.get_lastname() + " " + worker.get_firstname());
        viewHolder.birthdate.setText(worker.get_birthdate().toString());
        //viewHolder.avatar.setImageDrawable(new ColorDrawable(worker.getColor()));

        return convertView;
    }

    private class WorkerViewHolder{
        private  TextView name;
        private TextView birthdate;
        private ImageView sex;
    }
}
