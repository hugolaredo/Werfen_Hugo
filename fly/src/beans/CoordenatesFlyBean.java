package beans;

public class CoordenatesFlyBean {
	
	int horizontal;
	int aim;
	int altitude;
	int trajectory;
	
	
	public CoordenatesFlyBean() {
		this.horizontal = 0;
		this.aim = 0;
		this.altitude = 0;
		this.trajectory = 0;
	}

	public int getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(int horizontal) {
		this.horizontal = horizontal;
	}

	public int getAim() {
		return aim;
	}

	public void setAim(int aim) {
		this.aim = aim;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public int getTrajectory() {
		return trajectory;
	}

	public void setTrajectory(int trajectory) {
		this.trajectory = trajectory;
	}
	
	
}
