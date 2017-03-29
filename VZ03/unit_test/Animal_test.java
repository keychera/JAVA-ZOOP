package unit_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import animal_list.*;

public class Animal_test {
  //TODO Complete this unit test after animal_list implementation is complete 
  Cat litten;
  Cat incineroar;
  
  @Before
  public void initialize(){
    litten = new Cat();
    incineroar = new Cat(185);
  }

  @Test
  public void testWeight() {
    assertEquals(10,litten.GetWeight());
    assertEquals(185,incineroar.GetWeight());
  }

  
}
