package test;
public class Doctor {
	private String name;
	private String specialization;
	private double rate;
	public Doctor  (String name,String specialization,double rate) {
		this.name = name;
		this.specialization = specialization;
		this.rate = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String toString() {
		return "Doctor [name=" + name + ", specialization=" + specialization + ", rate=" + rate + "]";
	}

}
