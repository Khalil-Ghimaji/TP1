public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    int[] Tab=new int[2];
    for(int i=0;i<nums.length;i++){
        if (map.containsKey(target-nums[i])){
            Tab[0]=i;
            Tab[1]=map.get(target-nums[i]);
            break;}
        map.put(nums[i],i);
    }
    return Tab; 
}
