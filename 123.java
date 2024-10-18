import java.util.Scanner; 
public class DivisibleByFive { 
        public static void main(String[] args) { 
           Scanner scanner = new Scanner(System.in); 
              // Запрашиваем у пользователя начальное и конечное числа 
             System.out.print("Введите начальное число: ");
             int start = scanner.nextInt(); 

            System.out.print("Введите конечное число: "); 
            int end = scanner.nextInt(); 
           // Выводим числа, которые делятся на 5 
           System.out.println("Числа от " + start + " до " + end + ", которые делятся на 5:");
          for (int number = start; number <= end; number++) {
               if (number % 5 == 0) { 
                       System.out.println(number);
                 }  
          }
           scanner.close(); 
     }
 }
