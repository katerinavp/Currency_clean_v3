package com.petukhova.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.petukhova.domain.model.DomainCurrencyNetwork
import com.petukhova.presentation.databinding.RecyclerviewItemBinding


class AdapterCurrency : ListAdapter<DomainCurrencyNetwork, AdapterCurrency.CurrencyViewHolder>(
    ModelCurrencyDiffer
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder =
            CurrencyViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class CurrencyViewHolder(private val binding: RecyclerviewItemBinding, ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(currency: DomainCurrencyNetwork) {
            with(binding) {
                ticker.text = currency.charCode
                nameCurrency.text = currency.name
                value.text = currency.value.toString()
            }
        }
    }

}
