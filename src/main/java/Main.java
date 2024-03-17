import java.util.*;
public class Bagrot {
	public static Scanner input = new Scanner (System.in);
	public static void q2B (Doctor [] doctors) { 
		int count = 0; double sum = 0;
		for (int i = 0; i < doctors.length; i++) {
			System.out.println("Enter rate for "+doctors[i].getName());
			double r = input.nextDouble();
			while (r != -1) {
				sum += r;
				count++;
				System.out.println("Enter rate for "+doctors[i].getName());
				r = input.nextDouble();
			}
			doctors[i].setRate(sum/count);
			sum = 0;
			count = 0;
		}
	}
	public static void main(String[] args) {
		Doctor a = new Doctor ("Ron","Nose",0);
		Doctor b = new Doctor ("Gal","eyes",0);
		Doctor [] arr = {a,b};
		q2B(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getRate());
		}
	}

}
