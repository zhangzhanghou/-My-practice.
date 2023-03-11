import java.util.PriorityQueue;

public class 二维接雨水 {
    public static class Node {
        public int value;
        public int x;
        public int y;

        public Node(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }

    public static int maxWater(int[][] heightMap) {
        if (heightMap.length < 2 || heightMap[0].length < 2) return 0;
        int n = heightMap.length;
        int m = heightMap[0].length;
        boolean[][] isEnter = new boolean[n][m];
        PriorityQueue<Node> heap = new PriorityQueue<>((o1, o2) -> o1.value - o2.value);
        for (int j = 0; j < m - 1; j++) {
            isEnter[0][j] = true;
            heap.add(new Node(heightMap[0][j], 0, j));
        }
        for (int i = 0; i < n - 1; i++) {
            isEnter[i][m - 1] = true;
            heap.add(new Node(heightMap[i][m - 1], i, m - 1));
        }
        for (int j = m - 1; j > 0; j--) {
            isEnter[n - 1][j] = true;
            heap.add(new Node(heightMap[n - 1][j], n - 1, j));
        }
        for (int i = n - 1; i > 0; i--) {
            isEnter[i][0] = true;
            heap.add(new Node(heightMap[i][0], i, 0));
        }
        int water = 0;
        int max = 0;
        while (!heap.isEmpty()) {
            Node cur = heap.poll();
            int x = cur.x;
            int y = cur.y;
            max = Math.max(max, cur.value);
            if (x > 0 && !isEnter[x - 1][y]) {
                water += Math.max(0, max - heightMap[x - 1][y]);
                isEnter[x - 1][y] = true;
                heap.add(new Node(heightMap[x - 1][y], x - 1, y));
            }
            if (x < n - 1 && !isEnter[x + 1][y]) {
                water += Math.max(0, max - heightMap[x + 1][y]);
                isEnter[x + 1][y] = true;
                heap.add(new Node(heightMap[x + 1][y], x + 1, y));
            }
            if (y > 0 && !isEnter[x][y - 1]) {
                water += Math.max(0, max - heightMap[x][y - 1]);
                isEnter[x][y - 1] = true;
                heap.add(new Node(heightMap[x][y - 1], x, y - 1));
            }
            if (y < m - 1 && !isEnter[x][y + 1]) {
                water += Math.max(0, max - heightMap[x][y + 1]);
                isEnter[x][y + 1] = true;
                heap.add(new Node(heightMap[x][y + 1], x, y + 1));
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[][] map1 = {
                {1, 4, 3, 1, 3, 2},
                {3, 2, 1, 3, 2, 4},
                {2, 3, 3, 2, 3, 1},
        };
        int[][] map2 = {
                {3, 3, 3, 3, 3},
                {3, 2, 2, 2, 3},
                {3, 2, 1, 2, 3},
                {3, 2, 2, 2, 3},
                {3, 3, 3, 3, 3},
        };
        System.out.println(maxWater(map1));
        System.out.println(maxWater(map2));
    }
}
