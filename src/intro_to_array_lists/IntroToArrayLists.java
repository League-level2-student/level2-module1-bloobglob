package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> familyMembers = new ArrayList<String>();
		//2. Add five Strings to your list
		familyMembers.add("Nathan");
		familyMembers.add("Lucas");
		familyMembers.add("Linda");
		familyMembers.add("Bing");
		familyMembers.add("Sophie");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < familyMembers.size(); i++) {
			System.out.println(familyMembers.get(i));
		}
		System.out.println();
		//4. Print all the Strings using a for-each loop
		for(String s : familyMembers){
			System.out.println(s);
		}
		System.out.println();
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < familyMembers.size(); i++) {
			if(i%2==0) {
				System.out.println(familyMembers.get(i));
			}
		}
		System.out.println();
		//6. Print all the Strings in reverse order.
		for (int i = familyMembers.size()-1; i >= 0; i--) {
			System.out.println(familyMembers.get(i));
		}
		System.out.println();
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < familyMembers.size(); i++) {
			if(familyMembers.get(i).contains("e"))
			System.out.println(familyMembers.get(i));
		}
	}
}
