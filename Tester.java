public class Tester {
  public static void main(String[] args) {
    SuperArray bob = new SuperArray();
    for (int i = 0; i < args.length; i ++) {
      bob.add(args[i]);
    }
    System.out.println("Your list:");
    System.out.println(bob.toString());
    System.out.println("Its size:");
    System.out.println(bob.size());
    System.out.println("Its emptiness:");
    System.out.println(bob.isEmpty());
    System.out.println("If it has 'test':");
    System.out.println(bob.contains("test"));
    System.out.println("Where it has the first 'test':");
    System.out.println(bob.indexOf("test"));
    System.out.println("Where it has the last 'test':");
    System.out.println(bob.lastIndexOf("test"));
    System.out.print(bob.get(2));
    System.out.print(" is the same as ");
    System.out.println(bob.set(2, "test"));
    System.out.println("New list:");
    System.out.println(bob.toString());
    bob.add(2, "test2");
    System.out.println("New list:");
    System.out.println(bob.toString());
    System.out.print("Now the ");
    System.out.print(bob.remove(3));
    System.out.println(" should be gone");
    System.out.println(bob.toString());
    bob.clear();
    System.out.println("List after being cleared:");
    System.out.println(bob.toString());
  }
}
