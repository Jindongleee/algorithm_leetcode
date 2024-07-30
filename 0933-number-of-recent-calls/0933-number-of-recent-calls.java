import java.util.LinkedList;
import java.util.Queue;


class RecentCounter {
    Queue<Integer> queue;
    
    public RecentCounter() {
        this.queue=new LinkedList<>();
    }
    
    public int ping(int t) {
        //offer //peek //poll
        queue.offer(t);

        // for(int i=0;i<queue.size();i++){
        //     if(!queue.isEmpty() && queue.peek() < t - 3000){
        //         queue.poll();
        //     }
        // }

        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */