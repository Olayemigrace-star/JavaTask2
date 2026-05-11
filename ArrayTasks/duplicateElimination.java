import java.util.Scanner;
import java.util.Arrays;
public class duplicateElimination{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int[] array = new int [10];

int j = 0;
for(int i = 0; i < array.length; i++){
System.out.print("Enter a number ranging from 10 t0 100: ");
int value = input.nextInt();

if(value >100 && value < 10){
    System.out.print("Enter a valid number");
    }
else{
array[i] = value;
}

}
System.out.print(Arrays.toString(array));
}

}
