// Experiment 3.2: Predefined Comparable Interface
// Question: Implement Comparable<Player> and sort players by runs
// from highest to lowest.

import java.util.Arrays;

class Player implements Comparable<Player> {
    String name;
    int runs;

    Player(String n, int r) {
        name = n;
        runs = r;
    }

    public int compareTo(Player p) {
        return Integer.compare(p.runs, runs);
    }

    public String toString() {
        return name + "(" + runs + ")";
    }
}

class SortDemo {
    public static void main(String[] args) {
        Player[] p = {
            new Player("Ravi", 45),
            new Player("Anu", 92),
            new Player("Kiran", 67)
        };

        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
    }
}

/*
Output:
[Anu(92), Kiran(67), Ravi(45)]
*/
