import java.util.Scanner;

public class SGS {
    public static void main(String args[]) {
        System.out.println("***Hello to Everyone!!!*** ");
        float sum;

        System.out.println("Enter the marks of Hindi ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        System.out.println("Enter the marks of Maths ");
        Scanner s1 = new Scanner(System.in);
        int x1 = s1.nextInt();

        System.out.println("Enter the markso of Science ");
        Scanner s2 = new Scanner(System.in);
        int x2 = s2.nextInt();

        System.out.println("Enter the marks of English");
        Scanner s3 = new Scanner(System.in);
        int x3 = s3.nextInt();

        System.out.println("Enter the marks of Social Science ");
        Scanner s4 = new Scanner(System.in);
        int x4 = s4.nextInt();

        sum = (x + x1 + x2 + x3 + x4) / 5;
        System.out.println("Result is here " + sum + " percentage ");
        // **checking grade */
        if (sum > 90 && sum <= 100) {
            System.out.println("Grade +A" + " Student is excellent ");
        }

        else if (sum > 80 && sum <= 90) {
            System.out.println("Grade A" + " Student is good Student ");
        } else if (sum > 70 && sum <= 80) {
            System.out.println("Grade +B" + " Student is nice");
        } else if (sum > 60 && sum <= 70) {
            System.out.println("Grade B" + "  Average Student ");
        } else if (sum > 50 && sum <= 60) {
            System.out.println("Grade C" + " below Average ");
        } else if (sum > 40 && sum <= 50) {
            System.out.println("Grade D" + " Slow learner");
        } else if (sum > 33 && sum <= 40) {
            System.out.println(" pass from cornor +E" + " ONLY Pass");
        }

        else {
            System.out.println("fail with E grade" + " poor student");
        }

    }

}
