import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] myarray, int target){
        int[] result=new int[2];
        Map<Integer, Integer> map=new HashMap<Integer,Integer>();
        for (int i=0;i<myarray.length;i++){
            if (!map.containsKey(target-myarray[i])){
                map.put(myarray[i],i);
            } else {
                result[1]=i;
                result[0]=map.get(target-myarray[i]);
                return result;
            }
        }
        throw new IllegalArgumentException("Not found");
    }

    public static void main(String[] args) {
        int[] newarray={2,11,5,10,7,8};
        int[] lemmeSee=twoSum(newarray,);
        System.out.println(lemmeSee[0]+" and "+lemmeSee[1]);
    }
}
