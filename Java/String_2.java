//doubleChar solution
public String doubleChar(String str) {

  String result = "";
  for(int i = 0; i < str.length();i++) {
    result += str.charAt(i);
    result += str.charAt(i);
  }
  return result;
}

//countHi solution
public int countHi(String str) {

    int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.substring(i, i + 2).equals("hi")) count += 1;
    }
    return count;
}
