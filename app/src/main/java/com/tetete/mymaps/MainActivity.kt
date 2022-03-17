package com.tetete.mymaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMaps: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // layout manager
        rvMaps.layoutManager = LinearLayoutManager(this)
        // adapter on the recycler view
        rvMaps.adapter = MapsAdapter(this, emptyList<UserMap>)
    }
}