package com.example.recycleview

import MyAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R.id.recylerview

class MainActivity : AppCompatActivity() {
    lateinit var myRecyclerView: RecyclerView
    lateinit var newsArrayList: ArrayList<News>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recylerview)

        var newsimagearray = arrayOf(
            R.drawable.image,
            R.drawable.download,
            R.drawable.newsapp3,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image8
        )

        var newsheading = arrayOf(
         "Bumrah Shandaar...': AB de Villiers' special Hindi message for newly-crowned world no.1 Test bowler",
            "Hemant Soren kept in basement with no sunlight, claims advocate; ED remand extended",
            "Ben Stokes-led England team leaves India after losing 2nd Test in Visakhapatnam",
            "Punjab man shot dead by terrorists in Srinagar; 1 critically injured: Police",
            "two wildest animal spotted at the wedding ceremony - source ",
            "Just In | Virat Kohli Likely To Miss Remainder Of England Tests"
        )
    // to set the haav bhaav of the items inside the recylerview , vertical scrolling , horizontal scrolling and uniform grid

        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()

        for(index in newsimagearray.indices){
            var news = News(newsheading[index],newsimagearray[index])
            newsArrayList.add(news)
        }

     myRecyclerView.adapter = MyAdapter( newsArrayList )

    }
}