package com.example.ahmed.butterknife;

import android.os.TokenWatcher;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.lbl_title)
    TextView lblTitle;

    @BindView(R.id.inputName)
    EditText inputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_enter)
    public void onButtonClick(View view)
    {
        Toast.makeText(getApplicationContext(), "you have entered: "
                + inputEditText.getText().toString() , Toast.LENGTH_LONG).show();
    }
}
