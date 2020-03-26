package bg.tu_varna.sit.recyclerviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Movie> MovieList;
    private Context context;

    public CustomAdapter(MainActivity mainActivity, int activity_main, ArrayList<Movie> movieList) {
        MovieList = movieList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View movieView = inflater.inflate(R.layout.rowlayout, parent, false);

        ViewHolder viewHolder = new ViewHolder((movieView));

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Movie movie = MovieList.get(position);

        holder.setTextViewTitle(movie.getTitle());
        holder.setTextViewGenre(movie.getGenre());
        holder.setTextViewYear(Long.toString(movie.getYear()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, movie.getTitle() + ": " +
                                movie.getGenre() + ": " +
                                movie.getYear(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return MovieList.size();
    }
}
