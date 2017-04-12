//countEvens solution
public int countEvens(int[] nums) {

  int lEvens = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) lEvens++;
  }
  return lEvens;
}

//bigDiff solution
public int bigDiff(int[] nums) {

  int lMax = nums[0];
  int lMin = nums[0];
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] > lMax) lMax = nums[i];
    if (nums[i] < lMin) lMin = nums[i];
  }
  return lMax - lMin;
}

//centeredAverage solution
public int centeredAverage(int[] nums) {

    int lSum = 0;
    int lMax = nums[0];
    int lMin = nums[0];
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > lMax) lMax = nums[i];
        if (nums[i] < lMin) lMin = nums[i];
        lSum += nums[i];
    }
    return (lSum - (lMax + lMin)) / (nums.length - 2);
}

//sum13 solution
public int sum13(int[] nums) {

  int lSum = 0;
  for (int i = 0; i < nums.length; i++) {
    if(nums[i] != 13) {
      lSum += nums[i];
      if(i>0 && nums[i-1] == 13)
        lSum -= nums[i];
    }
  }
  return lSum;
}

//sum67 solution
public int sum67(int[] nums) {

    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 6) sum += nums[i];
        else
            while (nums[i] != 7) i++;
    }
    return sum;
}

//has22 solution
public boolean has22(int[] nums) {
  for (int i = 0; i < nums.length - 1; i++)
    if (nums[i] == 2 && nums[i+1] == 2) return true;
    return false;
}

//TODO this goes farther down
//sameEnds solution
public boolean sameEnds(int[] nums, int len) {
    for (int i = 0, j = nums.length - len; i < len; i++, j++) {
      if (nums[i] != nums[j]) return false;
    }
    return true;
}
