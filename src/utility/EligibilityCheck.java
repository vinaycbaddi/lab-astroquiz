package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{

	
	public boolean checkUser(User user) {
		int age=user.getAge();
		String Country=user.getCountry();
		int height=user.getHeight();
		int weight= user.getWeight();
		
		if(age>=18&&age<=35&&height>=155 &&height<=170&&weight>=55 &&weight <= 90&&Country.equals("ProGrad")){
			return true;
		}
		
		return false;
	}

	
	public boolean checkQuizAnswer(String points) {
		int p=Integer.parseInt(points);
		if(p>80) {
			return true;
		}
		return false;
	}

	
	public boolean basicEligibilityCheck(User user) {
		if(checkUser(user)) {
			return true;
		}
		return false;
	}
	
}






