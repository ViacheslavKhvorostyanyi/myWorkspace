//import  java.util.Scanner;

public class BinarySearch {
	
	
	public static void main(String[] args) {

		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        //
        boolean swapped = true;
int z = 0;
while (swapped){
   swapped = false;
   for (int i = 0; i < data.length - 1 - z; i++) {
      if (data[i] > data[i + 1]) {
         int a = data[i];
         data[i] = data[i + 1];
         data[i + 1] = a;
         swapped = true;
                       }
                  }
				z++;
			}
        //
		//Scanner input = new Scanner(System.in);
		int numberToFind = 10; //input.nextInt();
        int i = 0;
        int j = data.length-1;
        int m = j/2;
       
        while(data[m]!=numberToFind & i < j){
            if(numberToFind > data[m]){
                i = m+1;
                m =((i+j)/2);
                }
            else {
                j = m-1;
                m =((i+j)/2);
                }
             
        }
        if (data[m] == numberToFind){
		
    System.out.println(m);
    }
    else {
    System.out.println(-1);
    
        }
	}
}
