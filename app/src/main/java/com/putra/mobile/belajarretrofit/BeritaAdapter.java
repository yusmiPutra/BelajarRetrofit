package com.putra.mobile.belajarretrofit;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.putra.mobile.belajarretrofit.helper.MyConstant;

import java.util.List;


//ini class untuk memindahkan data ke recylerview dan juga custom recylerview
public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.MyHolder> {

    List<DataBerita> data;
    FragmentActivity c;

    public BeritaAdapter(List<DataBerita> data, FragmentActivity c) {
        this.data = data;
        this.c = c;
    }



    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflater = LayoutInflater.from(c).inflate(R.layout.item_berita, parent, false);

        return new MyHolder(inflater);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        holder.txJudul.setText(data.get(position).getIdJudul());
        holder.tvTanggal.setText(data.get(position).getIdIsiBerita());
        holder.tvAlamat.setText(data.get(position).getIdIsiBerita());

        Glide.with(c)
                .load(MyConstant.IMAGE_URL + data.get(position).getIdGambar())
                .placeholder(R.drawable.no_image)
                .error(R.drawable.no_image)
                .into(holder.imgGambar);
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                //ini saat cardview di klik dia pindah halaman
                Intent intent = new Intent(c,DetailBerita.class);
                //pindahkan posisi array ke detailrequest
                intent.putExtra("posisi",position);

                c.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {


        TextView txJudul, tvTanggal, tvAlamat;
        CardView card ;
        ImageView imgGambar;
        RecyclerView fab;

        public MyHolder(View itemView) {
            super(itemView);

            txJudul = (TextView) itemView.findViewById(R.id.tvItemJudul);
            tvTanggal = (TextView) itemView.findViewById(R.id.tvItemTanggal);
            tvAlamat = (TextView) itemView.findViewById(R.id.tvItemVolunter);
            imgGambar = (ImageView) itemView.findViewById(R.id.ivItemPict);

            card = itemView.findViewById(R.id.viewCard);

        }
    }
}
