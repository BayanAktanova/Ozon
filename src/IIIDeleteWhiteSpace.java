import java.util.Scanner;

public class IIIDeleteWhiteSpace {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(s.replaceAll("[\\s]{2,}", " "));
    }
}