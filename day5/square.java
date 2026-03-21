public class square {
    public static void main(String[] args) {
        int num=20;

        int left=0,right=num;
        int ans=0;

        while (left<=right) {
            int mid=(left+right)/2;

            if (mid*mid==num) {
                System.out.println(mid);
                return;
            } 
            else if (mid*mid<num) {
                ans=mid;
                left=mid+1;
            } 
            else {
                right=mid-1;
            }
        }
        System.out.println(ans);
    }
}