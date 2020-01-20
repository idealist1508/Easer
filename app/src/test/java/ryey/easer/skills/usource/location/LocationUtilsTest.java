package ryey.easer.skills.usource.location;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

public class LocationUtilsTest {
    @Test
    public void IsInsideTest() throws ParseException {
        Assert.assertTrue(
                LocationUtils.inside(LatLong.fromString("50, 50"),150000, LatLong.fromString("50, 51"))
        );
        Assert.assertFalse(
                LocationUtils.inside(LatLong.fromString("50, 50"),100000, LatLong.fromString("50, 51"))
        );
    }

    @Test
    public void When_locationIsNull_IsAcceptable_Should_ReturnFalse(){
        Assert.assertFalse(
                LocationUtils.isAcceptable(new LocationUSourceDataFactory().dummyData(), null)
        );
    }
}
