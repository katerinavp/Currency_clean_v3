package com.petukhova.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.petukhova.domain.model.DomainCurrency

object ModelCurrencyDiffer : DiffUtil.ItemCallback<DomainCurrency>() {

    override fun areItemsTheSame(oldItem: DomainCurrency, newItem: DomainCurrency): Boolean =
        oldItem.codeCurrency == newItem.codeCurrency ||   oldItem.nameCurrency == newItem.nameCurrency

    override fun areContentsTheSame(oldItem: DomainCurrency, newItem: DomainCurrency): Boolean =
        oldItem.valueCurrency == newItem.valueCurrency
}
