package com.lyricaloriginal.robolectricpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mLeftPart;
    private EditText mRightPart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLeftPart = (EditText) findViewById(R.id.input_n);
        mRightPart = (EditText) findViewById(R.id.input_m);
        findViewById(R.id.calculate_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int n = Integer.valueOf(mLeftPart.getEditableText().toString());
                    int m = Integer.valueOf(mRightPart.getEditableText().toString());
                    int result = Calculator.permutation(n, m);
                    showResult(n, m, result);
                } catch (Exception ex) {
                    Toast.makeText(getApplication(), ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void showResult(int n, int m, int result) {
        String label = String.format("%dP%d = %d", n, m, result);
        TextView resultView = (TextView) findViewById(R.id.result_view);
        resultView.setText(label);
    }
}
