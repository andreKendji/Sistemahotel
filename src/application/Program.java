package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Gest;
import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		/*Rooms[] vect = new Rooms[10];*/
		List<Gest> gests = new ArrayList<>();
		
		System.out.print("How many rooms will be rented? ");
		int rented = sc.nextInt();
		for(int i=1 ; i <= rented ; i++) {
			
			System.out.println("Rent #" + (i) +":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			name = sc.nextLine();
			
			System.out.print("Email:");
			String email = sc.nextLine();
			
			System.out.print("Phone:");
			int phone = sc.nextInt();
			
			System.out.print("Room:");
			Integer room = sc.nextInt();
			Gest gest = new Gest(name, email, phone, new Rooms(room));
			//vect[room]=new Rooms(name, email, room);
			gests.add(gest);
		}
		
		for(Gest guest : gests) {
			System.out.println(guest);
		}
		
		/*for(int i=0; i<10 ; i++) {
			
			if(vect[i] != null) {
			
			System.out.println(i + ":" + vect[i]);*/	
			
		
		
		
		sc.close();

	}

}
