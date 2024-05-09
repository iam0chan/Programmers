class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        //n - 양꼬치(12,000원) , k - 음료수(2,000원) , n=10 -> k는 0원
        boolean check = n>0 && n/10<=k && n<1000 && k<1000;
        
        if(check){
            int yang = 0;
            int beverage = 0;
            yang = n*12000;
            k -= n/10;
            beverage = k*2000;
            answer = yang + beverage;
        }
        
        return answer;
    }
}