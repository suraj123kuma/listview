package com.example.listview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Listview

        var arr = arrayListOf("SURAJ", "SAHIL", "ROHIT", "SOHAIL", "EJAJ", "AKASH", "AJIT")

        val adapter = ArrayAdapter(this, R.layout.studentview, arr)

        val listView = findViewById<ListView>(R.id.listview)

        listView.adapter = adapter
        listView.setOnItemClickListener { adapterView, view, i, l ->
            var item=arr[i]
            Toast.makeText(this,"$item",Toast.LENGTH_SHORT).show()
        }


        // Gridview


        var arr1 = arrayListOf("SURAJ", "SAHIL", "ROHIT", "SOHAIL", "EJAJ", "AKASH", "AJIT")
        val adapter1 = ArrayAdapter(this, R.layout.gridview, arr1)
        var  GridView = findViewById<GridView>(R.id.gridview)

        GridView.adapter=adapter1
        GridView.setOnItemClickListener { adapterView, view, i, l ->
            var item5=arr1[i]
            Toast.makeText(this,"$item5",Toast.LENGTH_SHORT).show()
        }



        // Spinner

        var row = arrayListOf("SURAJ", "SAHIL", "ROHIT", "SOHAIL", "EJAJ", "AKASH", "AJIT")

        val spiner = ArrayAdapter(this, R.layout.spinner, row)

        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = spiner
        listView.adapter = spiner

        spinner.onItemSelectedListener = object : OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(this@MainActivity, "${row[p2]}", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
               
            }
        }


    }



}


