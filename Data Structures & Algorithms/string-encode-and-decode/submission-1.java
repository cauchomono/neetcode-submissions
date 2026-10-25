class Solution {

    public String encode(List<String> strs) {
        StringBuilder st = new StringBuilder();
        if(strs.isEmpty()){
            return "";
        }
        for(String str : strs){
            st.append(str.length()).append("#").append(str);
        }
        return st.toString();
    }

    public List<String> decode(String str) {
        List<String> response = new ArrayList<>();
        int i = 0;
        
        while( i < str.length()){
            int j = i;
            int length = 0;
            while(str.charAt(j) != '#'){
                j++;
            }
            
           length = Integer.parseInt(str.substring(i,j));
           i = j+1;
           j = i + length;
           response.add(str.substring(i,j));
           i= j;
        }

        
        

        
        return response;
    }
}
