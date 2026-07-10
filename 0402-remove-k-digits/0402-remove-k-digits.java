class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        for(char ch:num.toCharArray()){
            while(!st.isEmpty() && st.peek()>ch && k>0){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder s=new StringBuilder();
        while(!st.isEmpty()){
            s.append(st.pop());
        }
        s.reverse();
        while(s.length()>1 && s.charAt(0)=='0'){
            s.deleteCharAt(0);
        }
        if(s.length()==0){
            s.append('0');
        }
        return s.toString();

    }
}