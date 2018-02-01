package com.putra.mobile.belajarretrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.putra.mobile.belajarretrofit.helper.MyRetrofitClient;
import com.putra.mobile.belajarretrofit.helper.RestApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InputDataMHQ extends AppCompatActivity {
    EditText idBerita, judul, isi, idCat;
    Button btnsave;
    ProgressBar pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data_mhq);

//        pd= (ProgressBar)findViewById(R.id.pd);
//        pd.setIndeterminate(true);
//        pd.setVisibility(View.GONE);

        idBerita = (EditText) findViewById(R.id.id_berita);
        judul = (EditText) findViewById(R.id.id_judul);
        isi = (EditText) findViewById(R.id.id_isi_berita);
        idCat = (EditText) findViewById(R.id.id_cat);
        btnsave = (Button) findViewById(R.id.btn_insertdata);

        //kondisi perubahan btn save > btn delete dan btn update
        Intent data = getIntent();
        final String iddata = data.getStringExtra("id_berita");
        if (iddata == null) {
            //btnsave.setVisibility(View.GONE);
            idBerita.setText(data.getStringExtra("id_berita"));
            judul.setText(data.getStringExtra("judul"));
            idCat.setText(data.getStringExtra("id_cat"));
            isi.setText(data.getStringExtra("isi_berita"));
        }
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sidB = idBerita.getText().toString();
                String sidJ = judul.getText().toString();
                String sidI = isi.getText().toString();
                String sidC = idCat.getText().toString();
                if (sidB.isEmpty() ) {
                    idBerita.setError("id perlu diisi");
                }else if (sidJ.isEmpty()){
                    judul.setError("dari waktu perlu di isi");}
                else if (sidC.isEmpty()){
                    idCat.setError("sampai waktu perlu di isi");
                } else if (sidI.isEmpty()) {
                    isi.setError("catatan waktu perlu di isi");
                } else {
                    RestApi api = MyRetrofitClient.getRetrofit().create(RestApi.class);
                    Call<RssBerita> sendmhq = api.input(sidB, sidJ, sidC, sidI);
                    sendmhq.enqueue(new Callback<RssBerita>() {
                        @Override
                        public void onResponse(Call<RssBerita> call, Response<RssBerita> response) {
                            Log.d("RETRO", "response : " + response.body().toString());
                            String result = response.body().getResult();
                            if (result.equals("true")){
                                Toast.makeText(InputDataMHQ.this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show();
                                idBerita.getText().clear();
                                judul.getText().clear();
                                isi.getText().clear();
                                idCat.getText().clear();

                            } else {
                                Toast.makeText(InputDataMHQ.this, "Data Error tidak berhasil disimpan", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<RssBerita> call, Throwable t) {
                            Log.d("RETRO", "Falure : " + "Gagal Mengirim Request");
                        }
                    });

                }
            }
        });
    }
}
