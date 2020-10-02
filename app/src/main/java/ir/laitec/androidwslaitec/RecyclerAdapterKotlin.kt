package ir.laitec.androidwslaitec

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterKotlin(val myList: ArrayList<String>) :
    RecyclerView.Adapter<RecyclerAdapterKotlin.RecyclerViewHolder>() {
    class RecyclerViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val txtName:TextView=itemView.findViewById(R.id.txtName)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val v:View=
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        val holder:RecyclerViewHolder= RecyclerViewHolder(v)
        return holder
    }
    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.txtName.setText(myList[position])
    }
    override fun getItemCount(): Int {
        return myList.size
    }
}