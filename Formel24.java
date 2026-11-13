public class Formel24{
    
     // Berechnet z = 5 * x * y + 2
    public int berechne(int x, int y) {
        int z = 5 * x * y + 2;
        return z;
    }

    // Berechnet e = berechne(b, a) + berechne(c, 4) + berechne(a, c)
    public int berechne(int a, int b, int c) {
        int e = berechne(b, a) + berechne(c, 4) + berechne(a, c);
        return e;
    }
}