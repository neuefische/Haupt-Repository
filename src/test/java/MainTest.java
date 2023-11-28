import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void multiplikationTest_when4mal9_thenReturn36() {
        //given
        int a = 4;
        int b = 9;

        //when
        int result = Main.multiplikation(a, b);

        //then
        assertEquals(37, result);
    }
}
