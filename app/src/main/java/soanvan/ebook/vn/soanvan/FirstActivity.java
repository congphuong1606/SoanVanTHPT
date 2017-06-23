package soanvan.ebook.vn.soanvan;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;;

public class FirstActivity extends AppCompatActivity {
     AdView avBanner;
     AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        getSupportActionBar().hide();


        avBanner =(AdView)findViewById(R.id.av_banner);

        adRequest = new AdRequest.Builder().build();
        //load ads
        avBanner.loadAd(adRequest);



        Button bt10 =(Button) findViewById(R.id.ibtn10);
        Button ibtn11 =(Button) findViewById(R.id.ibtn11);
        Button ibtn12 =(Button) findViewById(R.id.ibtn12);
        ibtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FirstActivity.this,MainActivity12.class);
                startActivity(intent);


            }
        });
        ibtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FirstActivity.this,MainActivity11.class);
                startActivity(intent);

            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FirstActivity.this,MainActivity10.class);
                startActivity(intent);

            }
        });


    }
}
