package com.example.insta;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MycustomAdapter extends RecyclerView.Adapter<MycustomAdapter.Myviewholder>
{

    Context context;
    ArrayList<information> data;
    LayoutInflater l;

    public MycustomAdapter(Context context, ArrayList<information> data)
    {
        this.context=context;
        this.data=data;
        l=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

  View view=l.inflate(R.layout.insta_feed,parent,false);
        Myviewholder hold=new Myviewholder(view);
        return hold;
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position)
    {
         holder.i1.setImageResource(data.get(position).imageid);
         holder.tv.setText(data.get(position).title);
         holder.i2.setImageResource(data.get(position).postpic);
         holder.tv1.setText(data.get(position).liking);
         holder.tv2.setText(data.get(position).title1);
         holder.tv4.setText(data.get(position).tagg);
         holder.tv3.setText(data.get(position).tym);

    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder
    {
        TextView tv,tv1,tv2,tv3,tv4;
        ImageView i2;
        CircleImageView i1;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            i1=(CircleImageView) itemView.findViewById(R.id.circleImageView);
            tv=(TextView) itemView.findViewById(R.id.t1);
            i2=(ImageView) itemView.findViewById(R.id.imageView);
            tv1=(TextView) itemView.findViewById(R.id.textView2);
            tv2=(TextView) itemView.findViewById(R.id.textView4);
            tv4=(TextView) itemView.findViewById(R.id.textView7);
            tv3=(TextView) itemView.findViewById(R.id.textView6);

        }
    }
}
