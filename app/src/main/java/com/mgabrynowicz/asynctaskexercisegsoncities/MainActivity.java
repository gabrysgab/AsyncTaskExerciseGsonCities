package com.mgabrynowicz.asynctaskexercisegsoncities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mgabrynowicz.asynctaskexercisegsoncities.Model.IpInfo;

public class MainActivity extends AppCompatActivity implements GetIpInfoAsyncTask.InfoDownloadedListener {

    private EditText ipEditText;
    private Button getInfoButton;
    private TextView cityTextView;
    private TextView countryTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getInfoButton = (Button) findViewById(R.id.getInfoButton);
        ipEditText = (EditText) findViewById(R.id.ipEditText);
        cityTextView = (TextView) findViewById(R.id.cityTextView);
        countryTextView = (TextView) findViewById(R.id.countryTextView);

        getInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new GetIpInfoAsyncTask(MainActivity.this).execute(ipEditText.getText().toString());

            }
        });

    }


    @Override
    public void onInfoDownloaded(IpInfo ipInfo) {

        if(ipInfo != null) {

            cityTextView.setText(ipInfo.getRestResponse().getResult().getCity());
            countryTextView.setText(ipInfo.getRestResponse().getResult().getCountry());
        } else {

            cityTextView.setText("Failed!");
            countryTextView.setText("");
        }


    }
}
