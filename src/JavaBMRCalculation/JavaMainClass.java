package JavaBMRCalculation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JavaMainClass {

	public static void main(String[] args) {
		
				
				Person p1 = new Person();
				Scanner b = new Scanner(System.in);

				System.out.println("Enter your name:");
				
				p1.setName(b.nextLine());

				System.out.println("Enter sex  male or  female");
				p1.setSex(b.next());

				System.out.println("Enter age in years:");
				p1.setAge(b.nextInt());

				System.out.println("Enter weight in kg:");
				p1.setWeight(b.nextDouble());

				System.out.println("Enter height in cm:");
				p1.setHeight(b.nextDouble());

				System.out.println("Sedentary = BMR X 1.2 (little or no exercise, desk job) Press 1 \n"
						+ "Lightly active = BMR X 1.375 (light exercise/sports 1-3 days/wk)" + "Press 2\n"
						+ "Moderately active = BMR X 1.55 (moderate exercise/sports 3-5 days/wk)" + "Press 3\n"
						+ "Very active = BMR X 1.725 (hard exercise/sports 6-7 days/wk)" + "Press 4\n"
						+ "Extra active = BMR X 1.9 (hard daily exercise/sports & physical job or 2X"
						+ "day training, i.e marathon, contest etc\"Press 5\n");
				
				
				p1.setActivitylevel(b.nextInt());

				System.out.println("======pulling the data for person 2 ==============");
				
				Person p2 = new Person();
				
				p2.setActivitylevel(2);
				p2.setAge(24);
				p2.setHeight(180);
				p2.setName("Rabin");
				p2.setRv(1);
				p2.setSex("male");
				p2.setWeight(60);
				
				List<Person> personList = new ArrayList<Person>();
				
				personList.add(p1);
				personList.add(p2);
				
				for(Person p : personList) {
				
				Calculation calculation = new Calculation();
				
				double bmrValue = calculation.calulateBMR(p);

				double bmiValue = calculation.calculateBMI(p);
				
				double bmrWithActivityLevel = calculation.calculateBMRWithactivitylevel(p, bmrValue);
				
				
				
				System.out.println("===============output===================");
				
				System.out.println("Your name is " + p.getName());
				System.out.println("You are " + p.getSex());
				System.out.println("You are " + p.getAge() + " years old.");
				System.out.println("You height is  " + p.getHeight() + "cm");
				System.out.println("You weight " + p.getWeight() + "lbs");

				

				System.out.println("Your bmr is " + bmrValue + " Calories/day");

				System.out.println("Your BMI is " + bmiValue);
				System.out.println("your TDEE is " +  bmrWithActivityLevel);
				
				calculation.getActivityLevel(p);
				calculation.getBMICategory(p, bmiValue);
			}
			}

		

	}


