import java.util.Scanner;

public class ReverseTheArray {
    public static int[] reverseArray(int []array,int size){
        int []answer=new int[size];
        int j=0;
        for(int i=size-1;i>=0;i--){
            answer[j]=array[i];
            j++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        int answer[]=reverseArray(array,size);
        System.out.println("The Reversed array is: ");
        for(int iterator=0;iterator<size;iterator++){
            System.out.print(answer[iterator]+" ");
        }


    }
}
