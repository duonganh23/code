class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        for (int i = 0; i < flowerbed.length; i++){
            int left = flowerbed[i-1];
            int right = flowerbed[i+1];
            if ((left + flowerbed[i] + right) == 0){
                counter++;
            }
        }
        if (counter >= n){
            return true;
        }else{
            return false;
        }
    }
}
