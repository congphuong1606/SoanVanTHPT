package soanvan.ebook.vn.soanvan;

import android.graphics.Typeface;
import android.text.ClipboardManager;
import android.content.Context;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.support.design.widget.FloatingActionButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class DetailActivity extends AppCompatActivity {
    TextView tvContent;
    AdView avBanner;
    AdRequest adRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide();
       // face = Typeface.createFromAsset(getAssets(), "fonts/abvg.TTF");
     //   tvContent.setTypeface(face);
        avBanner =(AdView)findViewById(R.id.av_banner);

        adRequest = new AdRequest.Builder().build();
        //load ads
        avBanner.loadAd(adRequest);




       FloatingActionButton flbtcopy=(FloatingActionButton)findViewById(R.id.flbtcopy) ;
        flbtcopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(tvContent.getText().toString());
                Toast.makeText(DetailActivity.this,"bạn đã Coppy",Toast.LENGTH_SHORT).show();

            }
        });


        //

        FloatingActionButton flbtshare=(FloatingActionButton)findViewById(R.id.ftbtshare) ;

        final String sharebody="Soạn văn THPT sẽ giúp bạn dễ dàng hơn, hãy dùng thử" +"\n"+
                " https://play.google.com/store/apps/details?id=soanvan.ebook.vn.soanvan12";
        flbtshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareintent=new Intent(android.content.Intent.ACTION_SEND);
                shareintent.setType("text/pain");
                shareintent.putExtra(android.content.Intent.EXTRA_SUBJECT,"My APP");
                shareintent.putExtra(Intent.EXTRA_TEXT,sharebody);
                startActivity(Intent.createChooser(shareintent,"Chia sẻ đến"));
            }
        });

       tvContent=(TextView)findViewById(R.id.tvContent) ;
        Intent intent = getIntent();
        String fileName = intent.getStringExtra("FILE");
        if (!TextUtils.isEmpty(fileName)) {
            String data = getData(fileName);
            tvContent.setText(Html.fromHtml(data));
        }
    }

    private String getData(String file) {
        StringBuilder  buf =new StringBuilder();
        InputStream json = null;
        try{
            json = getAssets().open(file);
            BufferedReader in =null;
            in = new BufferedReader(new InputStreamReader(json,"UTF-8"));
            String str;
            while ((str = in.readLine())!=null){
                buf.append(str);
            }
                    in.close();
        }catch (UnsupportedEncodingException e){

        }catch (IOException e){
            e.printStackTrace();
        }
        return buf.toString();
    }


}
