package set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ARSetTest {

  ARSet s = new ARSet();

  @Test
  public void empty_set_should_have_size_zero() {
    ARSet emptySet = new ARSet();
    assertEquals(0, emptySet.size());
  }

  @Test
  public void addResultsInSetContainingTheCorrectElement() {
    s.add(2);
    assertEquals(2, s.toArray()[0]);
  }

  @Test
  public void addDoesNotAddDuplicates() {
    s.add(2);
    s.add(2);
    assertEquals(1, s.size());
  }

  @Test
  public void addCanTakeInAListOfIntegers() {
    Integer[] intArray = new Integer[]{0, 1, 3};
    s.add(intArray);
    System.out.println();
    // TODO The fact that I have to repeat creation of array might
    // show that toArray should return same type of array that
    // the method add takes in?
    assertArrayEquals(new int[]{0, 1, 3}, s.toArray());
  }

  @Test
  public void deleteRemovesAnElement() {
    s.add(3);
    s.delete(3);
    assertEquals(0, s.size());
  }

  @Test
  public void deleteRemovesCorrectElement() {
    s.add(3);
    s.add(5);
    s.add(6);
    s.delete(5);
    assertArrayEquals(new int[]{3, 6}, s.toArray());
  }  

}