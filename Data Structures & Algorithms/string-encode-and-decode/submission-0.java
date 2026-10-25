class Solution {

    public String encode(List<String> strs) {
        StringBuilder st = new StringBuilder();
        if(strs.isEmpty()){
            return "";
        }
        for(String str : strs){
            st.append(str).append("#").append(")");
        }
        return st.toString();
    }

    public List<String> decode(String str) {
        StringBuilder sb = new StringBuilder();
        char lastChar = ')';
        List<String> response = new ArrayList<>();
        for(char c : str.toCharArray()){
            if(c == ')' && lastChar=='#'){  
                response.add(sb.deleteCharAt(sb.length()-1).toString());
                sb.setLength(0);
            }else{
            lastChar = c;
            sb.append(c);
            }
            

        }
        return response;
    }
}
