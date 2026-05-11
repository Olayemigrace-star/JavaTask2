import java.util.Scanner;
import java.util.Arrays;
public class duplicateElimination{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int[] array = new int [10];


for(int i = array.length -1; i >= 0; i--){
System.out.print("Enter an integer: ");

int value = input.nextInt();
array[i] = value;
}
System.out.print(Arrays.toString(array));
}
}

