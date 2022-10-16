package dynamicProgramming.lastStoneWeight;

import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap =new PriorityQueue<>();
        for(int stone : stones)
            /*to sort largest positive element in the begining after converting it to negative to will be in the begining                         [2,7,4,1,8,1] will be stored -8,-7,-4,-2,-1,-1 */
            maxHeap.add(-stone);
        while(maxHeap.size() >1)
        {
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();
            if(stone1 != stone2)
                maxHeap.add(stone1 - stone2);
        }
        return maxHeap.size() != 0? - maxHeap.remove() :0;
    }
}