import  java.util.Scanner;
public class Tim_max_trong_mang {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sr =new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sr.nextInt();
            if (size>20){
                System.out.println("Size should not exceed 20");
            }
        }while (size>20);
        System.out.println();
        array= new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("Enter element "+(i+1)+" : ");
            array[i]=sr.nextInt();
            i++;
        }
        System.out.println();
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);

    }
}
