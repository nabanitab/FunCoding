package practices;

public class TestT {
    public static void main(String[] args) {
        int arr[] = {5,6,7,2,5,8};
        for (int i =0; i<6;i++){
            if (i==2){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
