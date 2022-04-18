package petfeeder;
import javax.swing.JOptionPane;

public class PetOwner {
	public static int setFeedingTime() {
		int feedingTime = Integer.parseInt(JOptionPane.showInputDialog("Enter your feeding time (0-23):"));
		if (feedingTime >= 0 && feedingTime <=23){
			return feedingTime;
		} else {
			return -1;
		}
		
	}
}
