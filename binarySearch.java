/*
 * binarySearch.java
 * 
 * Copyright 2017 Unknown <slavapro@localhost>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import  java.util.Scanner;

public class binarySearch {
	
	
	public static void main(String[] args) {

		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		System.out.println("input value:");
		Scanner input = new Scanner(System.in);
		int numberToFind = input.nextInt();
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

