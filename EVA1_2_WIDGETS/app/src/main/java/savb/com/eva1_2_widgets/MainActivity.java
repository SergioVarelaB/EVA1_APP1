package savb.com.eva1_2_widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVw = findViewById(R.id.txtVwMens);
        txtVw.setText("Hola");
        txtVw.setText(R.string.cadena);

    }
}
