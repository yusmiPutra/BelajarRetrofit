package com.putra.mobile.belajarretrofit.helper;


import com.putra.mobile.belajarretrofit.RssBerita;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Blackswan on 9/12/2017.
 */

public interface RestApi {

//    @GET("getTutorHafalan")
//    Call<RssJ18TutorHafalan> getTutorHafalan();
//
//    @GET("getTeknikHafalan")
//    Call<RssJ18TeknikHafalan> getTeknikHafalan();
//
//    @FormUrlEncoded
//    @POST("insertMhq")
//    Call<ResponseModel> insert(
//            @Field("id_ustadz") String id_ustadz,
//            @Field("dari_waktu") String dari_waktu,
//            @Field("sampai_waktu") String sampai_waktu,
//            @Field("catatan") String catatan
//
//    );
    @GET("getBerita")
    Call<RssBerita> getBerita();

    @FormUrlEncoded
    @POST("insertBerita")
    Call<RssBerita> input(
            @Field("id_berita") String id_berita,
            @Field("judul") String judul,
            @Field("isi_berita") String isi_berita,
            @Field("id_cat") String id_cat
    );
//
//    @FormUrlEncoded
//    @POST("update-contact")
//    Call<ModelUpdateKontak> updatekontaks(
//            @Field("telp") String strtelp,
//            @Field("nama") String strnama,
//            @Field("kontak_id") String idkontak
//
//    );
//
//    @FormUrlEncoded
//    @POST("delete-contact")
//    Call<ModelDeleteKontak> deletekontaks(
//            @Field("kontak_id") String idkontak
//
//    );
//
//    @FormUrlEncoded
//    @POST("show-contact")
//    Call<ModelKontak> getdatakontak(
//            @Field("user_id") String struserid);
//
//
//    @GET("get-prov")
//    Call<ModelProvinsi> getProvinsi();
//
//    @GET("get-kota")
//    Call<ModelKota> getKota(@Query("prov_id") String provid);
//
//    @FormUrlEncoded
//    @POST("register_volentir")
//    Call<ModelRegisterUser> registerUser(
//            @Field("email") String stremail,
//            @Field("password") String strpassword,
//            @Field("level") String strlevel,
//            @Field("nama") String strnama,
//            @Field("no_ktp") String strnoktp,
//            @Field("alamat") String stralamat,
//            @Field("jk") String strjk,
//            @Field("tgl_lahir") String strtgllahir,
//            @Field("no_hp") String strnohp,
//            @Field("agama") String stragama,
//            @Field("foto") String strfoto,
//            @Field("kota_id") String strkotaid,
//            @Field("prov_id") String strprovid
//    );
//
//    @FormUrlEncoded
//    @POST("register_polisi")
//    Call<ModelRegisterUser> registerPolisi(
//            @Field("email") String stremail,
//            @Field("password") String strpassword,
//            @Field("level") String strlevel,
//            @Field("nama") String strnama,
//            @Field("no_ktp") String strnoktp,
//            @Field("alamat") String stralamat,
//            @Field("jk") String strjk,
//            @Field("tgl_lahir") String strtgllahir,
//            @Field("no_hp") String strnohp,
//            @Field("agama") String stragama,
//            @Field("foto") String strfoto,
//            @Field("kota_id") String strkotaid,
//            @Field("prov_id") String strprovid
//    );
//
//    @FormUrlEncoded
//    @POST("login_polisi")
//    Call<J9RsPolisiLogin> loginuser(
//            @Field("email") String stremail,
//            @Field("password") String strpassword,
//            @Field("uuid") String uuid,
////            @Field("fcm_token") String fcm_token,
//            @Field("latitude") Double latitude,
//            @Field("longitude") Double longitude);
//
//    @FormUrlEncoded
//    @POST("find-rescue")
//    Call<ModelCariPertolongan> caripertolongan(
//            @Field("user_id") String struserid,
//            @Field("lat") String strlat,
//            @Field("lon") String strlon,
//            @Field("catatan") String strcatatan);
//
//    @FormUrlEncoded
//    @POST("check-rescue")
//    Call<ModelCekStatus> cekstatus(
//            @Field("rescue_id") String strrescueid
//    );
//
//    @FormUrlEncoded
//    @POST("rescue-request")
//    Call<RssJ9RequestRescue> rescue_request(
//
//            @Field("volentir_id") String volentir_id,
//            @Field("status") String status
//    );
//
//    @FormUrlEncoded
//    @POST("rescue-request")
//    Call<RssJ9RequestRescue> rescueProgress(
//
//
//            @Field("volentir_id") String volentir_id,
//            @Field("status") String status
//    );
//
//    @FormUrlEncoded
//    @POST("complete-rescue")
//    Call<RssJ9RescueComplete> takeRescueToComplete(
//
//
//            @Field("rescue_id") int rescue_id,
//            @Field("volentir_id") String volentir_id
//    );
//    @FormUrlEncoded
//    @POST("rescue-request")
//    Call<RsCompleteRescue> rescueComplete(
//
//
//            @Field("volentir_id") String volentir_id,
//            @Field("status") String status
//    );
//
//    @FormUrlEncoded
//    @POST("cancel-rescue")
//    Call<ResponseDaftar> cancelcaripertolongan(
//            @Field("user_id") String user_id,
//            @Field("rescue_id") String rescue_id);
//
//    @FormUrlEncoded
//    @POST("take-rescue")
//    Call<RssJ9TakeRescue> take_rescue(
//            @Field("rescue_id") String rescue_id,
//            @Field("volentir_id") String volentir_id,
//            @Field("latitude_vlt") Double latitude_vlt,
//            @Field("longitude_vlt") Double longitude_vlt,
//            @Field("alamat_vlt") String alamat_vlt
//    );
//
//
//    @FormUrlEncoded
//    @POST("insert_booking")
//    Call<ResponseInsertBooking> request_insertbooking(
//            @Field("f_token") String token,
//            @Field("f_device") String device,
//            @Field("f_idUser") String iduser,
//            @Field("f_latAwal") String latwal,
//            @Field("f_lngAwal") String lattujuan,
//            @Field("f_awal") String awal,
//            @Field("f_latAkhir") String latakhir,
//            @Field("f_lngAkhir") String lonakhir,
//            @Field("f_akhir") String akhir,
//            @Field("f_jarak") String jarak,
//            @Field("f_tarif") String tarif
//
//
//    );
//
//    @FormUrlEncoded
//    @POST("check_booking")
//    Call<ResponseHistory> request_check(
//            @Field("id_booking") String idbooking,
//            @Field("f_token") String token,
//            @Field("f_device") String device
//
//
//    );
//
//
//    @FormUrlEncoded
//    @POST("cancel_booking")
//    Call<ResponseDaftar> request_cancel(
//            @Field("id_booking") String idbooking,
//            @Field("f_token") String token,
//            @Field("f_device") String device
//    );
//
//    @FormUrlEncoded
//    @POST("post-pertanyaan")
//    Call<ModelPertanyaan> request_pertanyaan(
//            @Field("user_id") String userid,
//            @Field("pertanyaan") String pertanyaan,
//            @Field("judul") String judul,
//            @Field("volentir_id") String volunteerid
//    );
//
//    @FormUrlEncoded
//    @POST("show-all-pertanyaan")
//    android.telecom.Call show_all_pertanyaan(
//            @Field("volentir_id") String userid
////            @Field("pertanyaan") String pertanyaan,
////            @Field("judul") String judul,
////            @Field("volentir_id") String volunteerid
//    );
//
//    @FormUrlEncoded
//    @POST("show-all-pertanyaan")
//    Call<List<NewDataPertanyaan>> show_all_konsultasi(
//            @Field("volentir_id") String volentir_id
////            @Field("pertanyaan") String pertanyaan,
////            @Field("judul") String judul,
////            @Field("volentir_id") String volunteerid
//    );
//
//
//    @FormUrlEncoded
//    @POST("get-volentir")
//    Call<ModelVolunteer> getdatavolunteer(
//            @Field("jenis_profesi") String idjenisprofesi
//    );
//
//    //tambhan request get posisi driver
//    @FormUrlEncoded
//    @POST("get_driver")
//    Call<ResponseTracking> request_tracking(
//            @Field("id") String iduser
//
//    );
//
//    @GET("json")
//    Call<ResponseRoute> request_route(
//            @Query("origin") String orgin,
//            @Query("destination") String desti
//
//
//    );
//
//    @FormUrlEncoded
//    @POST("get_booking")
//    Call<ResponseHistory> request_history(
//            @Field("f_idUser") String iduser,
//            @Field("status") String status
//    );
//
//    @FormUrlEncoded
//    @POST("tampil-rumah")
//    Call<RssJ9TampilRumah> pendingRumahAman(
//
//            @Field("status") String status
//    );
//
//    @FormUrlEncoded
//    @POST("tampil-rumah")
//    Call<RssJ9TampilRumah> tampilAccRumahAman(
//
//            @Field("status") String status,
//            @Field("polisi_id") String polisi_id
//    );
//
//    @FormUrlEncoded
//    @POST("acc-rumah")
//    Call<RSPendingRumahAman> TakeaccRumahAman(
//
//            @Field("rumah_id") String rumah_id,
//            @Field("polisi_id") String polisi_id
//    );
//
//
//    @FormUrlEncoded
//    @POST("get-user-profile")
//    Call<RSProfUserByID> profilByUser(
//
//            @Field("user_id") String user_id
//
//    );
//
//
//    @FormUrlEncoded
//    @POST("tampil-rumah-volentir")
//    Call<RSHistoryRumahAman> historyRumahAman(
//
//            @Field("status") String status,
//            @Field("volentir_id") String volentir_id
//
//    );
//
//    @FormUrlEncoded
//    @POST("report-resuce")
//    Call<RSReportRescue> reportRescue(
//
//            @Field("volentir_id") String volentir_id,
//            @Field("rescue_id") int rescue_id,
//            @Field("status") String status,
//            @Field("catatan") String catatan
////            @Field("volentir_id") String volentir_id
//
//    );
//
//    @FormUrlEncoded
//    @POST("check-report-pertolongan")
//    Call<RssJ9ReportPertolongan> check_report_pertolongan(
//
//            @Field("pertolongan_id") String pertolongan_id
//
//
//    );
//
//    @FormUrlEncoded
//    @POST("volentir/history-rumahaman")
//    Call<RssJ9HistoryRumahAman> volentir_history_rumahaman(
//
//            @Field("volentir_id") String volentir_id,
//            @Field("status") String status
//
//
//    );
//
//    @FormUrlEncoded
//    @POST("take-home")
//    Call<RssJ9TakeRescue> take_home(
//            @Field("find_rumah_id") String find_rumah_id,
//            @Field("volentir_id") String volentir_id,
//            @Field("latitude_vlt") Double latitude_vlt,
//            @Field("longitude_vlt") Double longitude_vlt,
//            @Field("alamat_vlt") String alamat_vlt
//    );
//
//    @FormUrlEncoded
//    @POST("complete-home")
//    Call<RssJ9CompleteRumahAman> complete_home(
//
//
//            @Field("find_rumah_id") int find_rumah_id,
//            @Field("volentir_id") String volentir_id
//    );



}
