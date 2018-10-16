public class Solution{

    private static int chunk;
    private static int states=0;

    private static int chunkSize(int i){
        if(Math.abs(A[i]-A[i+1])!=Math.abs(A[i+1]-A[i+2])){
            return 0;
        } 
        else if(Math.abs(A[i]-A[i+1])==Math.abs(A[i+1]-A[i+2])){
            chunkSize(i+1);
            return 1;
        }
    }

    private static int numStates(int n){
        if (n = 1) return 1;

        nums = new int[n+1];
        nums[0] = 0; nums[1] = 1;
        for (int i = 2; i < n; i++){
            nums[i] = nums[i-1]+i;
        }
        return nums[n];
    }

    public static int answer(int[] A){
        for(int i = 0; i < A.length;){
            chunk = chunkSize(i);
            if(chunk == 0){
                i++;
            } else {
                states += numStates(chunk);
                i += chunk;
            }
        }
        return states;
    }

    public static void main(String[] args){
        System.out.print(answer(array));
    }
}