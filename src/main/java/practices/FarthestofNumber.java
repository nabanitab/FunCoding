package practices;

public class FarthestofNumber {

    public static void main(String[] args) {
        farthestDistance();
    }

    public static void farthestDistance() {
        int[] arr = {5, 2, 3, 1, 6, -3, -6};
        int farthest = 0;
        int diff = 0;
        for (int i = 0; i < arr.length; i++) {
            diff = Math.abs(arr[i]);
            if ((farthest < diff) || (diff == farthest && arr[i] < 0))
                farthest = arr[i];
        }
        System.out.println("Farthest element is : " + farthest);
    }

   /* private static int getAbsolute(int no) {
        return no < 0 ? (no * -1) : no;
    }*/
}






