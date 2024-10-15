
class StockSpanner {

    List<Integer> arr = new ArrayList<>();

    public StockSpanner() {
    }

    public int next(int price) {
        arr.add(price); 

        int count = 0;

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) <= price) {
                count++;
            } else {
                break; 
            }
        }
        return count;
    }
}