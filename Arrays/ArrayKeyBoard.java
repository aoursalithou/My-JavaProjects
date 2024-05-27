import java.util.Scanner;

class ArayKeyBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ages = new int [5];

        for (int i=0; i< ages.length; i++) {
            System.out.println("dwse arithmo");

            ages [i] = sc.nextInt();

        }
        for (int i=0; i< ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}