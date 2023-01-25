package diagnosa.tanaman.gambas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class tentang_hama extends AppCompatActivity {
    TextView tvDeskripsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_hama);
        tvDeskripsi = (TextView) findViewById(R.id.gbs);

    }
}