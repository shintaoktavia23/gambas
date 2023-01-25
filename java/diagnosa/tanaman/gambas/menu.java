package diagnosa.tanaman.gambas;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;


public class menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void tentanggambas(View view) {
        Intent intent1 = new Intent(menu.this, tentang.class);
        startActivity(intent1);
    }

    public void diagnosa(View view) {
        Intent intent2 = new Intent(menu.this, diagnosa.class);
        startActivity(intent2);
    }

    public void data(View view) {
        Intent intent3 = new Intent(menu.this, data_hamapenyakit.class);
        startActivity(intent3);
    }

    public void keluar(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(menu.this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle(R.string.app_name);
        builder.setMessage("Apakah anda yakin untuk keluar?");
        builder.setCancelable(true);
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            private Timer dialog;

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
