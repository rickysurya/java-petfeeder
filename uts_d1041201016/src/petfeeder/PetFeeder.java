package petfeeder;
import java.util.Timer;
import java.util.TimerTask;

public class PetFeeder {
	public void dispensePetFood(int feedingTime) {
		System.out.println("*dispensing pet food*");
	}
	
	public static void main(String[] args) {
		int feedingtime = PetOwner.setFeedingTime();
		PetFeeder petfeeder = new PetFeeder();
		Pet dog = new Pet();
				
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int counter = 0;
			@Override
			public void run() {
				if (counter < 24) {
					System.out.println("Current time is "+counter+" o clock");
					if (counter == feedingtime) {
						petfeeder.dispensePetFood(feedingtime);
						dog.eat();
					}
					counter++;
				} else {
					counter = 0;
					System.out.println("Current time is "+counter+" o clock");
					counter++;
				}
				
			}
			
		};
		timer.schedule(task, 0, 500);
	};
}
