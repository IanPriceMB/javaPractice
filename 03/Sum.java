public class Sum
{
   public int GetSum(int a, int b)
   {
      int answer = 0; 
      
      if (a == b) {
        answer = a;
      } 
      else if (a < b) {
        for(int i = a; i <= b; i++){
          answer += i;
        }
      } 
      else if (b < a) {
        for(int i = b; i <= a; i++){
          answer += i;
        }
      }
      return answer;
   }
}

public class Sum
{
  public int GetSum(int a, int b)
  {
    return (a + b) * (Math.abs(a - b) + 1) / 2;
  }
}

public class Sum
{
  public int GetSum(int a, int b) {
    int res = 0;
    for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
      res += i;
    }
    return a == b ? a : res;
  }
}