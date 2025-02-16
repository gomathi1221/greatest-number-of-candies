class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> l=new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++){
            l.add(true);
        }
        for(int i=0;i<candies.length;i++){
         int a=candies[i]+extraCandies;
         for(int j=0;j<candies.length;j++){
            if(!(a>=candies[j])){
                l.set(i,false);
            }
         }
         
        }
        return l;

    }
}