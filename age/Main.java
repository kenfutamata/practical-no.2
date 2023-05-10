import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int rows;
        System.out.print("Enter number of rows: "); 
        rows=input.nextInt(); 
        cap j1 = new cap(rows); 
        //j1.row1();
        //j1.row2();
        j1.row3();
    }
}
