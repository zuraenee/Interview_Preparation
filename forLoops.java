import java.util.*;
public class forLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total1 = 0; //enhanced for loop
        int total2 = 0; //normal for loop
        ArrayList<Integer> array = new ArrayList<>();
        boolean leave = false;
        while (!leave) {
            System.out.println("insert values for array :");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                array.add(num);
            } else {
                System.out.println("Enter an integer please");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();
           while (!leave) {
               System.out.println("again? (yes/no)");
               String inputAgain = scanner.nextLine().toLowerCase();

               if (inputAgain.equals("no")) {
                   leave = true;
               } else if (inputAgain.equals("yes")) {
                   break;
               } else {
                   System.out.println("error");
               }
           }

        }
        for(int num : array){
            total1 += num;
            System.out.print(num + " ");
        }
        System.out.println("array : " + total1);

        for (int i = 0; i < array.size(); i++) {
            total2 += array.get(i);
            System.out.print(array.get(i) + " ");
        }
        System.out.println("array : " + total2);
    }
}

