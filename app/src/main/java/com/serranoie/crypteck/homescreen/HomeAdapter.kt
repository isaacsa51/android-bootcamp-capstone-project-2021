package com.serranoie.crypteck.homescreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serranoie.crypteck.R
import com.serranoie.data.crypteck.dto.book.AvailableBooksResponse

class HomeAdapter(private val currencyAction: (AvailableBooksResponse) -> Unit): RecyclerView.Adapter<HomeViewHolder>() {

    private val items = mutableListOf<AvailableBooksResponse>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.currency_item, parent, false)

        return HomeViewHolder(view, currencyAction)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setItems(currencies: ArrayList<AvailableBooksResponse>) {
        items.clear()
        items.addAll(currencies)
        notifyDataSetChanged()
    }

}