package com.qurantshumovskiy.tj;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterList extends BaseAdapter {

    private Context mContext;

    public static int nummp3=0;




    MainActivity myActivity;
    public AdapterList(MainActivity myActivity){
        this.myActivity=myActivity;
    }



    Context context;
    ArrayList<ListPojo> listPojos;

    public AdapterList(Context context, ArrayList<ListPojo> listPojos) {
        this.context = context;
        this.listPojos = listPojos;
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return listPojos.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {

        // view = LayoutInflater.from(context).inflate(R.layout.list_custom_design,parent,false);
        view = LayoutInflater.from(context).inflate(R.layout.custom_list,parent,false);



        TextView title = view.findViewById(R.id.title);
        TextView description = view.findViewById(R.id.description);
        ImageView image = view.findViewById(R.id.image);



        title.setText(listPojos.get(position).getTitle());
        description.setText(listPojos.get(position).getDesription());
        image.setImageResource(listPojos.get(position).getImages());



        int nnn = position;


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             nummp3=position;
                // Toast.makeText(context, "Position "+nummp3, Toast.LENGTH_SHORT).show();

                ((MainActivity)mContext).mp3start();

                v.setBackgroundColor(Color.CYAN);

                v.isClickable();








                // choosed.setBackgroundColor(mContext.getResources().getColor(R.color.colorAccent));
             }



        });

        return view;
    }



}

