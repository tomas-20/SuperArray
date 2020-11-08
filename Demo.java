public class Demo{
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
  public static void main(String[]args){
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
    System.out.println(findOverlap(words, words2));
  }
}
