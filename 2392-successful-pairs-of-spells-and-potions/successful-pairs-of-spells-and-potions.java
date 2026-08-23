class Solution {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int maxPotion = 0;

        for (int potion : potions) {
            if (potion > maxPotion) {
                maxPotion = potion;
            }
        }

        int[] potionCounts = new int[maxPotion + 1];
        for (int potion : potions) {
            potionCounts[potion]++;
        }

        int runningCount = 0;

        for (int i = maxPotion; i >= 0; i--) {
            runningCount += potionCounts[i];
            potionCounts[i] = runningCount;
        }

        int[] pairs = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];

            long target = (success + spell - 1) / spell;

            if (target <= maxPotion) {
                pairs[i] = potionCounts[(int) target];
            }
        }

        return pairs;
    }
}