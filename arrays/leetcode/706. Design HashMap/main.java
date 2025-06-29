public class main {
    public static void main(String[] args) {
        private int[] map;
            //brute force solution
        public MyHashMap() {
            map = new int[1000001];
            Arrays.fill(map, -1);
        }
    
        public void put(int key, int value) {
            map[key] = value;
        }
    
        public int get(int key) {
            return map[key];
        }
    
        public void remove(int key) {
            map[key] = -1;
        }
    }
}
