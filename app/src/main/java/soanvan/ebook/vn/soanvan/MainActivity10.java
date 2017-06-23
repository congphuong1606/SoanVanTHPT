package soanvan.ebook.vn.soanvan;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.ActionMenuView;
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

public class MainActivity10 extends AppCompatActivity  {
    private SearchView searchView;
    BaihocAdapter baihocAdapter;
    ListView lvBaihoc;
    ListView lvBaiHoc2;
    private ArrayList<BaiHoc> mMangBaiHoc;
    private boolean mIsFragment1;
    private ArrayList<BaiHoc> mMangBaiHoc2;
    private BaihocAdapter baihocAdapter2;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.logo);


        AdView avBanner =(AdView)findViewById(R.id.av_banner);

        AdRequest adRequest = new AdRequest.Builder().build();
        //load ads
        avBanner.loadAd(adRequest);

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        setTitle("soạn văn 10");








        final View tap1Fragment10 = findViewById(R.id.Tap1Fragment10);
        final View tap2Fragment10 = findViewById(R.id.Tap2Fragment10);
        tap1Fragment10.setVisibility(View.VISIBLE);
        tap2Fragment10.setVisibility(View.GONE);
        final ImageButton ibtn101 = (ImageButton) findViewById(R.id.ibtn101);
        final ImageButton ibtn102 = (ImageButton) findViewById(R.id.ibtn102);
        mIsFragment1=true;
        ibtn101.setBackgroundColor(Color.parseColor("#ccffff"));
        ibtn102.setBackgroundColor(Color.parseColor("#33ffcc"));
        ibtn101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tap1Fragment10.setVisibility(View.VISIBLE);
                tap2Fragment10.setVisibility(View.GONE);
                setTitle("soạn văn 10 tập 1");
                mIsFragment1=true;
                ibtn101.setBackgroundColor(Color.parseColor("#ccffff"));
                ibtn102.setBackgroundColor(Color.parseColor("#33ffcc"));
            }
        });
        ibtn102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTitle("soạn văn 10 tập 2");
                tap1Fragment10.setVisibility(View.GONE);
                tap2Fragment10.setVisibility(View.VISIBLE);
                

                mIsFragment1=false;
                ibtn102.setBackgroundColor(Color.parseColor("#ccffff"));
                ibtn101.setBackgroundColor(Color.parseColor("#33ffcc"));
            }
        });





        ///


        lvBaihoc = (ListView) findViewById(R.id.lv1);
        lvBaiHoc2 = (ListView) findViewById(R.id.lv2);

        mMangBaiHoc = new ArrayList<BaiHoc>();
        mMangBaiHoc2 = new ArrayList<BaiHoc>();

        mMangBaiHoc.add(new BaiHoc("Tổng quan văn học Việt Nam", R.drawable.hinh, "lop10tap1/tap11lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Hoạt động giao tiếp bằng ngôn ngữ", R.drawable.hinh, "lop10tap1/tap12lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Khái quát văn học dân gian Việt Nam", R.drawable.hinh, "lop10tap1/tap13lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Hoạt động giao tiếp bằng ngôn ngữ (tiếp theo)", R.drawable.hinh, "lop10tap1/tap14lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Văn bản", R.drawable.hinh, "lop10tap1/tap15lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Cảm nghĩ về một hiện tượng đời sống (hoặc một tác phẩm văn học)", R.drawable.hinh, "lop10tap1/tap16lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Chiến thắng Mtao-Mxây", R.drawable.hinh, "lop10tap1/tap17lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Văn bản (Tiếp theo)", R.drawable.hinh, "lop10tap1/tap18lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Truyện An Dương Vương và Mị Châu - Trọng Thủy", R.drawable.hinh, "lop10tap1/tap19lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Lập dàn ý bài văn tự sự", R.drawable.hinh, "lop10tap1/lp10_110.txt"));
        mMangBaiHoc.add(new BaiHoc("Uy-Lít-Xơ trở về", R.drawable.hinh, "lop10tap1/tap111lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Ra-Ma buộc tội", R.drawable.hinh, "lop10tap1/tap112lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Chọn sự việc, chi tiết tiêu biểu trong văn tự sự", R.drawable.hinh, "lop10tap1/tap113lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Tấm Cám", R.drawable.hinh, "lop10tap1/tap114lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Miêu tả và biểu cảm trong văn tự sự", R.drawable.hinh, "lop10tap1/tap115lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Tam đại con gà", R.drawable.hinh, "lop10tap1/tap116lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Nhưng nó phải bằng hai mày", R.drawable.hinh, "lop10tap1/tap117lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Viết bài tập làm văn số 2: Văn tự sự", R.drawable.hinh, "lop10tap1/tap118lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Ca dao than thân và ca dao yêu thương, tình nghĩa", R.drawable.hinh, "lop10tap1/tap119lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Đặc điểm của ngôn ngữ nói và ngôn ngữ viết", R.drawable.hinh, "lop10tap1/tap120lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Ca dao hài hước", R.drawable.hinh, "lop10tap1/tap121lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Lời tiễn dặn", R.drawable.hinh, "lop10tap1/tap122lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Luyện viết đoạn văn tự sự", R.drawable.hinh, "lop10tap1/tap123lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Ôn tập văn học dân gian Việt Nam", R.drawable.hinh, "lop10tap1/tap124lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Khái quát văn học Việt Nam từ X đến hết thế kỉ XIX", R.drawable.hinh, "lop10tap1/tap125lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Phong cách ngôn ngữ sinh hoạt", R.drawable.hinh, "lop10tap1/tap126lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Tỏ lòng (Thuật hoài)", R.drawable.hinh, "lop10tap1/tap127lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Cảnh ngày hè - Nguyễn Trãi", R.drawable.hinh, "lop10tap1/tap128lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Tóm tắt văn bản tự sự", R.drawable.hinh, "lop10tap1/tap129lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Viết bài làm văn số 3: Văn tự sự", R.drawable.hinh, "lop10tap1/tap130lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Phong cách ngôn ngữ sinh hoạt (Tiếp theo)", R.drawable.hinh, "lop10tap1/tap131lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Nhàn - Nguyễn Bỉnh Khiêm", R.drawable.hinh, "lop10tap1/tap132lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("ĐỌC \"TIỂU THANH KÍ\"", R.drawable.hinh, "lop10tap1/tap133lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Thực hành phép tu từ Ẩn dụ và Hoán dụ", R.drawable.hinh, "lop10tap1/tap134lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Vận nước", R.drawable.hinh, "lop10tap1/tap135lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Cáo bệnh, bảo mọi người", R.drawable.hinh, "lop10tap1/tap136lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Hứng trở về", R.drawable.hinh, "lop10tap1/tap137lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Tại lầu Hoàng Hạc tiễn Mạnh Hạo Nhiên đi Quảng Lăng", R.drawable.hinh, "lop10tap1/tap138lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Cảm xúc mùa thu", R.drawable.hinh, "lop10tap1/tap139lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Trình bày về một vấn đề", R.drawable.hinh, "lop10tap1/tap140lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Lập kế hoạch cá nhân", R.drawable.hinh, "lop10tap1/tap141lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Thơ Hai-kư của Ba-sô", R.drawable.hinh, "lop10tap1/tap142lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Lầu Hoàng Hạc - Thôi Hiệu", R.drawable.hinh, "lop10tap1/tap143lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Nỗi oan của người phòng khuê", R.drawable.hinh, "lop10tap1/tap144lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Khe chim kêu - Vương Duy", R.drawable.hinh, "lop10tap1/tap145lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Các hình thức kết cấu của văn bản thuyết minh", R.drawable.hinh, "lop10tap1/tap146lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("Lập dàn ý bài văn thuyết minh", R.drawable.hinh, "lop10tap1/tap147lop10.txt"));
        mMangBaiHoc.add(new BaiHoc("tentieudebaihoc", R.drawable.hinh,"tap11aaaaaaaaaaaaa.txt"));

        /////////


        ///////
        mMangBaiHoc2.add(new BaiHoc("Phú sông Bạch Đằng (Trương Hán Siêu)", R.drawable.hinh, "lop10tap2/tap21lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Đại cáo bình Ngô - Phần 1: Tác giả Nguyễn Trãi", R.drawable.hinh, "lop10tap2/tap22lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Viết bài làm văn số 4: Văn thuyết minh", R.drawable.hinh, "lop10tap2/tap23lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Đại cáo bình Ngô - Phần 2: Tác phẩm", R.drawable.hinh, "lop10tap2/tap24lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tính chuẩn xác hấp dẫn của văn bản thuyết minh", R.drawable.hinh, "lop10tap2/tap25lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Trích diễm thi tập (Hoàng Đức Lương)", R.drawable.hinh, "lop10tap2/tap26lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Hiền tài là nguyên khí quốc gia (Thân Nhân Trung)", R.drawable.hinh, "lop10tap2/tap27lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Khái quát lịch sử tiếng Việt", R.drawable.hinh, "lop10tap2/tap28lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Hưng Đạo đại vương Trần Quốc Tuấn (Ngô Sĩ Liên)", R.drawable.hinh, "lop10tap2/tap29lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Thái sư Trần Thủ Độ (Ngô Sĩ Liên)", R.drawable.hinh, "lop10tap2/tap210lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Phương pháp thuyết minh", R.drawable.hinh, "lop10tap2/tap211lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Viết bài làm văn số 5: Văn thuyết minh", R.drawable.hinh, "lop10tap2/tap212lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Chuyện chức phán sự đền Tản Viên (Nguyễn Dữ)", R.drawable.hinh, "lop10tap2/tap213lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Luyện tập viết đoạn văn thuyết minh", R.drawable.hinh, "lop10tap2/tap214lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Những yêu cầu về sử dụng tiếng Việt", R.drawable.hinh, "lop10tap2/tap215lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tóm tắt văn bản thuyết minh", R.drawable.hinh, "lop10tap2/tap216lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Hồi trống Cổ Thành (La Quán Trung)", R.drawable.hinh, "lop10tap2/tap217lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tào Tháo uống rượu luận anh hùng (La Quán Trung)", R.drawable.hinh, "lop10tap2/tap218lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Viết bài làm văn số 6: Văn thuyết minh văn học", R.drawable.hinh, "lop10tap2/tap219lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tình cảnh lẻ loi của người chinh phụ (Đặng Trần Côn)", R.drawable.hinh, "lop10tap2/tap220lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Lập dàn ý bài văn nghị luận", R.drawable.hinh, "lop10tap2/tap221lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Truyện Kiều - Phần 1: Tác giả Nguyễn Du", R.drawable.hinh, "lop10tap2/tap222lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Phong cách ngôn ngữ nghệ thuật", R.drawable.hinh, "lop10tap2/tap223lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Truyện Kiều - Phần 2 Trao Duyên", R.drawable.hinh, "lop10tap2/tap224lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Truyện Kiều - Phần Nỗi thương mình", R.drawable.hinh, "lop10tap2/tap225lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Lập luận trong văn nghị luận", R.drawable.hinh, "lop10tap2/tap226lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Chí khí anh hùng (trích Truyện Kiều)", R.drawable.hinh, "lop10tap2/tap227lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Thề nguyền (trích Truyện Kiều)", R.drawable.hinh, "lop10tap2/tap228lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Văn bản văn học", R.drawable.hinh, "lop10tap2/tap229lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Thực hành các phép tu từ: phép điệp và phép đối", R.drawable.hinh, "lop10tap2/tap230lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Nội dung và hình thức của văn bản văn học", R.drawable.hinh, "lop10tap2/tap231lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Các thao tác nghị luận", R.drawable.hinh, "lop10tap2/tap232lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Viết bài làm văn số 7: Văn nghị luận", R.drawable.hinh, "lop10tap2/tap233lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Ôn tập phần Tiếng Việt", R.drawable.hinh, "lop10tap2/tap234lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Luyện tập viết đoạn văn nghị luận", R.drawable.hinh, "lop10tap2/tap235lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Viết quảng cáo", R.drawable.hinh, "lop10tap2/tap236lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tổng kết phần văn học", R.drawable.hinh, "lop10tap2/tap237lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("Ôn tập phần làm văn", R.drawable.hinh, "lop10tap2/tap238lop10.txt"));
        mMangBaiHoc2.add(new BaiHoc("tentieudebaihoc", R.drawable.hinh,"tap11aaaaaaaaaaaaa.txt"));



        baihocAdapter = new BaihocAdapter(MainActivity10.this, R.layout.activity_tap1, mMangBaiHoc);
        lvBaihoc.setAdapter(baihocAdapter);
        lvBaihoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity10.this, DetailActivity.class);
                intent.putExtra("FILE", mMangBaiHoc.get(i).getNameFile());
                startActivity(intent);
            }
        });

        baihocAdapter2 = new BaihocAdapter(MainActivity10.this, R.layout.activity_tap2, mMangBaiHoc2);
        lvBaiHoc2.setAdapter(baihocAdapter2);
        lvBaiHoc2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity10.this, DetailActivity.class);
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
                Intent intent=new Intent(MainActivity10.this,information.class);
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


