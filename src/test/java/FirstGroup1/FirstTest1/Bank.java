package FirstGroup1.FirstTest1;

public abstract class Bank {
		abstract void saving(); //method signature
		abstract void current();
		abstract void salary();
		abstract void joint();
		public void branchDetails(){
		System.out.println("chennai");
		}
		}
		//super class//

		public class AxisBank extends Bank {
		public void saving() { // method signature
		System.out.println("saving regular"); // business logic
		}
		public void current() {
		System.out.println("current");
		}
		public void salary() {
		System.out.println("salary");
		}
		public void joint() {
		System.out.println("joint");
		}
		public static void main(String[] args) {
		AxisBank info = new AxisBank();
		info.branchDetails();
		info.salary();
		info.saving();
		}}

