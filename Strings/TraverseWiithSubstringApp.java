public class TraverseWiithSubstringApp {
    public static void main(String[] args) {
        String s = "Athens";

        for ( int i =0;  i <s.length(); i++){
            System.out.print(s.substring(i,i+1));
        }
    }
}
