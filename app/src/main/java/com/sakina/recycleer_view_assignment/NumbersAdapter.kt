package com.sakina.recycleer_view_assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersAdapter(var numberList:List<Int>):RecyclerView.Adapter<NumbersDisplayer>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersDisplayer {
        var itemview= LayoutInflater.from(parent.context)
            .inflate(R.layout.numbers_list_item,parent ,false)
        return NumbersDisplayer(itemview)
    }

    override fun onBindViewHolder(holder: NumbersDisplayer, position: Int) {
        holder.tvnumbers.text=numberList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numberList.size
    }

}
class NumbersDisplayer(itemview:View):RecyclerView.ViewHolder(itemview){
    var tvnumbers=itemview.findViewById<TextView>(R.id.tvnumbers)

}