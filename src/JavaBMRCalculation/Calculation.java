package JavaBMRCalculation;

public class Calculation {

	public double calulateBMR(Person person) {

		/*
		 * The Harris-Benedict formula (BMR based on total body weight) Men: BMR = 66 +
		 * (13.7 X wt in kg) + (5 X ht in cm) - (6.8 X age in years) Women: BMR = 655 +
		 * (9.6 X wt in kg) + (1.8 X ht in cm) - (4.7 X age in years)
		 */
		if (person.getSex().equalsIgnoreCase("male")) {
			return 66 + 6.23f * person.getWeight() + 4.7f * person.getHeight() - 6.8f * person.getAge();
		} else {
			return 655 + 4.35f * person.getWeight() + 12.7f * person.getHeight() - 4.7f * person.getAge();
		}
	}

	public double calculateBMI(Person person) {

		/*
		 * 1 inch = 2.54 cm. 1 kilogram = 2.2 lbs. The calculation for the BMI is in the
		 * English measurements system BMI = (weight in pounds) / (Height in inches)2 *
		 * 703
		 */
		double bmi = ((person.getWeight() * 2.2 * 703) / ((Math.pow(person.getHeight() / 2.2, 2))));

		return bmi;
	}

	public double calculateBMRWithactivitylevel(Person person, double bmr) {

		switch (person.getActivitylevel()) {

		case 1:
			return 1.2 * bmr; // Sedentary = BMR X 1.2 (little or no exercise, desk job)

		case 2:
			return 1.375 * bmr;// Lightly active = BMR X 1.375 (light exercise/sports 1-3 days/wk)

		case 3:
			return 1.55 * bmr;// Moderately active = BMR X 1.55 (moderate exercise/sports 3-5 days/wk)

		case 4:
			return 1.725 * bmr;// Very active = BMR X 1.725 (hard exercise/sports 6-7 days/wk)

		case 5:
			return 1.9 * bmr;// Extra active = BMR X 1.9 (hard daily exercise/sports & physical job or 2Xday
								// training, i.e marathon, contest etc.)

		default:
			return 0;

		}

	}

	public void getActivityLevel(Person person) {

		if (person.getActivitylevel() == 1) {
			System.out.println("You are Sedentary active.");
		} else if (person.getActivitylevel() == 2) {
			System.out.println("You are Lighly active.");
		} else if (person.getActivitylevel() == 3) {
			System.out.println("You are very active.");
		} else if (person.getActivitylevel() == 4) {
			System.out.println("You are extra active.");
		} else if (person.getActivitylevel() == 5) {
			System.out.println("You are very active.");
		}
	}

	public void getBMICategory(Person person, double bmi) {
		if (bmi <= 18.5) {
			System.out.println("You are Underweight.");
		} else if (bmi == (18.5 - 24.9)) {
			System.out.println("You are Normal weight .");
		} else if (bmi == (25 - 29.9)) {
			System.out.println("You are Overweight");
		} else if (bmi >= 30) {
			System.out.println("You are Obese.");
		}

	}

}
