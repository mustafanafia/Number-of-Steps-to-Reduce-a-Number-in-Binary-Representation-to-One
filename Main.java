class Solution {
    public static int numSteps(String s) {


        int ans = Integer.parseInt(s,2);
        int count = 0;
        while(ans > 0){
            if(ans== 1){
                return count;
            }
            else if(ans % 2 == 0){
                ans /=2;
                count++;
            }
            else{
                ans +=1;
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args){
        System.out.println(numSteps("1101"));

    }

}