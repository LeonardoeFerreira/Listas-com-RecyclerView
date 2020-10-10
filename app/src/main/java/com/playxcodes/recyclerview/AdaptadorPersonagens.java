package com.playxcodes.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPersonagens extends RecyclerView.Adapter<AdaptadorPersonagens.ViewHolderPersonagens>{

    ArrayList<Personagens> listaPersonagens;

    //Gerando construtor que recebe essa lista
    public AdaptadorPersonagens(ArrayList<Personagens> listaPersonagens) {
        this.listaPersonagens = listaPersonagens;
    }

    public ViewHolderPersonagens onCreateViewHolder(ViewGroup parent, int viewType){

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_personagens, null,false);
        return new ViewHolderPersonagens(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersonagens holder, int position) {
        //configurando o texto que vai ser mostrado

        holder.editNome.setText(listaPersonagens.get(position).getNome());
        holder.editInfo.setText(listaPersonagens.get(position).getInfo());
        holder.foto.setImageResource(listaPersonagens.get(position).getFoto());

    }




    @Override
    public int getItemCount() {
        return listaPersonagens.size(); // o tamanho e p da lista
    }


    public class ViewHolderPersonagens extends RecyclerView.ViewHolder {

        //fazer referencia aos componentes basicos

        TextView editNome, editInfo;
        ImageView foto;

        public ViewHolderPersonagens(@NonNull View itemView) {
            super(itemView);

            editNome = (TextView) itemView.findViewById(R.id.idNome);
            editInfo= (TextView) itemView.findViewById(R.id.idInfo);
            foto = itemView.findViewById(R.id.imageView);
        }
    }
}
