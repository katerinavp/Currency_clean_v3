package com.petukhova.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.petukhova.domain.model.DomainCurrencyNetwork

object ModelCurrencyDiffer : DiffUtil.ItemCallback<DomainCurrencyNetwork>() {

    override fun areItemsTheSame(oldItem: DomainCurrencyNetwork, newItem: DomainCurrencyNetwork): Boolean =
        oldItem.value == newItem.value

    override fun areContentsTheSame(oldItem: DomainCurrencyNetwork, newItem: DomainCurrencyNetwork): Boolean =
        oldItem == newItem
}
