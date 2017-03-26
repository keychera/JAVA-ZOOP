public class Hello
{
  public Hello()
  {
    System.out.println("Hello, World!");
  }
  
  public void Test(Integer n)
  {
    Integer test1 = n;
    System.out.println(test1);
    Integer test2 = test1;
    test2 = n - 1;
    System.out.println(test1);
    System.out.println(test2);
  }
  
  
  public void Test(Integer n, Integer m)
  {
    Integer test1 = n + m;
    System.out.println(test1);
    Integer test2 = test1;
    test2 = n - 1;
    System.out.println(test1);
    System.out.println(test2);
  }
}
