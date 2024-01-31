import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = { 2 , 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3, 2},input2);
    int[] input3 = { 1 , 2 , 3};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 3, 2, 1},input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = {3};
    ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{3}, input2);
    int[] input3 = {2, 3};
    ArrayExamples.reversed(input3);
    assertArrayEquals(new int[]{3,2}, input3);
    int[] input4 = {1,2,3};
    ArrayExamples.reversed(input4);
    assertArrayEquals(new int[]{3,2,1}, input4);
  }


}
