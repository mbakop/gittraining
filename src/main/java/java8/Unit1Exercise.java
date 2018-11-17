package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Lastname1", "Firstname1", "3"),
				new Person("Lastname4", "Firstname4", "6"),
				new Person("Lastname2", "Firstname2", "4"), new Person("CLastname3", "Firstname3", "5"));

		// Step 1: sort List by Lastname
        persons.sort(createComparator());
       
        
		// Step 2: Create a Method that prints all elements in the list

        for (Person person : persons) {
			System.out.println(person.toString());
		}  
        
		// Step 3: Create a Method that print all person that has lastname beginning
		// with c
        
        for (Person person : persons) {
			if (person.getLasName().startsWith("C")) {
				System.out.println(person.toString());
			}
		}
        
	}

	private static Comparator<Person> createComparator() {
		return new Comparator<Person>() {

			@Overrideno
			public int compare(Person person1, Person person2) {
				int result = 0;
				if(new Integer(person1.getAge()) >= new Integer(person2.getAge())) {
					result = -1;
				}
				return result;
			}
		};
	}
}
