/*
 * array_task.java
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

import java.util.Arrays;
public class array_task {	
	public static void main (String args[]) {
		
		int[] arr;
		arr = new int[2];
		System.out.println(arr.length);
		arr[0] = 4;
		arr[1] = arr[0] + 5;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.print( arr[i]+" ");
		}
		
		 
	}
}

