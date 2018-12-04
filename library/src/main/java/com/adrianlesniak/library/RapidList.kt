package com.adrianlesniak.library

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet

class RapidList @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
) : RecyclerView(context, attributeSet, defStyle) {

    //    Defaults
    private val defaultLayoutManager = LinearLayoutManager(context, VERTICAL, false)

    private lateinit var rapidListAdapter: RapidListAdapter

    fun setup(
        itemCount: Int,
        layoutManager: LayoutManager? = defaultLayoutManager,
        itemBuilder: ItemBuilder,
        itemBinder: ItemBinder
    ) {
        rapidListAdapter = RapidListAdapter.create(itemCount, itemBuilder, itemBinder)

        this.layoutManager = layoutManager
        this.adapter = rapidListAdapter
    }
}
