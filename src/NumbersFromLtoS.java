import java.util.Scanner;
public class NumbersFromLtoS {
    public static void main(String[] args) {

        int a, b, c;
//define scanner
        Scanner doa = new Scanner(System.in);
//get value from user
        System.out.println("Enter 'a' number: ");
        a = doa.nextInt();

        System.out.println("Enter 'b' number: ");
        b = doa.nextInt();

        System.out.println("Enter 'c' number: ");
        c = doa.nextInt();
//calculating
        if ( ( a < b ) && ( a < c )) { //the smallest number a
        if (b < c) {
            System.out.println("a<b<c");
        } else {
            System.out.println("a<c<b");
        }
        }else if ( ( b < a ) && ( b < c )) { //the smallest number b
            if ( a < c ){
                System.out.println("b<a<c");

            }else{
                System.out.println("b<c<a");
            }
        }else{ //the smallest number c
            if ( b < a ) {
                System.out.println("c<b<a");
            }else{
                System.out.println("c<a<b");
            }
        }

    }
}
