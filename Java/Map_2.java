//word0 solution
public Map<String, Integer> word0(String[] strings) {

  Map<String, Integer> lMap = new HashMap<String, Integer>();
  for (int i = 0; i < strings.length; i++) {
    lMap.put(strings[i], 0);
  }
  return lMap;
}

//wordLen solution
public Map<String, Integer> wordLen(String[] strings) {

  String lTemp = "";
  Map<String, Integer> lMap = new HashMap<String, Integer>();
  for (int i = 0; i < strings.length; i++) {
    lTemp = strings[i];
    lMap.put(lTemp, lTemp.length());
  }
  return lMap;
}

//pairs solution
public Map<String, String> pairs(String[] strings) {
  String lTemp = "";
  String lFirst = "";
  String lLast = "";
  Map<String, String> lMap = new HashMap<String, String>();
  for (int i = 0; i < strings.length; i++) {
    lTemp   = strings[i];
    lFirst = String.valueOf(lTemp.charAt(0));
    lLast  = String.valueOf(lTemp.charAt(lTemp.length() - 1));
    lMap.put(lFirst, lLast);
  }
  return lMap;
}

//wordCount solution
public Map<String, Integer> wordCount(String[] strings) {
  int lCount = 0;
  String lTemp = "";
  Map<String, Integer> lMap = new HashMap<String, Integer>();
  for (int i = 0; i < strings.length; i++) {
    lTemp = strings[i];
    if (lMap.containsKey(lTemp)) {
      lCount = lMap.get(lTemp);
      lMap.put(lTemp, lCount + 1);
    } else {
      lMap.put(lTemp, 1);
    }
  }
  return lMap;
}

//firstChar solution
public Map<String, String> firstChar(String[] strings) {

  String lKey = "";
  String lVal = "";
  Map<String, String> lMap = new HashMap<String, String>();
  for (int i = 0; i < strings.length; i++) {

    lKey = String.valueOf(strings[i].charAt(0));
    if (lMap.containsKey(lKey)) {
      lVal = lMap.get(lKey) + strings[i];
      lMap.put(lKey, lVal);
    } else {
      lMap.put(lKey, strings[i]);
    }
  }
  return lMap;
}
