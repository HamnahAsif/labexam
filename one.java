
public class one {
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


