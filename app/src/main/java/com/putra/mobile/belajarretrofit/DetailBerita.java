package com.putra.mobile.belajarretrofit;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.putra.mobile.belajarretrofit.helper.MyConstant;

/**
 * Created by Nando on 27/01/18.
 */

class DetailBerita extends AppCompatActivity {
    TextView txtJudul, txtProgram, txtIsi;
    ImageView imgGambar;

    Context c = this;
    DataBerita data;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_berita);

        txtIsi = (TextView)findViewById(R.id.txtDeks);
        txtProgram = (TextView)findViewById(R.id.txtNamaProgram);
        txtJudul = (TextView)findViewById(R.id.txt_judul);
        imgGambar = (ImageView)findViewById(R.id.imgInfo);

        int posisi = getIntent().getIntExtra("posisi", 0);
        //get variable array dari request fragment
        data =  FragBerita.dataTutorList.get(posisi);

        txtJudul.setText(data.getIdJudul());
        txtIsi.setText(data.getIdIsiBerita());
        txtProgram.setText("Isi Berita Yang di Baca");
        Glide.with(c)
                .load(MyConstant.IMAGE_URL + data.getIdGambar())
                .placeholder(R.drawable.no_image)
                .error(R.drawable.no_image)
                .into(imgGambar);



    }
}
