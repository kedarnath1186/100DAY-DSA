import java.util.HashSet;
class ContainsDuplicate {
    public static void main(String[] args){
          int [] nums={1,2,3,1};

          ContainsDuplicate sol = new ContainsDuplicate();
          System.out.println(nums);

    }
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set =new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}