/*
 * boolen.java
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


public class boolean_task {
	
	public static void main (String args[]) {
		
		String a = new String("Wow");
		String b = new String("Wow");
		String sameA = a;
		
		boolean r1 = a==b;
		boolean r2 = a.equals(b);
		boolean r3 = a==sameA;
		System.out.println(r1+" "+r2+" "+r3);
	}
}

