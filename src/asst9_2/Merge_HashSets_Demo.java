/*9.2) Write a program to copy all the elements from set2 to set1 so that the set1 becomes the union 
of set1 and set2.  */

package asst9_2;

/*HashSet provides a member function addAll() i.e.

public boolean addAll(Collection<? extends E> c)
It provides a functionality to add a collection into to a HashSet. But this Collection should be of Same Type as of 
HashSet or of its Base Class.

How addAll() works

It will iterate over the given Collection one by one and add each element individually in the Hashset. 
Also, if it has added any element then it will return true else returns false.*/

import java.util.HashSet;

public class Merge_HashSets_Demo {

	public static void main(String[] args) {
		
		// Create a new HashSet of String objects
		HashSet<String> setOfStrs1 = new HashSet<>();
		
		// Adding elements in HashSet1
		setOfStrs1.add("Red");
		setOfStrs1.add("Orange");
		setOfStrs1.add("Yellow");
		setOfStrs1.add("Green");
		
		System.out.println("Colors in Set1 are: " + setOfStrs1);
		
		// Create a new HashSet of String objects
		HashSet<String> setOfStrs2 = new HashSet<>();
		
		// Adding elements in HashSet2
		setOfStrs2.add("Cyan");
		setOfStrs2.add("Blue");
		setOfStrs2.add("Indigo");
		setOfStrs2.add("Violet");
		System.out.println("Colors in Set2 are: " + setOfStrs2);
 
		// Merge Set 2 in Set 1
		boolean bResult = setOfStrs1.addAll(setOfStrs2);
				
		if(bResult)
		{
			System.out.println("\n****** Merging of Set 1 & Set 2 Successfull ******* \n");
		}
		
		System.out.println("Total Colors in Set1 after merging with Set2: \n" + setOfStrs1);
		
	}
 
}