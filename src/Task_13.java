import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str1 = in.nextLine();
        System.out.print("Введите вторую строку: ");
        String str2 = in.nextLine();
if (str1.length() > str2.length()) {
    System.out.print("Строка с большей длиной: " + str1); }
   else if (str1.length() < str2.length()) {
        System.out.print("Строка с большей длиной: " + str2);}
   else  {
    System.out.print("Длины строк равны");
    }
}
}
