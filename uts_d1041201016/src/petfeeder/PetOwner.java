package petfeeder;
import javax.swing.JOptionPane;

public class PetOwner {
	public static int setFeedingTime() {
		int feedingTime = Integer.parseInt(JOptionPane.showInputDialog("Enter your feeding time (1-24):"));
		return feedingTime;
	}
}
