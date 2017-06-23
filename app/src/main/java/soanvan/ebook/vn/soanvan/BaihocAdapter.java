package soanvan.ebook.vn.soanvan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by MyPC on 14/04/2017.
 */
public class BaihocAdapter extends BaseAdapter{

    Context mycontext;
    int mylayout;
    List<BaiHoc> ds;
   ArrayList<BaiHoc> arrayList;
    public BaihocAdapter(Context context,int layout,List<BaiHoc> ds){
        mycontext=context;
        mylayout=layout;
       this.ds= ds ;
        this.arrayList = new ArrayList<>();
        arrayList.addAll(ds);


    }
    @Override
    public int getCount() {
        return ds.size();
    }

    @Override
    public Object getItem(int position) {
        return ds.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(mycontext).inflate(R.layout.dong_bai_hoc,viewGroup,false);
        //ánh xạ
        TextView txtvten=(TextView)view.findViewById(R.id.tvtenbai);
        TextView txtvhinh=(TextView)view.findViewById(R.id.tvhinh);
        BaiHoc baiHoc=ds.get(position);
        txtvten.setText(baiHoc.getmTenBai());
        txtvhinh.setBackgroundResource(baiHoc.getmHinh());
        txtvhinh.setText((position+1)+"");
        return view;
    }

    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        ds.clear();
        if(charText.length()==0){
            ds.addAll(arrayList);
        }
        else {
            for(BaiHoc bh : arrayList){
                if(bh.getmTenBai().toLowerCase(Locale.getDefault()).contains(charText)){
                ds.add(bh);
                }
            }
        }
        notifyDataSetChanged();
    }


    }
