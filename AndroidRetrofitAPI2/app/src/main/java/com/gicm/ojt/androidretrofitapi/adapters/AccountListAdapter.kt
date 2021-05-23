package com.gicm.ojt.androidretrofitapi.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gicm.ojt.androidretrofitapi.R
import com.gicm.ojt.androidretrofitapi.models.AccountModel
import kotlinx.android.synthetic.main.item_account.view.*

class AccountListAdapter(private val context: Context, private val list: ArrayList<AccountModel>)
    :RecyclerView.Adapter<AccountListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_account,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = list[position]
        holder.itemView.tv_id.text = model.id.toString()
        holder.itemView.tv_name.text = model.name
        holder.itemView.tv_role.text = model.role
    }
}