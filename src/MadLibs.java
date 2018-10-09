import java.util.Scanner;

public class MadLibs 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a person: ");
		String person = keyboard.nextLine();
		System.out.print("Please enter a place: ");
		String place = keyboard.nextLine();
		System.out.print("Please enter a adjective: ");
		String adjective = keyboard.nextLine();
		System.out.print("Please enter the same place you entered before: ");
		String place2 = keyboard.nextLine();
		System.out.print("Please a plural noun: ");
		String plunoun = keyboard.nextLine();
		System.out.print("Please enter a adjective: ");
		String adjective2 = keyboard.nextLine();
		System.out.print("Please enter a plural noun: ");;
		String plunoun2 = keyboard.nextLine();
		System.out.print("Please enter a place: ");
		String place3 = keyboard.nextLine();
		System.out.print("Please enter a action verb: ");
		String verb = keyboard.nextLine();
		System.out.print("Please enter a plural noun: ");
		String plunoun3 = keyboard.nextLine();
		System.out.print("Please input a plural noun: ");
		String plunoun4 = keyboard.nextLine();
		System.out.print("Please input a noun: ");
		String noun = keyboard.nextLine();
		System.out.print("Please enter a action verb: ");
		String verb2 = keyboard.nextLine();
		System.out.print("Please enter a action verb: ");;
		String verb3 = keyboard.nextLine();
		System.out.print("Please enter a adjective: ");
		String adjective3 = keyboard.nextLine();
		System.out.println("Last summer, my mom and dad took me and " + person + " on a trip to "+ place + ".");
		System.out.println("The wather there is very " + adjective + "!");
		System.out.println("Northern " + place2 + " has many " + plunoun + ", and they make " + adjective2 + " " + plunoun2 + " there.");
		System.out.println("Many people also go to " + place3 + " to " + verb + " or see the " + plunoun3 + ".");
		System.out.println("The people that live there love to eat " + plunoun4 + " and they are very proud of their big " + noun + ".");
		System.out.println("They also like to " + verb2 + " in the sun and swim in the " + verb3 + "!");
		System.out.println("It was a really " + adjective3 + " trip!");

		
	}

}
