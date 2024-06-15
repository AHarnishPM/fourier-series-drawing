package fsd;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CurveTest {
    @Test
    @DisplayName("Selecting keepDuplicates as false should not allow consecutive duplicates")
    void testDeleteDuplicates() {
        Curve curve = new Curve();
        curve.addPoint(new Point(1,1), false);
        curve.addPoint(new Point(1,1), false);

        assertEquals("[x=1y=1]", curve.drawString());

    }

}
