package com.example.mymovies.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymovies.R
import com.example.mymovies.api.Retrofit
import com.example.mymovies.data.MovieAdapter
import com.example.mymovies.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createRecyclerView()

        lifecycleScope.launch {
            val retrofit = Retrofit.downloadMovies.getAllFilms()
        }
    }

    private fun createRecyclerView() {
        val recyclerViewMovies = findViewById<RecyclerView>(R.id.recyclerViewMovies)
        val adapter = MovieAdapter()
        recyclerViewMovies.adapter = adapter
    }
}