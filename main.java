package dsalld;

import java.util.*;
public class main {

    public static void main(String[] args){
        int[] nums = {2,3,6,7};
        int target = 7;
        System.out.println(com(nums,target));


    }
    public static void findcom(List<List<Integer>> ans,List<Integer> ds, int[] nums, int i,int target){
        if(i == nums.length){
            if(target ==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }


        if(nums[i]<=target){


            ds.add(nums[i]);
            findcom(ans,ds,nums,i,target-nums[i]);
            ds.remove(ds.size()-1);
        }
        findcom(ans,ds,nums,i+1,target);


    }

    public static List<List<Integer>> com(int[] candidates,int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findcom(ans,ds,candidates,0,target);
        return ans;















    }

}

