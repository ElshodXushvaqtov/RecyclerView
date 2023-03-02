package uz.itschool.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import uz.itschool.myapplication.Item
import uz.itschool.myapplication.R
import uz.itschool.myapplication.databinding.ItemLayoutBinding



class Item_adapter(var sports_list : ArrayList<Item>) : RecyclerView.Adapter<Item_adapter.MyHolder>() {
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var sport_name = itemView.findViewById<TextView>(R.id.sport_name)
        var img = itemView.findViewById<ImageView>(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val index= sports_list[position]
holder.sport_name.text= index.sport_name
        holder.img.load(index.img)
    }

    override fun getItemCount(): Int {
        return sports_list.size
    }

}