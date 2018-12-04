package com.adrianlesniak.rapidlist

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class QuoteItemHolder(val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(quote: String) {
        view.findViewById<TextView>(R.id.quote).text = quote
    }
}
