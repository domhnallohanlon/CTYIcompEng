package ie.ctyi;

public class Ex03FizzBuzz {

	/**
	 * @author Domhnall
	 * @version 1.0
	 * @since 2013-6-26
	 *This program plays the game FizzBuzz from 0 - 100
	 */
		public static void main(String[] args) {
			for(int i=0; i<=100; i++){
				if((i%3==0) && (i%5 == 0))					//the && operator tests if BOTH conditions are met
					System.out.println("FizzBuzz");
				else if (i%3==0)							//the modulo sign, %, returns the remainder of dividing the number by 3
					System.out.println("Fizz");
				else if (i%5==0)
					System.out.println("Buzz");
				else System.out.println(i);					//if the number is divisible by neither 3 nor 5 just print the number
				System.out.print(" ");		
			}
			System.out.println();
		}
	}
	
