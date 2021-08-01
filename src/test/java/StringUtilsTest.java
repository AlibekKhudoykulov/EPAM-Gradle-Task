import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
void isPositiveNumber(){
        Assertions.assertFalse(StringUtils.isPositiveNumber("-5"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("-12"));
        Assertions.assertTrue(StringUtils.isPositiveNumber("0"));
        Assertions.assertTrue(StringUtils.isPositiveNumber("24"));
    }

}