package com.serranoie.crypteck.homescreen

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.serranoie.crypteck.R
import com.serranoie.crypteck.databinding.CurrencyItemBinding
import com.serranoie.data.crypteck.dto.book.AvailableBookImagePayload
import com.serranoie.data.crypteck.dto.book.AvailableBooksResponse

class HomeViewHolder(view: View, private val currencyAction: (AvailableBooksResponse) -> Unit): RecyclerView.ViewHolder(view) {

    private val binding = CurrencyItemBinding.bind(view)

    fun bind(item: AvailableBooksResponse){
//        Glide.with(itemView.context).load(item.photoUrl)
//            .placeholder(R.drawable.ic_thumbnail)
//            .into(binding.imageCurrency)

//        binding.currencyName.text = item.book
        binding.currencyName.text = "Nombre del book"

        itemView.setOnClickListener {
            currencyAction(item)
        }
    }

}