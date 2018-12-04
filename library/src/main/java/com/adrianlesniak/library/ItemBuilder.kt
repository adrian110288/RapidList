package com.adrianlesniak.library

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

typealias ItemBuilder = (parent: ViewGroup, index: Int) -> RecyclerView.ViewHolder
