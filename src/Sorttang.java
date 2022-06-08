import java.util.Comparator;

public class Sorttang implements Comparator<Sanpham> {




    @Override
    public int compare(Sanpham o1, Sanpham o2) {
        if(o1.getGia()>o2.getGia()){
            return 1;
        }else
            return -1;
    }
}