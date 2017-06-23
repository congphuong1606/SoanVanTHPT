package soanvan.ebook.vn.soanvan;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;

import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class MainActivity12 extends AppCompatActivity  {
    private SearchView searchView;
     BaihocAdapter baihocAdapter;
    ListView lvBaihoc;
    ListView lvBaiHoc2;
    private ArrayList<BaiHoc> mMangBaiHoc;
    private boolean mIsFragment1;
    private ArrayList<BaiHoc> mMangBaiHoc2;
    private BaihocAdapter baihocAdapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        setTitle("soạn văn 12");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.logo);
        AdView  avBanner =(AdView)findViewById(R.id.av_banner);

        AdRequest adRequest = new AdRequest.Builder().build();
        //load ads
        avBanner.loadAd(adRequest);

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);





        final View tap1Fragment12 = findViewById(R.id.Tap1Fragment12);
        final View tap2Fragment12 = findViewById(R.id.Tap2Fragment12);
        tap1Fragment12.setVisibility(View.VISIBLE);
        tap2Fragment12.setVisibility(View.GONE);
        final ImageButton ibtn121 = (ImageButton) findViewById(R.id.ibtn121);
        final ImageButton ibtn122 = (ImageButton) findViewById(R.id.ibtn122);
        mIsFragment1=true;
        ibtn121.setBackgroundColor(Color.parseColor("#ccffff"));
        ibtn122.setBackgroundColor(Color.parseColor("#33ffcc"));
        ibtn121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tap1Fragment12.setVisibility(View.VISIBLE);
                tap2Fragment12.setVisibility(View.GONE);
                ibtn121.setBackgroundColor(Color.parseColor("#ccffff"));
                ibtn122.setBackgroundColor(Color.parseColor("#33ffcc"));
                mIsFragment1=true;
                setTitle("soạn văn 12tập 1");
            }
        });
        ibtn122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ibtn122.setBackgroundColor(Color.parseColor("#ccffff"));
                ibtn121.setBackgroundColor(Color.parseColor("#33ffcc"));
                tap1Fragment12.setVisibility(View.GONE);
                tap2Fragment12.setVisibility(View.VISIBLE);
                setTitle("soạn văn 12 tập 2");
                mIsFragment1=false;
            }
        });





        ///


        lvBaihoc = (ListView) findViewById(R.id.lv1);
        lvBaiHoc2 = (ListView) findViewById(R.id.lv2);

        mMangBaiHoc = new ArrayList<BaiHoc>();
        mMangBaiHoc2 = new ArrayList<BaiHoc>();

        mMangBaiHoc.add(new BaiHoc("Khái quát về văn học Việt Nam từ đầu cách mạng tháng 8 1945 đến TK XX", R.drawable.hinh, "lop12/tap11.txt"));
        mMangBaiHoc.add(new BaiHoc("Nghị luận về một tư tưởng, đạo lí", R.drawable.hinh, "lop12/tap12.txt"));
        mMangBaiHoc.add(new BaiHoc("Tuyên Ngôn Độc Lập (Hồ Chí Minh) - Phần 1: Tác giả", R.drawable.hinh, "lop12/tap13.txt"));
        mMangBaiHoc.add(new BaiHoc("Giữ gìn sự trong sáng của tiếng Việt", R.drawable.hinh, "lop12/tap14.txt"));
        mMangBaiHoc.add(new BaiHoc("Viết bài làm văn số 1: Nghị luận xã hội", R.drawable.hinh, "lop12/tap15.txt"));
        mMangBaiHoc.add(new BaiHoc("Tuyên Ngôn Độc Lập (Hồ Chí Minh) - Phần 2: Tác phẩm", R.drawable.hinh, "lop12/tap16.txt"));
        mMangBaiHoc.add(new BaiHoc("Giữ gìn sự trong sáng của tiếng Việt (tiếp theo)", R.drawable.hinh, "lop12/tap17.txt"));
        mMangBaiHoc.add(new BaiHoc("Nguyễn Đình Chiểu, ngôi sao sáng trong văn nghệ của dân tộc", R.drawable.hinh, "lop12/tap18.txt"));
        mMangBaiHoc.add(new BaiHoc("Mấy ý nghĩ về thơ (Nguyễn Đình Thi)", R.drawable.hinh, "lop12/tap19.txt"));
        mMangBaiHoc.add(new BaiHoc("Đô-xtôi-ép-xki (X.Xvai-Gơ)", R.drawable.hinh, "lop12/tap110.txt"));
        mMangBaiHoc.add(new BaiHoc("Nghị luận về một hiện tượng đời sống", R.drawable.hinh, "lop12/tap111.txt"));
        mMangBaiHoc.add(new BaiHoc("Phong cách ngôn ngữ khoa học", R.drawable.hinh, "lop12/tap112.txt"));
        mMangBaiHoc.add(new BaiHoc("Viết bài làm văn số 2: Nghị luận xã hội", R.drawable.hinh, "lop12/tap113.txt"));
        mMangBaiHoc.add(new BaiHoc("Thông điệp nhân ngày thế giới phòng chống AIDS 01/12/2003", R.drawable.hinh, "lop12/tap114.txt"));
        mMangBaiHoc.add(new BaiHoc("Nghị luận về một bài thơ, đoạn thơ", R.drawable.hinh, "lop12/tap115.txt"));
        mMangBaiHoc.add(new BaiHoc("Tây tiến (Quang Dũng)", R.drawable.hinh, "lop12/tap116.txt"));
        mMangBaiHoc.add(new BaiHoc("Nghị luận về một ý kiến bàn về văn học)", R.drawable.hinh, "lop12/tap117.txt"));
        mMangBaiHoc.add(new BaiHoc("Việt Bắc (Tố Hữu) - Phần 1: Tác giả)", R.drawable.hinh, "lop12/tap118.txt"));
        mMangBaiHoc.add(new BaiHoc("Luật thơ)", R.drawable.hinh, "lop12/tap119.txt"));
        mMangBaiHoc.add(new BaiHoc("Việt Bắc (Tố Hữu) - Phần 2: Tác phẩm)", R.drawable.hinh, "lop12/tap120.txt"));
        mMangBaiHoc.add(new BaiHoc("Phát biểu theo chủ đề)", R.drawable.hinh, "lop12/tap121.txt"));
        mMangBaiHoc.add(new BaiHoc("Đất nước (Nguyễn Khoa Điềm))", R.drawable.hinh, "lop12/tap122.txt"));
        mMangBaiHoc.add(new BaiHoc("Đất nước (Nguyễn Đình Thi))", R.drawable.hinh, "lop12/tap123.txt"));
        mMangBaiHoc.add(new BaiHoc("Luật thơ (Tiếp theo))", R.drawable.hinh, "lop12/tap124.txt"));
        mMangBaiHoc.add(new BaiHoc("Thực hành một số phép tu từ ngữ âm)", R.drawable.hinh, "lop12/tap125.txt"));
        mMangBaiHoc.add(new BaiHoc("Viết bài làm văn số 3: Nghị luận văn học)", R.drawable.hinh, "lop12/tap126.txt"));
        mMangBaiHoc.add(new BaiHoc("Dọn về làng (Nông Quốc Chấn))", R.drawable.hinh, "lop12/tap127.txt"));
        mMangBaiHoc.add(new BaiHoc("Tiếng hát con tàu (Chế Lan Viên))", R.drawable.hinh, "lop12/tap128.txt"));
        mMangBaiHoc.add(new BaiHoc("Đò lèn (Nguyễn Duy))", R.drawable.hinh, "lop12/tap129.txt"));
        mMangBaiHoc.add(new BaiHoc("Thực hành một số phép tu từ cú pháp)", R.drawable.hinh, "lop12/tap130.txt"));
        mMangBaiHoc.add(new BaiHoc("Sóng (Xuân Quỳnh))", R.drawable.hinh, "lop12/tap131.txt"));
        mMangBaiHoc.add(new BaiHoc("Luyện tập vận dụng kết hợp các phương thức biểu đạt trong bài văn nghị luận)", R.drawable.hinh, "lop12/tap132.txt"));
        mMangBaiHoc.add(new BaiHoc("Đàn ghi ta của Lor-ca (Thanh Thảo))", R.drawable.hinh, "lop12/tap133.txt"));
        mMangBaiHoc.add(new BaiHoc("Bác ơi! (Tố Hữu))", R.drawable.hinh, "lop12/tap134.txt"));
        mMangBaiHoc.add(new BaiHoc("Tự do (P.Ê-luy-a))", R.drawable.hinh, "lop12/tap135.txt"));
        mMangBaiHoc.add(new BaiHoc("Luyện tập vận dụng kết hợp các thao tác lập luận)", R.drawable.hinh, "lop12/tap136.txt"));
        mMangBaiHoc.add(new BaiHoc("Quá trình văn học và phong cách văn học)", R.drawable.hinh, "lop12/tap137.txt"));
        mMangBaiHoc.add(new BaiHoc("Người lái đò sông đà (Nguyễn Tuân))", R.drawable.hinh, "lop12/tap138.txt"));
        mMangBaiHoc.add(new BaiHoc("Chữa lỗi lập luận trong văn nghị luận)", R.drawable.hinh, "lop12/tap139.txt"));
        mMangBaiHoc.add(new BaiHoc("Ai đã đặt tên cho dòng sông? (Hoàng Phủ Ngọc Tường))", R.drawable.hinh, "lop12/tap140.txt"));
        mMangBaiHoc.add(new BaiHoc("Ai đã đặt tên cho dòng sông? (Hoàng Phủ Ngọc Tường))", R.drawable.hinh, "lop12/tap141.txt"));
        mMangBaiHoc.add(new BaiHoc("Thực hành chữa lỗi lập luận trong văn nghị luận)", R.drawable.hinh, "lop12/tap142.txt"));
        mMangBaiHoc.add(new BaiHoc("Ôn tập phần văn học Lớp 12 kì 1)", R.drawable.hinh, "lop12/tap143.txt"));
       /////////


        ///////
        mMangBaiHoc2.add(new BaiHoc("Vợ chồng A Phủ (Tô Hoài)", R.drawable.hinh, "lop12/tap21.txt"));
        mMangBaiHoc2.add(new BaiHoc("Viết bài làm văn số 5: Nghị luận văn học", R.drawable.hinh, "lop12/tap22.txt"));
        mMangBaiHoc2.add(new BaiHoc("Nhân vật giao tiếp", R.drawable.hinh, "lop12/tap23.txt"));
        mMangBaiHoc2.add(new BaiHoc("Vợ Nhặt (Kim Lân)", R.drawable.hinh, "lop12/tap24.txt"));
        mMangBaiHoc2.add(new BaiHoc("Nghị luận về một tác phẩm, một đoạn trích văn xuôi", R.drawable.hinh, "lop12/tap25.txt"));
        mMangBaiHoc2.add(new BaiHoc("Rừng xà nu (Nguyễn Trung Thành)", R.drawable.hinh, "lop12/tap26.txt"));
        mMangBaiHoc2.add(new BaiHoc("Bắt sấu rừng U Minh Hạ (Sơn Nam)", R.drawable.hinh, "lop12/tap27.txt"));
        mMangBaiHoc2.add(new BaiHoc("Những đứa con trong gia đình (Nguyễn Thi)", R.drawable.hinh, "lop12/tap28.txt"));
        mMangBaiHoc2.add(new BaiHoc("Viết bài làm văn số 6: Nghị luận văn học", R.drawable.hinh, "lop12/tap29.txt"));
        mMangBaiHoc2.add(new BaiHoc("Chiếc thuyền ngoài xa (Nguyễn Minh Châu)", R.drawable.hinh, "lop12/tap210.txt"));
        mMangBaiHoc2.add(new BaiHoc("Thực hành về hàm ý", R.drawable.hinh, "lop12/tap211.txt"));
        mMangBaiHoc2.add(new BaiHoc("Mùa lá rụng trong vườn (Ma Văn Kháng)", R.drawable.hinh, "lop12/tap212.txt"));
        mMangBaiHoc2.add(new BaiHoc("Một người Hà Nội (Nguyễn Khải)", R.drawable.hinh, "lop12/tap213.txt"));
        mMangBaiHoc2.add(new BaiHoc("Thực hành về hàm ý (tiếp theo)", R.drawable.hinh, "lop12/tap214.txt"));
        mMangBaiHoc2.add(new BaiHoc("Thuốc (Lỗ Tấn)", R.drawable.hinh, "lop12/tap215.txt"));
        mMangBaiHoc2.add(new BaiHoc("Rèn luyện kĩ năng mở bài, kết bài trong văn nghị luận", R.drawable.hinh, "lop12/tap216.txt"));
        mMangBaiHoc2.add(new BaiHoc("Số phận con người (M. Sô-lô-khốp)", R.drawable.hinh, "lop12/tap217.txt"));
        mMangBaiHoc2.add(new BaiHoc("Ông già và biển cả (Hê-Minh-Uê)", R.drawable.hinh, "lop12/tap218.txt"));
        mMangBaiHoc2.add(new BaiHoc("Diễn đạt trong văn nghị luận", R.drawable.hinh, "lop12/tap219.txt"));
        mMangBaiHoc2.add(new BaiHoc("Hồn Trương Ba, da hàng thịt (Lưu Quang Vũ)", R.drawable.hinh, "lop12/tap220.txt"));
        mMangBaiHoc2.add(new BaiHoc("Diễn đạt trong văn nghị luận (tiếp theo)", R.drawable.hinh, "lop12/tap221.txt"));
        mMangBaiHoc2.add(new BaiHoc("Nhìn về vốn văn hóa dân tộc (Trần Đình Hượu)", R.drawable.hinh, "lop12/tap222.txt"));
        mMangBaiHoc2.add(new BaiHoc("Phát biểu tự do", R.drawable.hinh, "lop12/tap223.txt"));
        mMangBaiHoc2.add(new BaiHoc("Phong cách ngôn ngữ hành chính", R.drawable.hinh, "lop12/tap224.txt"));
        mMangBaiHoc2.add(new BaiHoc("Văn bản tổng kết", R.drawable.hinh, "lop12/tap225.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tổng kết phần tiếng Việt: hoạt động giao tiếp bằng ngôn ngữ", R.drawable.hinh, "lop12/tap226.txt"));
        mMangBaiHoc2.add(new BaiHoc("Ôn tập phần làm văn", R.drawable.hinh, "lop12/tap227.txt"));
        mMangBaiHoc2.add(new BaiHoc("Giá trị văn học và tiếp nhận văn học", R.drawable.hinh, "lop12/tap228.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tổng kết phần tiếng Việt: Lịch sử, đặc điểm loại hình và các phong cách ngôn ngữ", R.drawable.hinh, "lop12/tap229.txt"));
        mMangBaiHoc2.add(new BaiHoc("Ôn tập phần văn học Lớp 12 kì 2", R.drawable.hinh, "lop12/tap230.txt"));




        baihocAdapter = new BaihocAdapter(MainActivity12.this, R.layout.activity_tap1, mMangBaiHoc);
        lvBaihoc.setAdapter(baihocAdapter);
        lvBaihoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity12.this, DetailActivity.class);
                intent.putExtra("FILE", mMangBaiHoc.get(i).getNameFile());
                startActivity(intent);
            }
        });

        baihocAdapter2 = new BaihocAdapter(MainActivity12.this, R.layout.activity_tap2, mMangBaiHoc2);
        lvBaiHoc2.setAdapter(baihocAdapter2);
        lvBaiHoc2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity12.this, DetailActivity.class);
                intent.putExtra("FILE", mMangBaiHoc2.get(i).getNameFile());
                startActivity(intent);
            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.search,menu);

        MenuItem itemSearch = menu.findItem(R.id.search_view);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(itemSearch);
        EditText searchEditText = (EditText) searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        searchEditText.setTextColor(getResources().getColor(R.color.black));
        searchEditText.setHintTextColor(getResources().getColor(R.color.nau));
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

            }

            });
        getMenuInflater().inflate(R.menu.infor,menu);
        MenuItem iteminfor=menu.findItem(R.id.ifor);
        iteminfor.setOnMenuItemClickListener(new OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent=new Intent(MainActivity12.this,information.class);
                startActivity(intent);
                return false;
            }
        });


            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String searchQuery) {
                if(mIsFragment1) {
                    baihocAdapter.filter(searchQuery.toString().trim());
                    lvBaihoc.invalidate();
                }
                else
                {
                    baihocAdapter2.filter(searchQuery.toString().trim());
                    lvBaiHoc2.invalidate();
                }
                return true;
            }
        });

        MenuItemCompat.setOnActionExpandListener(itemSearch, new MenuItemCompat.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                return true;
            }
        });

        return true;
    }




}


