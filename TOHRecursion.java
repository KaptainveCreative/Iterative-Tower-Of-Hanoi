public class TOHRecursion {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod)
    {
        if (n == 1)
        {
            System.out.println("Take disk 1 from tower " +  from_rod + " to tower " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
        System.out.println("Take disk " + n + " from tower " +  from_rod + " to tower " + to_rod);
        towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
    }
 
    public static void main(String args[])
    {
        int n = 3;
        towerOfHanoi(n,'A','C', 'B');
    }
 
} 