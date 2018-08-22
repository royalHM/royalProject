package koohi.koohi.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import koohi.koohi.Model.RoyalMovie;
import koohi.koohi.R;



public class RoyalAdapter extends RecyclerView.Adapter<RoyalAdapter.MovieViewHolder> {

    List<RoyalMovie> royal;

    public RoyalAdapter(List<RoyalMovie> royal, Activity activity) {
        this.royal = royal;
    }

    public void addData(List<RoyalMovie> royal){
        this.royal = royal;
        notifyDataSetChanged();
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.clashroyale, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        RoyalMovie royal1 = royal.get(position);
        holder.textView.setText(royal1.getName());
        holder.imageView1.setImageResource(royal1.getImageView1());
        holder.imageView2.setImageResource(royal1.getImageView2());
        holder.imageView3.setImageResource(royal1.getImageView3());
        holder.imageView4.setImageResource(royal1.getImageView4());

    }

    @Override
    public int getItemCount() {
        return royal.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView1;
        public ImageView imageView2;
        public ImageView imageView3;
        public ImageView imageView4;


        public MovieViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.textView);
            imageView1 = (ImageView) itemView.findViewById(R.id.imageView1);
            imageView2 = (ImageView) itemView.findViewById(R.id.imageView2);
            imageView3 = (ImageView) itemView.findViewById(R.id.imageView3);
            imageView4 = (ImageView) itemView.findViewById(R.id.imageView4);
        }
    }
}


