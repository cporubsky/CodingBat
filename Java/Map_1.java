//mapBully solution
public Map<String, String> mapBully(Map<String, String> map) {
  String lTemp = "";
  if (map.containsKey("a")) {
    lTemp = map.get("a");
    map.put("a", "");
    map.put("b", lTemp);
  }
  return map;
}

//mapShare solution
public Map<String, String> mapShare(Map<String, String> map) {

  String lTemp = "";
  if (map.containsKey("a")) {
    lTemp = map.get("a");
    map.put("b", lTemp);
  }
  map.remove("c");
  return map;
}

//mapAB solution
public Map<String, String> mapAB(Map<String, String> map) {

  String lTemp = "";
  if (map.containsKey("a") && map.containsKey("b")) {
    lTemp = map.get("a") + map.get("b");
    map.put("ab", lTemp);
  }
  return map;
}

//topping1 solution
public Map<String, String> topping1(Map<String, String> map) {
  if (map.containsKey("ice cream")) {
    map.put("ice cream", "cherry");
  }
  map.put("bread", "butter");
  return map;
}

//topping2 solution
public Map<String, String> topping2(Map<String, String> map) {
  if (map.containsKey("ice cream")) map.put("yogurt", map.get("ice cream"));
  if (map.containsKey("spinach")) map.put("spinach", "nuts");
  return map;
}
