
public class question1 {
		  public static void main(String[] args) {

		    int num = 29;
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for non prime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}

make a class having two functions for determining whether input integer in even or prime input take code in java

public class Check_Prime {
	public void check_prime(int number) {
		    boolean flag = false;
		    for (int i = 2; i <= number / 2; ++i) {
		      if (number % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(number+"Is prime");
		    else
		      System.out.println(number + " is not a prime number.");
		
	}
}
