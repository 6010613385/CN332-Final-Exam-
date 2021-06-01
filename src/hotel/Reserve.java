package hotel;

public class Reserve {

	private int guest_num = 0;
	private int bed_num = 0;
	private int night_num = 0;
	private double cost = 0;
	private boolean wifi_service = false;
	private Payment payment;


	public Reserve(int guest, int bed, int night, boolean wifi) {
		guest_num = guest;
		bed_num = bed;
		night_num = night;
		wifi_service = wifi;
	}

	public void reserve() {
		for (int i = 1; i <= guest_num; i++) {
			cost += 100;
		}

		if (bed_num == 1) {
			for (int i = 1; i <= night_num; i++) {
				cost += 250;
				if (wifi_service == true) {
					cost += 50;
				}
			}
		} else if (bed_num == 2) {
			for (int i = 1; i <= night_num; i++) {
				cost += 500;
				if (wifi_service == true) {
					cost += 50;
				}
			}
		} else {
			System.out.println("invalid number of bed.");
			System.exit(0);
		}
	}
	
	public void getCost() {
		System.out.println("Total Cost for"+guest_num+"guest ,"+bed_num+"and stay "+night_num+"night.");
		System.out.println("Total Cost"+cost);
    }
}
