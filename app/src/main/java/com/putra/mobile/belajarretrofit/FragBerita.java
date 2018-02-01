package com.putra.mobile.belajarretrofit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.putra.mobile.belajarretrofit.helper.MyRetrofitClient;
import com.putra.mobile.belajarretrofit.helper.RestApi;
import com.putra.mobile.belajarretrofit.helper.SessionManager;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by rizkisyaputra on 13/12/17.
 */

public class FragBerita extends Fragment {

    private RecyclerView recyclerView;
    Unbinder unbinder;
    RecyclerView.LayoutManager layoutManager;
    public  static List<DataBerita> dataTutorList;


    MyRetrofitClient retrofitClient;
    public FragBerita() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_list_berita, container, false);
        recyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_view_rescue_request);


        unbinder = ButterKnife.bind(this, rootView);
//
        getListData();

        return rootView;
    }

    private void    getListData() {
        try {
            RestApi api = MyRetrofitClient.getInstanceRetrofit();
            SessionManager sesi  = new SessionManager(getActivity());
            String nUser = sesi.getIdUser();
            Log.i("RSMUser : ", nUser);

            Call<RssBerita> call = api.getBerita();
            call.enqueue(new Callback<RssBerita>() {
                @Override
                public void onResponse(Call<RssBerita> call, Response<RssBerita> response) {
                    Log.d("onResponse", response.body().toString());

                    dataTutorList = response.body().getData();
                    layoutManager = new LinearLayoutManager(getActivity());
                    BeritaAdapter recyclerViewAdapter =
                            new BeritaAdapter(dataTutorList, getActivity());

                    recyclerView.setLayoutManager(layoutManager);

                    recyclerView.setAdapter(recyclerViewAdapter);
                }

                @Override
                public void onFailure(Call<RssBerita> call, Throwable t) {

                }
            });

//
        }catch (Exception e) {}
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();

    }





}

