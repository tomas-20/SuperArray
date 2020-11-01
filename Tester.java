public class Tester {
  public static void main(String[] args) {
    SuperArray bob = new SuperArray();
    for (int i = 0; i < args.length; i ++) {
      bob.add(args[i]);
    }
    System.out.println(bob.toString());
    System.out.println(bob.size());
    System.out.println(bob.get(2));
    System.out.println("is the same as");
    System.out.println(bob.set(2, "test"));
    System.out.println(bob.toString());
  }
}
