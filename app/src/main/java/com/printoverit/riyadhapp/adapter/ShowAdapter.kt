package com.printoverit.riyadhapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.printoverit.riyadhapp.dataclasses.Show
import com.printoverit.riyadhapp.R
import kotlinx.android.synthetic.main.single_show_item.view.*

class ShowAdapter(private val mList : List<Show>?):RecyclerView.Adapter<ShowAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.single_show_item,parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val ItemsViewModel = mList?.get(position)
        holder.name.text = ItemsViewModel?.name
        holder.location.text = ItemsViewModel?.location
        holder.date.text = ItemsViewModel?.date
        holder.price.text = ItemsViewModel?.price
        holder.category.text = ItemsViewModel?.category.toString()
        holder.image.load(ItemsViewModel?.url){
            crossfade(600)
        }
    }

    override fun getItemCount(): Int {
        return  mList!!.size
    }
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val name:TextView=itemView.show_name_text
        val price:TextView=itemView.show_price_text
        val location:TextView=itemView.show_location_text
        val date:TextView=itemView.show_date_text
        val image:ImageView=itemView.show_image
        val category:TextView=itemView.show_category_text
    }
}