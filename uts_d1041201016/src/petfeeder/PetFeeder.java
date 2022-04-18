package petfeeder;
import java.util.Timer;
import java.util.TimerTask;

public class PetFeeder {
	int feedingtime;
	public void dispensePetFood(int feedingTime) {
		System.out.println("*dispensing pet food*");
	}
	
	public static void main(String[] args) {
		PetFeeder petfeeder = new PetFeeder();
		petfeeder.feedingtime = PetOwner.setFeedingTime();
		if (petfeeder.feedingtime == -1) { 
			System.out.println("Error, your input should be integer between 0 and 23");
			System.exit(1);
		}
		Pet dog = new Pet();
				
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int counter = 0;
			@Override
			public void run() {
				if (counter < 24) {
					System.out.println("Current time is "+counter+" o clock");
					if (counter == petfeeder.feedingtime) {
						petfeeder.dispensePetFood(petfeeder.feedingtime);
						dog.eat();
					}
					counter++;
				} else {
					counter = 0;
				}
			}
		};
		timer.schedule(task, 0, 100);
	};
}
