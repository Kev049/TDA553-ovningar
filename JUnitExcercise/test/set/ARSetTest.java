package set;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Random;
import java.util.LinkedList;



public class ARSetTest {
  ARSet newSet = new ARSet();
  @Test
  public void empty_set_should_have_size_zero() {
    //ARSet emptySet = new ARSet();
    assertEquals(0, newSet.size());
  }

  @Test
  public void setShouldHaveSizeOneAfterAddingOneInt() {
    Random random = new Random();
    int rand = random.nextInt();
    newSet.add(rand);
    assertEquals(1, newSet.size());
  }

  @Test
  public void deleteShouldRemoveIntIfSame() {
    int i = 5;
    newSet.add(i);
    newSet.delete(i);
    assertEquals(0, newSet.size());
  }

  @Test
  public void deleteShouldNotRemoveIntIfInt() {
    int i = 5;
    int otherI = 4;
    newSet.add(i);
    newSet.delete(otherI);
    assertEquals(1, newSet.size());
  }

  @Test
  public void emptySetShouldNotBeAffectedByDelete() {
    newSet.delete(0);
    assertEquals(0, newSet.size());
  }

  @Test
  public void addingEmptyIntegerArrayShouldNotChangeSet() {
    Integer[] list = new Integer[0];
    newSet.add(list);
    assertEquals(0, newSet.size());
  }

  @Test 
  public void addingIntegerListWithTwoIntegersGivesSetSize2() {
    Integer[] list = new Integer[] {2, 3};
    newSet.add(list);
    assertEquals(2, newSet.size());
  }
}