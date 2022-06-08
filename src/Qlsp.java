import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qlsp {
    static Io ghi=new Io();
   static   ArrayList<Sanpham> sp = ghi.reader();

    static Scanner sc = new Scanner(System.in);

    public void Menu() {
        System.out.println("1.xem danh sach");
        System.out.println("2.them moi");
        System.out.println("3.cap nhat");
        System.out.println("4.xoa");
        System.out.println("5.sap xep");
        System.out.println("6.tim kiem san pham co gia tri max nhat");
        System.out.println("7.doc tu file");
        System.out.println("8.ghi tu file");
        System.out.println("9.thoat");
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                show();
                break;
            case 2:
                add(Taosp());
                break;
            case 3:
                System.out.println("chinh sua san pham");
                String masanpham=sc.nextLine();
                edit(check( masanpham),Taosp());
                break;
            case 4:
                System.out.println("xoa");
                String masanpham1=sc.nextLine();
                delete(check(masanpham1));
                break;
            case 5:
                sapxep();
                break;
            case 6:
                max();
                break;
            case 7:
                ghi.reader();
                break;
            case 8:
                ghi.write(sp);
                break;
            case 9:
                out();
                break;
        }
    }


    public Sanpham Taosp() {
        System.out.println("ma");
        String masanpham = sc.nextLine();
        System.out.println("ten");
        String ten = sc.nextLine();
        System.out.println("gia");
        double gia = Double.parseDouble(sc.nextLine());
        System.out.println("so luong");
        String soluong = sc.nextLine();
        System.out.println("mo ta");
        String mota = sc.nextLine();
        return new Sanpham(masanpham, ten, gia, soluong, mota);

    }

    public void add(Sanpham sp1) {
        sp.add(sp1);
    }

    public void show() {
        for (Sanpham x : sp
        ) {
            System.out.println(x);
        }
    }

    public int check(String masanpham) {
        int index = -1;
        for (int i = 1; i < sp.size(); i++) {
      if(sp.get(i).getMasanpham().equals(masanpham)){
          return index;
      }
        }
        return index;
    }
    public void edit(int index,Qlsp qlsp){
        sp.set(index, (Sanpham) qlsp);
    }
    public void delete(int index){sp.remove(index);}
    public void out(){
        System.out.println();
        System.exit(Integer.parseInt("thoat chuong trinh"));
    }
    public void sapxep(){
        System.out.println("1 sap xep tang");
        System.out.println("2 sap xep giam");
        System.out.println("menu");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:sp.sort(new Sorttang());
            break;

            case 2:sp.sort((new Sortgiam()));
            break;
            case 3:
                Menu();
                break;
        }
    }
    public void max(){
        sp.sort(new Sorttang());
        int index = sp.size()-1;
        System.out.println(sp.get(index));
    }
    }
