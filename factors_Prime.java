import java.util.*;

class factors_Prime {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
        System.out.println("Enter any Number: ");        
        int N = num.nextInt();
        int i;
        int count=0;
        num.close();      
        System.out.println();
        System.out.println("Factors of " + N + ":");        
        for (i=1; i<=N; i++) {
            if (N % i == 0) {
                System.out.print(i + ", ");
                count++;
            }
			if (count>2) {
                break;
			}
        }
        System.out.println();
		if (count==2) {
            System.out.println();
            System.out.println(N + " is Prime");
            System.out.println();
		}
		else {
            System.out.println();
			System.out.println(N + " is not Prime");
            System.out.println();
		}
	}
}