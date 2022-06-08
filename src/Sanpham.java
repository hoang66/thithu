import java.io.Serializable;

public class Sanpham extends Qlsp implements Serializable {
    String masanpham;
    String ten;
    double gia;
    String soluong;
    String mota;

    public Sanpham() {
    }

    public Sanpham(String masanpham, String ten, double gia, String soluong, String mota) {
        this.masanpham = masanpham;
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
        this.mota = mota;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "Sanpham{" +
                "masanpham='" + masanpham + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", soluong='" + soluong + '\'' +
                ", mota='" + mota + '\'' +
                '}';
    }
}
