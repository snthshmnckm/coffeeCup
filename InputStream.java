import java.io.*;
class InputStream{
    public static void main(String[] args) {
        FileOutputStream fos = new FileOutputStream("Pic.jpg");
        FileInputStream fis = new FileInputStream("/home/san/Pictures/leo2049.jpeg");
        int i = fis.read();
        while(i != -1){
            fos.write(i);
            i = fis.read();
        }
        System.out.println("image created");
        fis.close();
        fos.close();
    }
}