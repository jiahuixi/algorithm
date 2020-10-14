package com.niuke.swordFinger;

import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length==0){
            return ret;
        }
        find(new ArrayList<Integer>() , nums);
        return ret;
    }
    public  void find( ArrayList<Integer> list ,int[] nums){
        if(list.size() == nums.length){
            ret.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0 ; i <nums.length ; i ++){
            list.add(nums[i]);
            find( list , nums);
            list.remove(list.size()-1);
        }


    }

    public static void main(String[] args) {
        ThreadLocal<String> localName = new ThreadLocal();
        localName.set("1");
        localName.set("2");

        System.out.println(localName.get());
    }
}
//leetcode submit region end(Prohibit modification and deletion)
