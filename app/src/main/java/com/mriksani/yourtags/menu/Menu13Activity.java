package com.mriksani.yourtags.menu;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.mriksani.yourtags.R;

public class Menu13Activity extends AppCompatActivity {
    private TextView copy1, copy2, copy3;
    private Button btnCopy1, btnCopy2, btnCopy3;
    private ImageButton btnImg;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu13);

        //Ads Intertitial
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1828706743315425/7729310815");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

        copy1 = (TextView) findViewById(R.id.copy1);
        btnCopy1 = (Button) findViewById(R.id.btnCopy1);
        btnCopy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("label", copy1.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Menu13Activity.this, "Copied", Toast.LENGTH_SHORT).show();
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });

        copy2 = (TextView) findViewById(R.id.copy2);
        btnCopy2 = (Button) findViewById(R.id.btnCopy2);
        btnCopy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("label", copy2.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Menu13Activity.this, "Copied", Toast.LENGTH_SHORT).show();
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });

        copy3 = (TextView) findViewById(R.id.copy3);
        btnCopy3 = (Button) findViewById(R.id.btnCopy3);
        btnCopy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("label", copy3.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Menu13Activity.this, "Copied", Toast.LENGTH_SHORT).show();
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });

        btnImg = (ImageButton) findViewById(R.id.imageButton);
        btnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
