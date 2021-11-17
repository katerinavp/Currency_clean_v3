package com.petukhova.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.petukhova.domain.model.DomainCurrency
import com.petukhova.presentation.databinding.RecyclerviewItemBinding


class AdapterCurrency : ListAdapter<DomainCurrency, AdapterCurrency.CurrencyViewHolder>(
    ModelCurrencyDiffer
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder =
        CurrencyViewHolder(
            RecyclerviewItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    //перерисовать часть данных на UI
    override fun onBindViewHolder(
        holder: CurrencyViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        super.onBindViewHolder(holder, position, payloads)
        holder.partialBind(getItem(position))
    }
    //перерисовать полностью данных
    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class CurrencyViewHolder(private val binding: RecyclerviewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(currency: DomainCurrency) {
            with(binding) {
                ticker.text = currency.codeCurrency
                nameCurrency.text = currency.nameCurrency
                value.text = currency.valueCurrency.toString()
            }
        }

        fun partialBind(currency: DomainCurrency) {
            binding.value.text = currency.valueCurrency.toString()
        }
    }


}
