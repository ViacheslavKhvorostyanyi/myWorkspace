public class MatrixPrint {
	public static void main(String args[]){
		//PUT YOUR CODE HERE
        int m = 5; 
        String mx[][] = new String [m][m];                      
         mx[0][0] = " *";
         mx[0][1] = " 2";
         mx[0][2] = " 3";
         mx[0][3] = " 4";
         mx[0][4] = " *"; 
         mx[1][0] = " 6";
         mx[1][1] = " *"; 
         mx[1][2] = " 8";
         mx[1][3] = " *"; 
         mx[1][4] = "10";
         mx[2][0] = "11";
         mx[2][1] = "12";
         mx[2][2] = " *"; 
         mx[2][3] = "14";
         mx[2][4] = "15";
         mx[3][0] = "16";
         mx[3][1] = " *";
         mx[3][2] = "18";
         mx[3][3] = " *";
         mx[3][4] = "20";
         mx[4][0] = " *";
         mx[4][1] = "22";
         mx[4][2] = "23";
         mx[4][3] = "24";
         mx[4][4] = " *";
       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++)         
                System.out.print(mx[i][j]+" ");
            System.out.println();          
        }
		//PUT YOUR CODE HERE
	}
}
      
      