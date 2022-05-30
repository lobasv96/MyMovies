package com.example.mymovies.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mymovies.R
import com.example.mymovies.pojo.Movie
import com.example.mymovies.pojo.Results
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    var movieItemList: List<Movie> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    //(прим. inner - внутренний класс)
    inner class MovieViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imageViewPoster = view.imageViewPoster
        val textViewTitle = view.textViewTitle
        val textViewDescription = view.textViewDescription
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.movie_item,
            parent,
            false
        )
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
       val movie = movieItemList[position]
        val title = movie.display_title
        val poster = movie.multimedia
        val description = movie.summary_short

        holder.textViewTitle.setText(title)
        holder.textViewDescription.setText(description)
        Picasso.get()
            .load(poster.toString())
            .error(R.drawable.ic_launcher_foreground)
            .fit()
            .into(holder.imageViewPoster)

    }

    override fun getItemCount(): Int {
        return movieItemList.size
    }
}