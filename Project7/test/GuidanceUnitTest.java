import junit.framework.TestCase;

public class GuidanceUnitTest extends TestCase {
	GuidanceUnit g1 = new GuidanceUnit();

	public void testGuidanceUnitAtLaunch() {
		assertEquals(0, g1.getHorizontalAcceleration());
	}

	public void testGuidanceUnitJustBeforeIntegerOverflow() {
		g1.setHorizontalAcceleration((short) 32767);
		assertEquals(32767, g1.getHorizontalAcceleration());
	}

	public void testGuidanceUnitOverflowByOne() {
		g1.setHorizontalAcceleration((short) 32768);
		assertEquals(32768, g1.getHorizontalAcceleration());
	}

	public void testGuidanceUnitMaxHorizontalAcceleration() {
				
		g1.setHorizontalAcceleration((short) 999999);
		assertEquals(999999, g1.getHorizontalAcceleration());
	}


}
