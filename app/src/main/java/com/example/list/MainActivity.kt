package com.example.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var myadapter: Mylistadapter
    lateinit var mydatamodel: mydatamodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mylist = ArrayList<mydatamodel>()

        mylist.add(mydatamodel(R.drawable.one, "Hello"))
        mylist.add(mydatamodel(R.drawable.two, "One"))
        mylist.add(mydatamodel(R.drawable.one, "Two"))
        mylist.add(mydatamodel(R.drawable.two, "Three"))
        mylist.add(mydatamodel(R.drawable.three, "Four"))
        mylist.add(mydatamodel(R.drawable.five, "Five"))
        mylist.add(mydatamodel(R.drawable.four, "Six"))
        mylist.add(mydatamodel(R.drawable.two, "Seven"))



        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        myadapter = Mylistadapter(mylist)
        recyclerView.adapter = myadapter

    }
}