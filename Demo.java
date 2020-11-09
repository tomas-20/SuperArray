public class Demo {
  public static void removeDuplicates(SuperArray s) {
    for (int i = s.size() - 1; i >= 0; i --) {
      if (s.indexOf(s.get(i)) != i) {
        s.remove(i);
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray output = new SuperArray();
    for (int i = 0; i < a.size(); i ++) {
      String s = a.get(i);
      if (b.contains(s) && !output.contains(s)) {
        output.add(s);
      }
    }
    return output;
  }
  public static SuperArray orderedZip(SuperArray a, int aSize, SuperArray b, int bSize) {
    SuperArray output = new SuperArray(aSize + bSize);
    for (int i = 0; i < aSize; i ++) {
      output.add(a.get(i));
      output.add(b.get(i));
    }
    for (int i = aSize; i < bSize; i ++) {
      output.add(b.get(i));
    }
    return output;
  }
  public static SuperArray zip(SuperArray a, SuperArray b) {
    int aSize = a.size();
    int bSize = b.size();
    if (aSize < bSize) {
      return orderedZip(a, aSize, b, bSize);
    }
    else {
      return orderedZip(b, bSize, a, aSize);
    }
  }
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray words2 = new SuperArray();
    words2.add("uni");   words2.add("bob");     words2.add("ebi");

    System.out.println(words2);
    System.out.println(findOverlap(words, words2));
    System.out.println(zip(words, words2));
  }
}
