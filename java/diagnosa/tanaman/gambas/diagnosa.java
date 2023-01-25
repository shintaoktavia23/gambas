package diagnosa.tanaman.gambas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class diagnosa extends AppCompatActivity {
    CheckBox checkhamabintikhitam, checkakarmudalayu, checkdauntersisatulang, checkdaunberlubang,
            checkalurputih, checkdaunbintikputih, checkhamakuningkeemasan, checkhamaulat,
            checkbuahberlubang, checkbatangmudaberlubang,checkbatangterpotong, checkhamaulathitamputih,
            checkhamacangkangcoklat, checkakarmudaterpotong, checkbanyakkotoran, checkdaunlubangkecil,
            checkbadanterpotong, checkhamabersayapcoklat,checkhamalalatkuning, checkbuahbintikhitam,
            checkbuahbusuk, checkbuahtersisaluar, checkdaunkuning, checkjaringancoklat, checkdaunhijaupucat,
            checkdaunlayumengering, checkdaunbercakcoklattepung, checkbatangbercakcoklattepung,
            checkbuahbercakcoklattepung, checkbungabercakcoklattepung, checkbuahhitam, checkbuahkeringkeriput,
            checkbatangcoklat,checkdaunmudabintikcoklat;

    Button btnDiagnosa;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        checkhamabintikhitam = findViewById(R.id.hama_bintik_hitam);
        checkakarmudalayu= findViewById(R.id.akar_muda_layumati);
        checkdauntersisatulang = findViewById(R.id.daun_tulang);
        checkdaunberlubang = findViewById(R.id.daun_berlubang);
        checkalurputih = findViewById(R.id.alur_putih);
        checkdaunbintikputih = findViewById(R.id.daun_bintik_putih);
        checkhamakuningkeemasan = findViewById(R.id.hama_kuning_keemasan);
        checkhamaulat= findViewById(R.id.hama_ulat);
        checkbuahberlubang = findViewById(R.id.buah_berlubang);
        checkbatangmudaberlubang = findViewById(R.id.batang_muda_terpotong);
        checkbatangterpotong = findViewById(R.id.batang_tua_terpotong);
        checkhamaulathitamputih = findViewById(R.id.hama_ulat_hitam_putih);
        checkhamacangkangcoklat = findViewById(R.id.hama_cangkang_coklat);
        checkakarmudaterpotong= findViewById(R.id.akar_muda_terpotong);
        checkbanyakkotoran= findViewById(R.id.banyak_kotoran);
        checkdaunlubangkecil = findViewById(R.id.daun_lubang_kecil);
        checkbadanterpotong = findViewById(R.id.batang_terpotong);
        checkhamabersayapcoklat = findViewById(R.id.hama_sayap_coklat);
        checkhamalalatkuning = findViewById(R.id.hama_lalat_kuning);
        checkbuahbintikhitam = findViewById(R.id.buah_bintik_hitam);
        checkbuahbusuk  = findViewById(R.id.buah_busuk);
        checkbuahtersisaluar  = findViewById(R.id.buah_tersisa_luar);
        checkdaunkuning = findViewById(R.id.daun_menguning);
        checkjaringancoklat = findViewById(R.id.jaring_coklat);
        checkdaunhijaupucat = findViewById(R.id.daun_hijau_pucat);
        checkdaunlayumengering = findViewById(R.id.daun_mengering);
        checkdaunbercakcoklattepung = findViewById(R.id.daun_bercak_coklat);
        checkbatangbercakcoklattepung = findViewById(R.id.batang_bercak_coklat);
        checkbuahbercakcoklattepung = findViewById(R.id.buah_bercak_coklat);
        checkbungabercakcoklattepung = findViewById(R.id.bunga_bercak_coklat);
        checkbuahhitam = findViewById(R.id.buah_coklat_kehitaman);
        checkbuahkeringkeriput = findViewById(R.id.buah_kering_keriput);
        checkbatangcoklat = findViewById(R.id.batang_coklat);
        checkdaunmudabintikcoklat = findViewById(R.id.daun_muda_bintik);

        btnDiagnosa = findViewById(R.id.btn_diagnosa);
        tvResult = findViewById(R.id.tv_result);

        tvResult.setText(""); // Kosongkan TextView saat pertama kali aplikasi dijalankan

        btnDiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NamaHama = "Hama Yang Terjadi\n";
                String NamaPenyakit = "Tanaman Menderita Penyakit\n";

                if (checkhamabintikhitam.isChecked() && checkdauntersisatulang.isChecked()
                        &&checkakarmudalayu.isChecked() && checkdaunberlubang.isChecked())
                {
                    NamaHama += "Oteng-oteng"+"\n"+"SOLUSI : Menaburkan nematisida pada pangkal batang muda, "
                            +"\n"+"Memungut oteng-oteng dan Penyemprotan dengan insektisida";
                }
                if (checkalurputih.isChecked() && checkdaunbintikputih.isChecked()
                        && checkhamakuningkeemasan.isChecked()) {
                    NamaHama += "Pengorok Daun"+"\n"+"SOLUSI : Pengendalian secara kimiawi yaitu dengan " +
                            "penyemprotan insektisida berbahan aktif abamectin, bifenthrin, methoxyfenozide, " +
                            "secara bergantian.";
                }
                if (checkdauntersisatulang.isChecked() && checkdaunberlubang.isChecked() && checkhamaulat.isChecked()
                        && checkbuahberlubang.isChecked()){
                    NamaHama += "Ulat Grayak"+"\n"+"SOLUSI : Menggunakan insektisida botani dengan dosis yang tepat";
                }
                if (checkbatangmudaberlubang.isChecked() && checkbatangterpotong.isChecked() &&  checkhamaulathitamputih.isChecked()) {
                    NamaHama += "Ulat Tanah " + "\n" + "SOLUSI : Menggunakan insektisida berbahan aktif profenofos, " +
                            "klorpirifos, sipermetrin dengan dosis yang tepat";
                }

                if (checkhamacangkangcoklat.isChecked() && checkakarmudaterpotong.isChecked()
                        &&  checkbanyakkotoran.isChecked()) {
                    NamaHama += "Bekicot"+"\n"+"SOLUSI : Semprot dengan larutan bawang putih dan Menggambil bekicot dan buang";
                }
                if (checkakarmudaterpotong.isChecked() && checkbatangterpotong.isChecked() &&  checkhamabersayapcoklat.isChecked()){
                    NamaHama += "Jangkrik "+"\n"+"SOLUSI : Menggunakan insektisida berbahan aktif profenofos, " +
                            "klorpirifos, sipermetrin dengan dosis yang tepat";
                }
                if (checkhamalalatkuning.isChecked() && checkbuahbintikhitam.isChecked() && checkbuahbusuk.isChecked()
                        && checkbuahtersisaluar.isChecked()){
                    NamaHama += "Lalat Buah"+"\n"+"SOLUSI : penyemprotkan insektisida dengan berbahan aktif " +
                            "Propenofos atau Asefat dengan dosis yang tepat";
                }
                if (checkdaunkuning.isChecked() && checkjaringancoklat.isChecked() && checkdaunhijaupucat.isChecked()) {
                    NamaPenyakit += "Layu"+"\n"+"SOLUSI : mencabut tanaman yang layu " +
                            "dan Mengurangi penggunaan pupuk berkadar N tinggi lebih baik gunakan pupuk NPK";
                }
                if (checkdaunkuning.isChecked() && checkdaunlayumengering.isChecked() && checkdaunbercakcoklattepung.isChecked()) {
                    NamaPenyakit += "Embun Bulu"+"\n"+"SOLUSI : memilih bibit yang unggul, " +
                            "gunakan fungisida dan dosisnya secara tepat dan hindari penyiraman pada siang hari.";
                }
                if (checkbatangbercakcoklattepung.isChecked() && checkbuahbercakcoklattepung.isChecked()
                        && checkbungabercakcoklattepung.isChecked() && checkbuahhitam.isChecked() ) {
                    NamaPenyakit += "Embun Tepung"+"\n"+"SOLUSI : Menyemprotkan Fungisida Translaminar dengan dosis yang depat";
                }
                if (checkbuahbusuk.isChecked() && checkbuahkeringkeriput.isChecked()
                        && checkbatangcoklat.isChecked() && checkdaunmudabintikcoklat.isChecked()) {
                    NamaPenyakit += "Antraknosa"+"\n"+"SOLUSI : Gunakan bibit yang tepat dan pilih " +
                            "mulsa plastik berwarna hitam perak. ";
                }
                // tampilkan penyakit dan hama
                tvResult.setText("" +NamaPenyakit);
                tvResult.setText("" +NamaHama);
            }
        });
    }

    public void onClickChecked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        switch (view.getId()) {
            case R.id.hama_bintik_hitam:
                str = checked ? "Gejala  hama bintik hitam Pada Tanaman Gambas Diseleksi" :
                        "Gejala bintik hitam Pada Tanaman Gambas Tidak Diseleksi";
                break;
            case R.id.akar_muda_layumati:
                str = checked ? "Gejala akar muda layu mati Diseleksi" :
                        "Gejala akar muda layu mati Tidak Diseleksi";
                break;
            case R.id.daun_tulang:
                str = checked ? "Gejala Daun Tinggal Tulang  Diseleksi" :
                        "Gejala Daun Daun tinggal tulang Tidak Diseleksi";
                break;
            case R.id.daun_berlubang:
                str = checked ? "Gejala daun berlubang  Diseleksi" :
                        "Gejala daun berlubang Tidak Diseleksi";
                break;
            case R.id.alur_putih:
                str = checked ? "Gejala Daun Beralur Putih Diseleksi" :
                        "Gejala Daun Beralur Putih Tidak Diseleksi";
                break;
            case R.id.daun_bintik_putih:
                str = checked ? "Gejala daun berlubang Diseleksi" :
                        "Gejala daun berlubang Tidak Diseleksi";
                break;
            case R.id.hama_kuning_keemasan:
                str = checked ? "Gejala hama kuning keemasan Diseleksi" :
                        "Gejala hama kuning keemasan Tidak Diseleksi";
                break;
            case R.id.hama_ulat:
                str = checked ? "Gejala hama ulat Diseleksi" :
                        "Gejala hama ulat Tidak Diseleksi";
                break;
            case R.id.buah_berlubang:
                str = checked ? "Gejala Buah Berlubang Diseleksi" :
                        "Gejala Buah BerlubangTidak Diseleksi";
                break;

            case R.id.batang_muda_terpotong:
                str = checked ? "Gejala batang muda terpotong Diseleksi" :
                        "Gejala batang muda terpotong Tidak Diseleksi";
                break;
            case R.id.batang_tua_terpotong:
                str = checked ? "Gejala batang tua terpotong Diseleksi" :
                        "Gejala batang tua terpotong Tidak Diseleksi";
                break;
            case R.id.hama_ulat_hitam_putih:
                str = checked ? "Gejala hama ulat hitam dan putih Diseleksi" :
                        "Gejala hama ulat hitam dan putih Tidak Diseleksi";
                break;
            case R.id.hama_cangkang_coklat:
                str = checked ? "Gejala hama cangkang coklat Diseleksi" :
                        "Gejala hama cangkang coklat Tidak Diseleksi";
                break;
            case R.id.akar_muda_terpotong:
                str = checked ? "Gejala akar muda terpotong Diseleksi" :
                        "Gejala akar muda terpotong Tidak Diseleksi";
                break;
            case R.id.banyak_kotoran:
                str = checked ? "Gejala banyak kotoran Diseleksi" :
                        "Gejala banyak kotoran Tidak Diseleksi";
                break;
            case R.id.daun_lubang_kecil:
                str = checked ? "Gejala daun lubang kecil Diseleksi" :
                        "Gejala Gejala daun lubang kecil Tidak Diseleksi";
                break;
            case R.id.daun_bercak_coklat:
                str = checked ? "Gejala Daun Bercak Coklat Dan Kering Diseleksi" :
                        "Gejala Daun Bercak Coklat Dan Kering Tidak Diseleksi";
                break;
            case R.id.batang_terpotong:
                str = checked ? "Gejala Batang terpotong Diseleksi" :
                        "Gejala Batang terpotong Tidak Diseleksi";
                break;
            case R.id.hama_sayap_coklat:
                str = checked ? "Gejala hama sayap coklat Diseleksi" :
                        "Gejala hama sayap coklat Tidak Diseleksi";
                break;
            case R.id.hama_lalat_kuning:
                str = checked ? "Gejala hama lalat kuning Diseleksi" :
                        "Gejala hama lalat kuning Tidak Diseleksi";
                break;
            case R.id.buah_bintik_hitam:
                str = checked ? "Gejala Buah Bintik hitam Diseleksi" :
                        "Gejala Buah Bintik hitam Tidak Diseleksi";
                break;
            case R.id.buah_busuk:
                str = checked ? "Gejala Buah Busuk Diseleksi" :
                        "Gejala Buah Busuk Tidak Diseleksi";
                break;
            case R.id.buah_tersisa_luar:
                str = checked ? "Gejala Buah tersisa luar Diseleksi" :
                        "Gejala Buah tersisa luar Diseleksi";
                break;
            case R.id.jaring_coklat:
                str = checked ? "Gejala jaring coklat Diseleksi" :
                        "Gejala jaring coklat Tidak Diseleksi";
                break;
            case R.id.akar_coklat:
                str = checked ? "Gejala akar coklat Diseleksi" :
                        "Gejala akar coklat Tidak Diseleksi";
                break;
            case R.id.daun_hijau_pucat:
                str = checked ? "Gejala daun hijau pucat Diseleksi" :
                        "Gejala daun hijau pucat Tidak Diseleksi";
                break;
            case R.id.daun_mengering:
                str = checked ? "Gejala daun mengering Diseleksi" :
                        "Gejala daun mengering Tidak Diseleksi";
                break;
            case R.id.batang_bercak_coklat:
                str = checked ? "Gejala batang bercak coklat Diseleksi" :
                        "Gejala batang bercak coklat Tidak Diseleksi";
                break;
            case R.id.buah_bercak_coklat:
                str = checked ? "Gejala buah bercak coklat Diseleksi" :
                        "Gejala buah bercak coklat Tidak Diseleksi";
                break;
            case R.id.bunga_bercak_coklat:
                str = checked ? "Gejala bunga bercak coklat Diseleksi" :
                        "Gejala bunga bercak coklat Tidak Diseleksi";
                break;
            case R.id.buah_coklat_kehitaman:
                str = checked ? "Gejala buah coklat kehitaman Diseleksi" :
                        "Gejala buah coklat kehitaman Tidak Diseleksi";
                break;
            case R.id.buah_kering_keriput:
                str = checked ? "Gejala buah kering keriput Diseleksi" :
                        "Gejala buah kering keriput Tidak Diseleksi";
                break;
            case R.id.batang_coklat:
                str = checked ? "Gejala batang coklat Diseleksi" :
                        "Gejala batang coklat Tidak Diseleksi";
                break;
            case R.id.daun_muda_bintik:
                str = checked ? "Gejala daun muda bintik Diseleksi" :
                        "Gejala daun muda bintik Tidak Diseleksi";
                break;

        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}