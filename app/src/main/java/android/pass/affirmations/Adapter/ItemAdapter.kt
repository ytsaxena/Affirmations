package android.pass.affirmations.Adapter

import android.content.Context
import android.pass.affirmations.R
import android.pass.affirmations.model.Affirmation
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(
    private val context: Context,
    private val dataSet: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.recycler_list_item, parent, false)
        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textv.text = context.resources.getString(item.stringResourceId)
        holder.img.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataSet.size

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textv: TextView = view.findViewById(R.id.recyclerview_item_title)
        val img : ImageView = view.findViewById(R.id.recyclerview_item_img)
    }


}