package com.adrianlesniak.library

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

internal class RapidListAdapter private constructor(
    private val count: Int,
    private val itemBuilder: ItemBuilder,
    private val itemBinder: ItemBinder
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {

        fun create(
            count: Int,
            itemBuilder: ItemBuilder,
            itemBinder: ItemBinder
        ) =
            RapidListAdapter(count, itemBuilder, itemBinder)
    }

    override fun onCreateViewHolder(parent: ViewGroup, index: Int): RecyclerView.ViewHolder =
        itemBuilder.invoke(parent, index)

    override fun getItemCount(): Int =
        count

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, index: Int) =
        itemBinder.invoke(holder, index)
}
