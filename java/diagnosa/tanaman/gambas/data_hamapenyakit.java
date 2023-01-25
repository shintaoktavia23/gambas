package diagnosa.tanaman.gambas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class data_hamapenyakit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_hamapenyakit);
    }

    public void hama(View view) {
        Intent intent1 = new Intent(data_hamapenyakit.this, tentang_hama.class);
        startActivity(intent1);

    }
    public void penyakit(View view) {
        Intent intent2 = new Intent(data_hamapenyakit.this, tentang_penyakit.class);
        startActivity(intent2);
    }
    public void rule(View view) {
        Intent intent3 = new Intent(data_hamapenyakit.this, rule.class);
        startActivity(intent3);
    }

    public void solusi(View view) {
        Intent intent4 = new Intent(data_hamapenyakit.this, solusi.class);
        startActivity(intent4);
    }
}