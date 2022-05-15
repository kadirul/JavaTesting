public class GuidanceUnit {
	
	//tried to understad the flow but failed 
	private short horizontalAcceleration = 0;

	public void setHorizontalAcceleration(short vel) {
		horizontalAcceleration = vel;
	}

	public short getHorizontalAcceleration() {
		return horizontalAcceleration;
	}

	@Override
	public String toString() {
		return "GuidanceUnit [velocity=" + horizontalAcceleration + "]";
	}
}