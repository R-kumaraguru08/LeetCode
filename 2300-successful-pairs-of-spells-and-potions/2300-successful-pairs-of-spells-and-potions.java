class Solution { 
    public int[] successfulPairs(int[] spells, int[] potions, long success) { 
        Arrays.sort(potions); 
        int[] op = new int[spells.length]; 
        
        for (int i = 0; i < spells.length; i++) {
            
            long minPotion = (success + spells[i] - 1) / spells[i];
            
            int left = 0;
            int right = potions.length - 1;
            int firstValidIndex = potions.length; 
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (potions[mid] >= minPotion) {
                    firstValidIndex = mid; 
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            op[i] = potions.length - firstValidIndex;
        } 
        
        return op; 
    } 
}
