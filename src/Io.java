import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Io {
    public void write(List<Sanpham> sp){
        File file=new File("Qlsp.txt");

        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(sp);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("1");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Sanpham> reader(){
        try {
            FileInputStream fileInputStream=new FileInputStream("Qlsv.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            return(ArrayList<Sanpham>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("2");
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }
        return new ArrayList<>();
    }
}