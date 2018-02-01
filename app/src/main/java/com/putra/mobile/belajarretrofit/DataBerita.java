package com.putra.mobile.belajarretrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Nando on 27/01/18.
 */

class DataBerita {
    @SerializedName("id_berita")
    private String idBerita;

    @SerializedName("judul")
    private String idJudul;

    @SerializedName("isi_berita")
    private String idIsiBerita;

    @SerializedName("gambar")
    private String idGambar;

    public String getIdBerita() {
        return idBerita;
    }

    public void setIdBerita(String idBerita) {
        this.idBerita = idBerita;
    }

    public String getIdJudul() {
        return idJudul;
    }

    public void setIdJudul(String idJudul) {
        this.idJudul = idJudul;
    }

    public String getIdIsiBerita() {
        return idIsiBerita;
    }

    public void setIdIsiBerita(String idIsiBerita) {
        this.idIsiBerita = idIsiBerita;
    }

    public String getIdGambar() {
        return idGambar;
    }

    public void setIdGambar(String idGambar) {
        this.idGambar = idGambar;
    }

    @Override
    public String toString(){
        return
                "DataBerita{" +
                        "id_berita = '" + idBerita + '\'' +
                        ",judul = '" + idJudul + '\'' +
                        ",isi_berita = '" + idIsiBerita + '\'' +
                        ",gambar = '" + idGambar + '\'' +
                        "}";
    }
}
