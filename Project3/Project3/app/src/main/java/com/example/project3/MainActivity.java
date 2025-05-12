package com.example.project3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2, edt3;
    Button btncong, btntru, btnnhan, btnchia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edta);
        edt2 = findViewById(R.id.edtb);
        edt3 = findViewById(R.id.edtc);

        btncong = findViewById(R.id.btncong);
        btntru = findViewById(R.id.btntru);
        btnnhan = findViewById(R.id.btnnhan);
        btnchia = findViewById(R.id.btnchia);

        btncong.setOnClickListener(v -> {
            try {
                int a = Integer.parseInt(edt1.getText().toString().trim());
                int b = Integer.parseInt(edt2.getText().toString().trim());
                edt3.setText("a + b = " + (a + b));
            } catch (NumberFormatException e) {
                edt3.setText("Vui lòng nhập số hợp lệ");
            }
        });

        btntru.setOnClickListener(v -> {
            try {
                int a = Integer.parseInt(edt1.getText().toString().trim());
                int b = Integer.parseInt(edt2.getText().toString().trim());
                edt3.setText("a - b = " + (a - b));
            } catch (NumberFormatException e) {
                edt3.setText("Vui lòng nhập số hợp lệ");
            }
        });

        btnnhan.setOnClickListener(v -> {
            try {
                int a = Integer.parseInt(edt1.getText().toString().trim());
                int b = Integer.parseInt(edt2.getText().toString().trim());
                edt3.setText("a * b = " + (a * b));
            } catch (NumberFormatException e) {
                edt3.setText("Vui lòng nhập số hợp lệ");
            }
        });

        btnchia.setOnClickListener(v -> {
            try {
                int a = Integer.parseInt(edt1.getText().toString().trim());
                int b = Integer.parseInt(edt2.getText().toString().trim());
                if (b == 0) {
                    edt3.setText("B phải khác 0");
                } else {
                    edt3.setText("a / b = " + (a / b));
                }
            } catch (NumberFormatException e) {
                edt3.setText("Vui lòng nhập số hợp lệ");
            }
        });
    }
}
