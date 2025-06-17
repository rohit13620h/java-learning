package idea.src;
/*given subarray of non negative no and an num m and the array can be divided into m subarray non empty now find the
largetst sum among the sub array
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Smallestlargestsumamongsubarray {
    public static void main(String[] args) {
        int[] array = {7, 2, 5, 10, 8};
        int m = 2;

        int ans = maxmin(array,m);
        System.out.println(ans);

    }

    static int maxmin(int[] array , int m ){
        int maxsum=0,minsum=0,ans;
        for(int i:array){
            maxsum+=i;
            if(i>minsum){
                minsum=i;
            }
        }
        if(m==1){
            return maxsum;
        }else if (m==array.length){
            return minsum;
        }

        ans=findans(array,m,minsum,maxsum);
        return ans;
    }

    static int findans(int[] array , int m , int start, int end){
        while(start<=end){
            if(start==end){
                return start;
            }
            int sum =0, count =0,mid;
            mid=start+(end-start)/2;
            for(int i :array){
                sum+=i;
                if(sum>mid){
                    sum=i;
                    count++;
                }
                if(i==array[array.length-1]){
                    count++;
                }
            }
            if(count <= m){
                end=mid;
            }else if (count > m){
                start= mid+1;
            }
        }
        return -1;
    }

}
