import java.util.*;
class FileReader {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader();
        int i = fr.read();
        while(i != -1) {
            System.out.println((char)i);
            i =fr.read();
        }
    }
}