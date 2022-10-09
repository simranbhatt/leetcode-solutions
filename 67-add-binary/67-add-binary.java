class Solution {
    public String addBinary(String addend1, String addend2) {
        int i = addend1.length() - 1;
        int j = addend2.length() - 1;
        int carry = 0;
        StringBuilder binaryResult = new StringBuilder();
        while(i >= 0 || j >= 0) {
            int sum = carry;
            if(i >= 0) sum += addend1.charAt(i--) - '0';
            if(j >= 0) sum += addend2.charAt(j--) - '0';
            binaryResult.append(sum % 2);
            carry = sum / 2;
        }
        if(carry > 0)
            binaryResult.append(carry);
        return binaryResult.reverse().toString();
    }
}