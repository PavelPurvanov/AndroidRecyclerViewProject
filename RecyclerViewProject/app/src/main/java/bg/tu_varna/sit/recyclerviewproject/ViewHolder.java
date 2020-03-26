package bg.tu_varna.sit.recyclerviewproject;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView textViewTitle;
    private TextView textViewGenre;
    private TextView textViewYear;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewTitle = itemView.findViewById(R.id.textView1);
        textViewGenre = itemView.findViewById(R.id.textView2);
        textViewYear = itemView.findViewById(R.id.textView3);
    }

    public TextView getTextViewTitle() {
        return textViewTitle;
    }

    public TextView getTextViewGenre() {
        return textViewGenre;
    }

    public TextView getTextViewYear() {
        return textViewYear;
    }

    public void setTextViewTitle(String title) {
        this.textViewTitle.setText(title);
    }

    public void setTextViewGenre(String genre) {
        this.textViewGenre.setText(genre);
    }

    public void setTextViewYear(String year) {
        this.textViewYear.setText(year);
    }

}
