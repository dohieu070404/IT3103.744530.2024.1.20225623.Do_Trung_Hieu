package lap1;
	import javax.swing.JOptionPane;

	public class ChoosingOption {
	    public static void main(String[] args) {
	        int option = JOptionPane.showConfirmDialog(null,
	            "Do you wants to change to the first ticket");

	        JOptionPane.showMessageDialog(null, "Bạn đã chọn: " +
	            (option == JOptionPane.YES_OPTION ? "yes" : "no"));

	        System.exit(0);
	    }
	}


