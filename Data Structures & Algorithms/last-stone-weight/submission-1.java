class Solution {
    public int lastStoneWeight(int[] stones) {
     PriorityQueue<Integer> heap =
        new PriorityQueue<>(Collections.reverseOrder());   
        for(int s:stones){
            heap.add(s);
        }

        while(heap.size()>1){
          int a=heap.poll();
          int b=heap.poll();
          
          if(a>b){
            a=a-b;
            heap.add(a);
          }
         
        }
        if(heap.isEmpty()){
            return 0;
        }
        return heap.poll();
    }
}
