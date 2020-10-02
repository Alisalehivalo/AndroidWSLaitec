package ir.laitec.androidwslaitec;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    ArrayList<String> mylist;
    public RecyclerAdapter(ArrayList list){
        mylist=list;
    }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        RecyclerViewHolder holder=new RecyclerViewHolder(v);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.txtName.setText(mylist.get(position));
        if (holder.txtName.getText() =="Ali"){
            holder.txtName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i =new Intent(view.getContext(),LoginActivity.class);
                    view.getContext().startActivity(i);
                    Toast.makeText(view.getContext(),"Ali ...",Toast.LENGTH_LONG).show();
                }
            });
        }
    }
    @Override
    public int getItemCount() {
        return mylist.size();
    }
    class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView txtName;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);
        }
    }
}
