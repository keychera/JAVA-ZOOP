package unit_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import animal_list.*;

public class Animal_test {
  //TODO Complete this unit test after animal_list implementation is complete 
  Cat litten;
  Cat incineroar;
  Axolotl axo;
  Tiger tigres;
  Wolf balto;
  GoldenEagle goldy;
  BlackKite bob;
  
  @Before
  public void initialize(){
    litten = new Cat();
    incineroar = new Cat(185);
    axo = new Axolotl();
    tigres = new Tiger();
    balto = new Wolf();
    goldy = new GoldenEagle();
    bob = new BlackKite();
  }

  @Test
  public void testWeight() {
    assertEquals(10,litten.GetWeight());
    assertEquals(185,incineroar.GetWeight());
    assertEquals(25,axo.GetWeight());
    assertEquals(15,tigres.GetWeight());
    assertEquals(85,balto.GetWeight());
    assertEquals(20,goldy.GetWeight());
    assertEquals(10,bob.GetWeight());
  }

  public void testCarnivore() {
    assertEquals(1,litten.IsCarnivore());
    assertEquals(1,incineroar.IsCarnivore());
    assertEquals(1,axo.IsCarnivore());
    assertEquals(1,tigres.IsCarnivore());
    assertEquals(1,balto.IsCarnivore());
    assertEquals(1,goldy.IsCarnivore());
    assertEquals(1,bob.IsCarnivore());
  }

  public void testFlying() {
    assertEquals(1,litten.IsFlying());
    assertEquals(1,incineroar.IsFlying());
    assertEquals(1,axo.IsFlying());
    assertEquals(1,tigres.IsFlying());
    assertEquals(1,balto.IsFlying());
    assertEquals(1,goldy.IsFlying());
    assertEquals(1,bob.IsFlying());
  }
}
