import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	// @Test 
	// public void testReverseInPlace() {
  //   int[] input1 = { 3 };
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{ 3 }, input1);

  //   int[] input2 = {1, 2, 3, 4};
  //   ArrayExamples.reverseInPlace(input2);
  //   assertArrayEquals(new int[]{4, 3, 2, 1}, input2);

  //   int[] input3 = {};
  //   ArrayExamples.reverseInPlace(input3);
  //   assertArrayEquals(new int[]{}, input3);
	// }


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] output1 =  ArrayExamples.reversed(input1);
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(output1));
    
    int[] input2 = {1, 2, 3, 4};
    int[] output2 = ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{4, 3, 2, 1}, output2);

    // int[] input3 = {};
    // input3 = ArrayExamples.reversed(input3);
    // assertArrayEquals(new int[]{}, input3);
  }

  // @Test
  // public void testAverageWithoutLowest() {
  //   double[] input1 = {2.0, 2.0, 2.0, 2.0};
  //   assertEquals(2.0, ArrayExamples.averageWithoutLowest(input1), 0.00001);
  // }

}
