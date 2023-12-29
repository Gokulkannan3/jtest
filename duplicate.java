import java.util.*;
public class duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr =new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
        Set<Integer> a = new HashSet<>();
        for (int i=0;i< arr.size();i++){
            a.add(arr.get(i));
        }
        System.out.println(a);
    }
}
