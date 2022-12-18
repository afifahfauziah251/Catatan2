package com.fila.catatan
//Untukmenghubungkan antara catatan_item.xml dan SaveFragment.kt
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

class CatatanAdapter (private val context: Context,
                      private val items: ArrayList<ListCatatan>):
RecyclerView.Adapter<CatatanAdapter.ViewHolder>() {

    class ViewHolder(override val containerView:View):
            RecyclerView.ViewHolder(containerView), LayoutContainer{
             fun bindItem(item: ListCatatan) {

             }
            }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindItem(items.get(position))
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ViewHolder (
       LayoutInflater.from(context).inflate(
           R.layout.catatan_item, parent, false
       ))
}