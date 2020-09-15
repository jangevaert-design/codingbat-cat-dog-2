public class CatDog2 {
  public boolean catDog(String str) {
    int c = 0;
    int b = 0;

    for (int i = 0; i < str.length() - 2; i++) {
      if (str.startsWith("cat", i)) {
        c++;
      }
      if (str.startsWith("dog", i)) {
        b++;
      }
    }
    return (c == b);
  }
}
