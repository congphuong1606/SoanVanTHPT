package soanvan.ebook.vn.soanvan;

/**
 * Created by MyPC on 14/04/2017.
 */

public class BaiHoc   {
    private String mTenBai;
    private Integer mHinh;
    private String mNameFile;

    public BaiHoc(String mTenBai, Integer mHinh,String nameFile) {
        this.mTenBai = mTenBai;
        this.mHinh = mHinh;
        this.mNameFile=nameFile;
    }

    public String getmTenBai() {
        return mTenBai;
    }

    public void setmTenBai(String mTenBai) {
        this.mTenBai = mTenBai;
    }

    public Integer getmHinh() {
        return mHinh;
    }

    public void setmHinh(Integer mHinh) {
        this.mHinh = mHinh;
    }

    public String getNameFile() {
        return mNameFile;
    }

    public void setNameFile(String nameFile) {
        this.mNameFile = nameFile;
    }
}