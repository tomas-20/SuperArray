public class Tester {
  public static void main(String[] args) {
    SuperArray bob = new SuperArray();
    System.out.println(bob.size());
    System.out.println(bob.add("hello"));
    System.out.println(bob.add("there"));
    System.out.println(bob.size());
    System.out.println(bob.set(0, "bye"));
    System.out.println(bob.get(0));
    System.out.println(bob.toString());
    bob.add("how");
    bob.add("is");
    bob.add("your");
    bob.add("day");
    bob.add("today");
    bob.add("I");
    bob.add("hope");
    bob.add("it");
    bob.add("is");
    bob.add("good");
    System.out.println(bob.toString());
  }
}
