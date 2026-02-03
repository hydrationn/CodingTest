class Solution {
    static int answer = 0;
    
    static int[] walletArr;
    static int[] billArr;
    
    public int solution(int[] wallet, int[] bill) {
        walletArr = wallet;
        billArr = bill;
        
        reverseSortArr(walletArr);
        reverseSortArr(billArr);
        
        while (true) {
            if (walletArr[0] >= billArr[0] && walletArr[1] >= billArr[1]) {
                break;
            }

            foldBill();
        }
        
        return answer;
    }
    
    public void reverseSortArr(int[] intArr) {
        if (intArr[0] < intArr[1]) {
            int temp = intArr[1];
            intArr[1] = intArr[0];
            intArr[0] = temp;
        }
    }
    
    public void foldBill() {
        answer++;
        billArr[0] = billArr[0] / 2;
        reverseSortArr(billArr);
    }
}