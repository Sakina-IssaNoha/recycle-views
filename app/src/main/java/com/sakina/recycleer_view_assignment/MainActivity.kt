package com.sakina.recycleer_view_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sakina.recycleer_view_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList=displayNumbersList(100)
        println(numberList)
        binding.rvnumbers.layoutManager=LinearLayoutManager(this)
        binding.rvnumbers.adapter=NumbersAdapter(numberList)
    }

    fun displayNumbersList(size:Int):List<Int>{ 
        var list=ArrayList<Int>()
       var firstnum=0
        var secondnum=1
        var count=0
        while (count<=size){
            print(firstnum)
            val next=firstnum+secondnum
            firstnum=secondnum
            secondnum=next
            count++
            list+=next
        }
        return list
    }
}