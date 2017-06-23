package soanvan.ebook.vn.soanvan;

import android.content.Intent;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        getSupportActionBar().hide();
        FloatingActionButton flbtshare=(FloatingActionButton)findViewById(R.id.ftbtshare) ;

        final String sharebody="Soạn văn 12 sẽ giúp bạn dễ dàng hơn, hãy dùng thử" +
                " ";
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
    }
}
