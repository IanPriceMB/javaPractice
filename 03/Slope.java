public class Slope
{

  public static String slope(int[] points){
    int x = points[2]-points[0];
    int y = points[3]-points[1];
     
    if(x == 0){
      return "undefined";
    } else if (y == 0) {
      return "0";
    } else {
      int slope = y / x;
      return String.valueOf(slope);
    }
    }
  public static void main(String[] args){
      String answer = slope(new int[] {19,3,20,3});
      String answer1 = slope(new int[] {-7,2,-7,4});
      String answer2 = slope(new int[] {10,50,30,150});
      String answer3 = slope(new int[] {15,45,12,60});
      String answer4 = slope(new int[] {10,20,20,80});
      System.out.println(answer);
      System.out.println(answer1);
      System.out.println(answer2);
      System.out.println(answer3);
      System.out.println(answer4);
  }
}

public class Slope2
{

  public String slope(int[] points)
    {
    int nominator = points[3] - points[1], denominator = points[2] - points[0];

    return denominator == 0 ? "undefined" : String.format("%s", (nominator) / (denominator));
    }

}