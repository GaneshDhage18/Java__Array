import java.util.Scanner;
class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] marks = new int[n];

        //printing the array using for loop
        for(int i=0; i<n-1; i++)
        {
            marks[i] = sc.nextInt();
            System.out.println(marks[i]);
        }

        for(int i=0; i<=n-1; i++)
        {
            System.out.println(marks[i]);
        }

        //printing the array in reverse order
        for(int i=n-1; i>=0; i--)
        {
            System.out.println(marks[i]);
        }

        //printing the array using for-each loop
        for(int element:marks)
        {
            System.out.println(element);
        }
        sc.close();


    }
    
}
