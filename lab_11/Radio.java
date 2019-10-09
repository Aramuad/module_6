package lab_11;

public class Radio {
	private int station;
	private int volume;
	private boolean on;
	
	Radio() {
		station = 1;
		volume = 1;
		on = false;
	}
	
	private int getStation() {
		return station;
	}
	private int getVolume() {
		return volume;
	}
	private boolean turnOn() {
		on = true;
		return on;
	}
	private boolean turnOff() {
		on = false;
		return on;
	}
	private int stationUp(int random) {
		if(on == true) {
			station = station + random;
		}
		return station;
	}
	private int stationDown(int random) {
		if(on == true) {
			station = station - random;
		}
		return station;
	}
	private int volumeUp(int random) {
		if(on == true) {
			volume = volume + random;
		}
		return volume;
	}
	private int volumeDown(int random) {
		if(on == true) {
			volume = volume - random;
		}
		return volume;
	}
	public String toString() {
		String description = "";
		if(on == false) {
			description = "The radio is off";
		} else {
			description = "The radio station is " + this.getStation() + " and the volume level is " + this.getVolume();
		}
		return description;
	}

	public static void main(String[] args) {
		Radio WREK = new Radio();
		for(int i = 0; i < 20; i++) {
			double random = Math.floor(Math.random() * 3) + 1;
			switch((int)Math.floor(Math.random() * 6) + 1) {
			case 1:
				WREK.turnOn();
				System.out.println();
				System.out.println("Turn radio on:");
				System.out.println("	" + WREK.toString());
				System.out.println();
				break;
			case 2:
				WREK.turnOff();
				System.out.println();
				System.out.println("Turn radio off");
				System.out.println("	" + WREK.toString());
				System.out.println();
				break;
			case 3:
				WREK.stationUp((int)random);
				System.out.println();
				System.out.println("Move station up by " + (int)random);
				System.out.println("	" + WREK.toString());
				System.out.println();
				break;
			case 4:
				WREK.stationDown((int)random);
				System.out.println();
				System.out.println("Move station down by " + (int)random);
				System.out.println("	" + WREK.toString());
				System.out.println();
				break;
			case 5:
				WREK.volumeUp((int)random);
				System.out.println();
				System.out.println("Turn volume up by " + (int)random);
				System.out.println("	" + WREK.toString());
				System.out.println();
				break;
			case 6:
				WREK.volumeDown((int)random);
				System.out.println();
				System.out.println("Turn volume down by " + (int)random);
				System.out.println("	" + WREK.toString());
				System.out.println();
				break;
			}
		}
	}
}
