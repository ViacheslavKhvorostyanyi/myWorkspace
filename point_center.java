/*
 * point_center.java
 * 
 * Copyright 2017 Viacheslav Khvorostyanyi <slavafh@gmail.com>
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


public class point_center
 {
	
	public static void main (String args[]) {
	
 /*	
    Point p = new Point();
	p.x = 3;
	p.y = 6;
//	*/
		
	}
}

class Point {
	
	int x;
	int y;
	
	Point() {
	this(0,0);
	}	
	Point(int x,int y) {
		this.x = x;
		this.y = y;
		}
	public void printPoint() {
		System.out.println("(" + x +"," + y +")");
	}
	Point center(Point other){
		return new Point((x+other.x)/2,(y+other.y)/2);
	}
	
} 


		
