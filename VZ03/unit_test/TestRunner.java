package unit_test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(AirHabitatTest.class);
      result.getFailures().forEach((failure) -> {
          System.out.println(failure.toString());
       });
      System.out.println(result.wasSuccessful());/*
      result = JUnitCore.runClasses(CageTest.class);
      result.getFailures().forEach((failure) -> {
          System.out.println(failure.toString());
       });	
      System.out.println(result.wasSuccessful());
      result = JUnitCore.runClasses(CellTest.class);
      result.getFailures().forEach((failure) -> {
          System.out.println(failure.toString());
       });	
      System.out.println(result.wasSuccessful());
      result = JUnitCore.runClasses(EntranceTest.class);
      result.getFailures().forEach((failure) -> {
          System.out.println(failure.toString());
       });	
      System.out.println(result.wasSuccessful());*/
   }
} 