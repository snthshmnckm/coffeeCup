import java.io.*;
class BufferedReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your data");
        String data = br.readLine();
        System.out.println("Your data:");
        System.out.println(data);
    }
}