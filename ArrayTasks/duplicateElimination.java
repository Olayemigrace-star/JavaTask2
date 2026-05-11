import java.util.Scanner;
public class duplicateElimination{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int[] array = new int [10];
int[] number = new int[10];
int j = 0;
for(int i = 0; i < array.length; i++){
number[j] = array[i];
j++;
System.out.print("Enter a number ranging from 10 t0 100: ");
int value = input.nextInt();

}
System.out.print(number);
}

}
