import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//solution 1
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer= new ArrayList<>();
        List<Integer> arr1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> arr2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        HashSet<Integer> duplication = new HashSet<>();


        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])
                    duplication.add(nums1[i]);
            }
        }

        for(Integer item :duplication){
            while(arr1.remove(item)){};
            while(arr2.remove(item)){};
        }

        arr1=arr1.stream().distinct().collect(Collectors.toList());
        arr2=arr2.stream().distinct().collect(Collectors.toList());
        answer.add(arr1);
        answer.add(arr2);
        return answer;
    }
    
}
