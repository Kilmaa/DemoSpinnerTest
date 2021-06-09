package sg.edu.rp.c346.id20022404.demospinnertest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spanYesNo;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spanYesNo = findViewById(R.id.spinner);
        tv = findViewById(R.id.textView);

        spanYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tv.setText("Spinner item " + spanYesNo.getSelectedItem() + " selected");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                tv.setText("Spinner item " + spanYesNo.getSelectedItem() + " selected");
            }
        });
    }
}