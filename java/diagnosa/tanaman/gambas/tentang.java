package diagnosa.tanaman.gambas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class tentang extends AppCompatActivity {
    TextView tvDeskripsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        tvDeskripsi = (TextView) findViewById(R.id.tanamangbs);

        tvDeskripsi.setText("Gambas atau oyong (Luffa acutangula L. Roxb) adalah  golongan sayuran " +
                "buah yang mengandung banyak nutrisi seperti vitamin, mineral dan serat. " +
                "Buah  gambas memiliki banyak manfaat salah satunya adalah untuk  membersihkan  " +
                "darah, kesehatan, kecantikan. tamanan gambas merupakan tanaman yang dapat tumbuh " +
                "didataran rendah atau dataran tinggi, tanaman gambas merambat " +
                "dan membutuhkan iklim kering dengan ketersedian air yang cukup. " +
                "Banyak manfaat dari tanaman gambas akan tetapi diindonesia sendiri tanaman gambas " +
                "belum menjadi komoditi yang diperhitungkan, " +
                "produksi gambas yang terbatas hanya untuk konsumsi rumah tangga saja "+"\n\n"+"Gambas " +
                "dapat menurunkan kadar glukosa darah karena memiliki kandungan curcubitacin yang termasuk " +
                "pada golongan saponin. Buah gambas berbentuk bulat panjang dengan ukuran 15-30 cm, dan " +
                "dipangkalnya mengecil, Bentuknya menyerupai belimbing dengan " +
                "sikunya memanjang dan Kulitnya keras seperti kaktus dengan daging yang lunak dan halus"+
                "Tanah yang paling ideal ialah jenis tanah liat berpasir, Seperti tanah latosol, aluvial " +
                "dan podsolik merak kuning" + "memiliki masa panen yang cepat dan singkat. " +
                "Setiap tahun permintaan gambas menjadi meningkat karena gambas yang mempunyai " +
                "banyak manfaat yang digemari masyarat akan tetapi Petani budidaya gambas mengalami " +
                "banyak kesulitan dalam budidaya gambas, karena gambas membutuhkan obat dan " +
                "pupuk untuk menghilangkan penyakit dan hama yang mahal. "
        );
    }
}