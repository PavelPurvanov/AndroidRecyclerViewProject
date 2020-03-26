package bg.tu_varna.sit.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> moviesAdapter = new ArrayList<Movie>();
        moviesAdapter.add(new Movie("Title1", "Genre1", 2020));
        moviesAdapter.add(new Movie("Title2", "Genre2",2021));
        moviesAdapter.add(new Movie("Title3", "Genre3",2022));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        CustomAdapter adapter = new CustomAdapter(this,R.layout.rowlayout, moviesAdapter);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
