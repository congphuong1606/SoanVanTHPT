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

public class MainActivity11 extends AppCompatActivity  {
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
        setContentView(R.layout.activity_main11);
        AdView avBanner =(AdView)findViewById(R.id.av_banner);

        AdRequest adRequest = new AdRequest.Builder().build();
        //load ads
        avBanner.loadAd(adRequest);

        setTitle("soạn văn 11");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.logo);

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);





        final View tap1Fragment11 = findViewById(R.id.Tap1Fragment11);
        final View tap2Fragment11 = findViewById(R.id.Tap2Fragment11);
        tap1Fragment11.setVisibility(View.VISIBLE);
        tap2Fragment11.setVisibility(View.GONE);
        final ImageButton ibtn111 = (ImageButton) findViewById(R.id.ibtn111);
        final ImageButton ibtn112 = (ImageButton) findViewById(R.id.ibtn112);
        mIsFragment1=true;
        ibtn111.setBackgroundColor(Color.parseColor("#ccffff"));
        ibtn112.setBackgroundColor(Color.parseColor("#33ffcc"));
        ibtn111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tap1Fragment11.setVisibility(View.VISIBLE);
                tap2Fragment11.setVisibility(View.GONE);
                ibtn111.setBackgroundColor(Color.parseColor("#ccffff"));
                ibtn112.setBackgroundColor(Color.parseColor("#33ffcc"));
                mIsFragment1=true;
                setTitle("soạn văn 11 tập 1");
            }
        });
        ibtn112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tap1Fragment11.setVisibility(View.GONE);
                tap2Fragment11.setVisibility(View.VISIBLE);
                ibtn112.setBackgroundColor(Color.parseColor("#ccffff"));
                ibtn111.setBackgroundColor(Color.parseColor("#33ffcc"));
                setTitle("soạn văn 11 tập 2");
                mIsFragment1=false;
            }
        });





        ///


        lvBaihoc = (ListView) findViewById(R.id.lv1);
        lvBaiHoc2 = (ListView) findViewById(R.id.lv2);

        mMangBaiHoc = new ArrayList<BaiHoc>();
        mMangBaiHoc2 = new ArrayList<BaiHoc>();

        mMangBaiHoc.add(new BaiHoc("Vào phủ Chúa Trịnh (Trích Thượng kinh kí sự)", R.drawable.hinh, "lop11tap1/tap11lop11.txt"));
        mMangBaiHoc.add(new BaiHoc("Từ ngôn ngữ chung đến lời nói cá nhân", R.drawable.hinh, "lop11tap1/tap12lop11.txt"));
        mMangBaiHoc.add(new BaiHoc("Viết bài làm văn số 1: Nghị luận xã hội", R.drawable.hinh, "lop11tap1/tap13lop11.txt"));
        mMangBaiHoc.add(new BaiHoc("Tự tình - Hồ Xuân Hương", R.drawable.hinh, "lop11tap1/tap14lop11.txt"));
        mMangBaiHoc.add(new BaiHoc("Câu cá mùa thu (Thu điếu)", R.drawable.hinh, "lop11tap1/tap15lop11.txt"));
        mMangBaiHoc.add(new BaiHoc("Phân tích đề, lập dàn ý bài văn nghị luận", R.drawable.hinh, "lop11tap1/tap16lop11.txt"));
        mMangBaiHoc.add(new BaiHoc("Thao tác lập luận phân tích", R.drawable.hinh, "lop11tap1/tap17lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Thương vợ - Trần Tế Xương", R.drawable.hinh, "lop11tap1/tap18lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Khóc Dương Khuê - Nguyễn Khuyến", R.drawable.hinh, "lop11tap1/tap19lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Vịnh khoa thi Hương - Trần Tế Xương", R.drawable.hinh, "lop11tap1/tap110lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Từ ngôn ngữ chung đến lời nói cá nhân (tiếp theo)", R.drawable.hinh, "lop11tap1/tap111lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Bài ca ngất ngưởng (Nguyễn Công Trứ)", R.drawable.hinh, "lop11tap1/tap112lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Bài ca ngắn đi trên bãi cát (Cao Bá Quát)", R.drawable.hinh, "lop11tap1/tap113lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Luyện tập thao tác lập luận phân tích", R.drawable.hinh, "lop11tap1/tap114lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Lẽ ghét thương (Nguyễn Đình Chiểu)", R.drawable.hinh, "lop11tap1/tap115lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Chạy giặc (Nguyễn Đình Chiểu)", R.drawable.hinh, "lop11tap1/tap116lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Bài ca phong cảnh Hương Sơn (Chu Mạnh Trinh)", R.drawable.hinh, "lop11tap1/tap117lop11.txt"));
        mMangBaiHoc.add(new BaiHoc("Viết bài làm văn số 2: Nghị luận văn học", R.drawable.hinh, "lop11tap1/tap118lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Văn tế nghĩa sĩ Cần Giuộc: Tác giả Nguyễn Đình Chiểu", R.drawable.hinh, "lop11tap1/tap119lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Văn tế nghĩa sĩ Cần Giuộc: Tác phẩm", R.drawable.hinh, "lop11tap1/tap120lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Thực hành về thành ngữ, điển cố", R.drawable.hinh, "lop11tap1/tap121lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Chiếu cầu hiền (Ngô Thì Nhậm)", R.drawable.hinh, "lop11tap1/tap122lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Xin lập khoa luật (Nguyễn Trường Tộ)", R.drawable.hinh, "lop11tap1/tap123lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Thực hành về nghĩa của từ trong sử dụng", R.drawable.hinh, "lop11tap1/tap124lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Ôn tập văn học trung đại Việt Nam", R.drawable.hinh, "lop11tap1/tap125lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Thao tác lập luận so sánh", R.drawable.hinh, "lop11tap1/tap126lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Khái quát văn học Việt Nam từ đầu thế kỉ XX đến cách mạng tháng Tám 1945 ", R.drawable.hinh, "lop11tap1/tap127lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Viết bài làm văn số 3: Nghị luận văn học", R.drawable.hinh, "lop11tap1/tap128lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Hai đứa trẻ (Thạch Lam)", R.drawable.hinh, "lop11tap1/tap129lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Ngữ cảnh", R.drawable.hinh, "lop11tap1/tap130lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Chữ người tử tù (Nguyễn Tuân)", R.drawable.hinh, "lop11tap1/tap131lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Luyện tập thao tác lập luận so sánh", R.drawable.hinh, "lop11tap1/tap132lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Luyện tập vận dụng kết hợp các thao tác lập luận phân tích và so sánh", R.drawable.hinh, "lop11tap1/tap133lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Hạnh phúc của một tang gia (Vũ Trọng Phụng)", R.drawable.hinh, "lop11tap1/tap134lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Phong cách ngôn ngữ báo chí", R.drawable.hinh, "lop11tap1/tap135lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Một số thể loại văn học: thơ, truyện", R.drawable.hinh, "lop11tap1/tap136lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Chí Phèo: Tác giả Nam Cao", R.drawable.hinh, "lop11tap1/tap137lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Phong cách ngôn ngữ báo chí (tiếp theo)", R.drawable.hinh, "lop11tap1/tap138lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Chí Phèo: Tác phẩm", R.drawable.hinh, "lop11tap1/tap139lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Thực hành về lựa chọn trật tự các bộ phận trong câu", R.drawable.hinh, "lop11tap1/tap140lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Bản tin", R.drawable.hinh, "lop11tap1/tap141lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Cha con nghĩa nặng (Hồ Biểu Chánh)", R.drawable.hinh, "lop11tap1/tap142lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Vi hành (Nguyễn Ái Quốc)", R.drawable.hinh, "lop11tap1/tap143lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Tinh thần thể dục (Nguyễn Công Hoan)", R.drawable.hinh, "lop11tap1/tap144lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Luyện tập viết bản tin", R.drawable.hinh, "lop11tap1/tap145lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Phỏng vấn và trả lời phỏng vấn", R.drawable.hinh, "lop11tap1/tap146lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Vĩnh biệt Cửu Trùng Đài (Nguyễn Huy Tưởng)", R.drawable.hinh, "lop11tap1/tap147lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Thực hành về sử dụng một số kiểu câu trong văn bản", R.drawable.hinh, "lop11tap1/tap148lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Tình yêu và thù hận (Uy-li-am Sếch-xpia)", R.drawable.hinh, "lop11tap1/tap149lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Ôn tập phần Văn học", R.drawable.hinh, "lop11tap1/tap150lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Luyện tập phỏng vấn và trả lời phỏng vấn", R.drawable.hinh, "lop11tap1/tap151lop101.txt"));
        mMangBaiHoc.add(new BaiHoc("Luyện tập phỏng vấn và trả lời phỏng vấn", R.drawable.hinh,"tap11aaaaaaaaaaaaa.txt"));



        /////////


        ///////
        mMangBaiHoc2.add(new BaiHoc("Lưu biệt khi xuất dương (Phan Bội Châu)", R.drawable.hinh, "lop11tap2/tap21lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Nghĩa của câu", R.drawable.hinh, "lop11tap2/tap22lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Viết bài làm văn số 5: Nghị luận văn học", R.drawable.hinh, "lop11tap2/tap23lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Hầu trời (Tản Đà)", R.drawable.hinh, "lop11tap2/tap24lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Nghĩa của câu (tiếp theo)", R.drawable.hinh, "lop11tap2/tap25lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Vội vàng (Xuân Diệu)", R.drawable.hinh, "lop11tap2/tap26lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Thao tác lập luận bác bỏ", R.drawable.hinh, "lop11tap2/tap27lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tràng Giang (Huy Cận)", R.drawable.hinh, "lop11tap2/tap28lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Luyện tập thao tác lập luận bác bỏ", R.drawable.hinh, "lop11tap2/tap29lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Viết bài làm văn số 6: Nghị luận xã hội", R.drawable.hinh, "lop11tap2/tap210lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Đây thôn Vĩ Dạ (Hàn Mạc Tử)", R.drawable.hinh, "lop11tap2/tap211lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Chiều tối (Hồ Chí Minh)", R.drawable.hinh, "lop11tap2/tap212lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Từ ấy (Tố Hữu)", R.drawable.hinh, "lop11tap2/tap213lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Lai tân (Hồ Chí Minh)", R.drawable.hinh, "lop11tap2/tap214lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Nhớ đồng (Tố Hữu)", R.drawable.hinh, "lop11tap2/tap215lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tương tư (Nguyễn Bính)", R.drawable.hinh, "lop11tap2/tap216lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Chiều xuân (Anh Thơ)", R.drawable.hinh, "lop11tap2/tap217lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tiểu sử tóm tắt", R.drawable.hinh, "lop11tap2/tap218lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Đặc điểm loại hình của tiếng Việt", R.drawable.hinh, "lop11tap2/tap219lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tôi yêu em (Pu-Skin)", R.drawable.hinh, "lop11tap2/tap220lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Bài thơ số 28 (Ta-go)", R.drawable.hinh, "lop11tap2/tap221lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Luyện tập viết tiểu sử tóm tắt", R.drawable.hinh, "lop11tap2/tap222lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Người trong bao (Sê-khốp)", R.drawable.hinh, "lop11tap2/tap223lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Thao tác lập luận bình luận", R.drawable.hinh, "lop11tap2/tap224lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Người cầm quyền khôi phục uy quyền (V.Huy-Gô)", R.drawable.hinh, "lop11tap2/tap225lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Luyện tập thao tác lập luận bình luận", R.drawable.hinh, "lop11tap2/tap226lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Về luân lí xã hội ở nước ta (Phan Châu Trinh)", R.drawable.hinh, "lop11tap2/tap227lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tiếng mẹ đẻ nguồn giải phóng các dân tộc bị áp bức (Nguyễn An Ninh)", R.drawable.hinh, "lop11tap2/tap228lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Ba cống hiến vĩ đại của Các Mác (Ph.Ăng-ghen)", R.drawable.hinh, "lop11tap2/tap229lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Phong cách ngôn ngữ chính luận", R.drawable.hinh, "lop11tap2/tap230lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Một thời đại trong thi ca (Hoài Thanh)", R.drawable.hinh, "lop11tap2/tap231lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Phong cách ngôn ngữ chính luận (tiếp theo)", R.drawable.hinh, "lop11tap2/tap232lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Một số thể loại văn học: kịch, văn nghị luận", R.drawable.hinh, "lop11tap2/tap233lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Luyện tập vận dụng kết hợp các thao tác lập luận", R.drawable.hinh, "lop11tap2/tap234lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Ôn tập phần văn học (Kì 2)", R.drawable.hinh, "lop11tap2/tap235lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Tóm tắt văn bản nghị luận", R.drawable.hinh, "lop11tap2/tap236lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Ôn tập phần tiếng Việt lớp 11 học kì 2", R.drawable.hinh, "lop11tap2/tap237lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Luyện tập tóm tắt văn bản nghị luận", R.drawable.hinh, "lop11tap2/tap238lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Ôn tập phần làm văn lớp 11 học kì 2", R.drawable.hinh, "lop11tap2/tap239lop11.txt"));
        mMangBaiHoc2.add(new BaiHoc("Ôn tập phần làm văn lớp 11 học kì 2", R.drawable.hinh,"tap11aaaaaaaaaaaaa.txt"));



        baihocAdapter = new BaihocAdapter(MainActivity11.this, R.layout.activity_tap1, mMangBaiHoc);
        lvBaihoc.setAdapter(baihocAdapter);
        lvBaihoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity11.this, DetailActivity.class);
                intent.putExtra("FILE", mMangBaiHoc.get(i).getNameFile());
                startActivity(intent);
            }
        });

        baihocAdapter2 = new BaihocAdapter(MainActivity11.this, R.layout.activity_tap2, mMangBaiHoc2);
        lvBaiHoc2.setAdapter(baihocAdapter2);
        lvBaiHoc2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity11.this, DetailActivity.class);
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
                Intent intent=new Intent(MainActivity11.this,information.class);
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


