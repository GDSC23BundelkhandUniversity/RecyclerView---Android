package com.example.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Mylistadapter(val mylist: ArrayList<mydatamodel>) :
    RecyclerView.Adapter<Mylistadapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false)
        return ViewHolder(view)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mydata = mylist[position]

        holder.img.setImageResource(mydata.img)
        holder.mytxt.text = mydata.text

    }

    override fun getItemCount(): Int {
        return mylist.size

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val img = itemView.findViewById<ImageView>(R.id.imgone)
        val mytxt = itemView.findViewById<TextView>(R.id.txtone)


    }
}