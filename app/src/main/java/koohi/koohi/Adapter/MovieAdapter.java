package koohi.koohi.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import koohi.koohi.Main3Activity;
import koohi.koohi.Model.Movie1;
import koohi.koohi.R;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    List<Movie1> movie1s;
    Activity activity;

    public MovieAdapter(Activity activity, List<Movie1> movie1s) {
        this.movie1s = movie1s;
        this.activity = activity;
    }

    public void addData(ArrayList<Movie1> movie1s) {
        if (movie1s == null)
            movie1s = new ArrayList<>();
        this.movie1s = movie1s;
        notifyDataSetChanged();
    }

    public void clearData() {
        movie1s.clear();
        notifyDataSetChanged();
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.buy_acanth_sale, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie1 movie = movie1s.get(position);
        holder.TextView1.setText(movie.getAccount());
        holder.TextView2.setText(movie.getSwing());
        holder.TextView3.setText(movie.getOfyour());
        holder.TextView4.setText(movie.getWork());
        holder.TextView5.setText(movie.getName());
        holder.TextView6.setText(movie.getKing());
        holder.TextView7.setText(movie.getQueen());
        holder.TextView8.setText(movie.getLmmortal());
        holder.TextView9.setText(movie.getPrice());
        holder.TextView10.setText(movie.getAsthma());
        holder.TextView11.setText(movie.getExplanation());
    }

    @Override
    public int getItemCount() {
        return movie1s.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        public TextView TextView1;
        public TextView TextView2;
        public TextView TextView3;
        public TextView TextView4;
        public TextView TextView5;
        public TextView TextView6;
        public TextView TextView7;
        public TextView TextView8;
        public TextView TextView9;
        public TextView TextView10;
        public TextView TextView11;

        public MovieViewHolder(View itemView) {
            super(itemView);
            TextView1 = (TextView) itemView.findViewById(R.id.TextView1);
            TextView2 = (TextView) itemView.findViewById(R.id.TextView2);
            TextView3 = (TextView) itemView.findViewById(R.id.TextView3);
            TextView4 = (TextView) itemView.findViewById(R.id.TextView4);
            TextView5 = (TextView) itemView.findViewById(R.id.TextView5);
            TextView6 = (TextView) itemView.findViewById(R.id.TextView6);
            TextView7 = (TextView) itemView.findViewById(R.id.TextView7);
            TextView8 = (TextView) itemView.findViewById(R.id.TextView8);
            TextView9 = (TextView) itemView.findViewById(R.id.TextView9);
            TextView10 = (TextView) itemView.findViewById(R.id.TextView10);
            TextView11 = (TextView) itemView.findViewById(R.id.TextView11);
        }
    }
}
