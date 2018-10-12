public class Arrays1 {
    public static void main(String[] args){
        int value = 7;
        int[] values;
        values = new int[3];

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        
        for(int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }

        int[] numbers = {5, 6, 7};

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        String[] frusits = {"apple", "banana", "pear"};

        for(String fruit: frusits){
            System.out.println(fruit);
        }

        int[][] grid = {
            {1,2,3,4},
            {2, 456},
            {44, 97,12}
        };

        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
}