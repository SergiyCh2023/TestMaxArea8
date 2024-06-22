import org.example.OneElementException;
import org.example.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    public void findMaxAreaTest1() {
        int area = solution.findMaxArea(new int[]{1,8,6,2,5,4,8,3,7});
        Assertions.assertEquals(49, area);
    }

    @Test
    public void findMaxAreaTest2() {
        int area = solution.findMaxArea(new int[]{4,3,2,1,4});
        Assertions.assertEquals(16, area);
    }

    @Test
    public void findMaxAreaTest3() {
        int area = solution.findMaxArea(new int[]{1,2,1});
        Assertions.assertEquals(2, area);
    }

    @Test
    public void findMaxAreaTest4() {
        int area = solution.findMaxArea(new int[]{1,1});
        Assertions.assertEquals(1, area);
    }

    @Test
    public void findMaxAreaNullPointerExceptionTest() {
        Assertions.assertThrows(NullPointerException.class, ()->solution.findMaxArea(null));
    }


    @Test
    public void findMaxAreaOneElementException() {
        Assertions.assertThrows(OneElementException.class, ()->solution.findMaxArea(new int[] {5}));
    }

}
