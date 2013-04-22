package fitnessapps.acceltest.activity;

import java.util.Date;

public class AccelerometerData {
	private float accelerationX;
	private float accelerationY;
	private float accelerationZ;
	private Date time;
	private String gameName;
	private boolean endOfGame;

	public AccelerometerData(float x, float y, float z, Date timestamp) {
		accelerationX = x;
		accelerationY = y;
		accelerationZ = z;
		time = timestamp;
		gameName = null;  
		endOfGame = false;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public void setAccelerationX(float newX) {
		accelerationX = newX;
	}

	public float getAccelerationX() {
		return accelerationX;
	}

	public void setAccelerationY(float newY) {
		accelerationY = newY;
	}

	public float getAccelerationY() {
		return accelerationY;
	}

	public void setAccelerationZ(float newZ) {
		accelerationZ = newZ;
	}

	public float getAccelerationZ() {
		return accelerationZ;
	}
	
	public void setGameName(String newName) {
		gameName = newName;
	}
	
	public String getGameName() {
		return gameName;
	}
	
	public void setEndOfGame(boolean flag) {
		endOfGame = flag;
	}
	
	public boolean getEndOfGame() {
		return endOfGame;
	}

}

