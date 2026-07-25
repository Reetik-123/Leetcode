class Solution {
    public int compress(char[] chars) {
        int read=0,write=0;
        while(read<chars.length){
            char current=chars[read];
            int count=0;
            while(read<chars.length && chars[read]==current){
                read++;
                count++;
            }
            chars[write++]=current;
            if(count>1){
                String cnt=Integer.toString(count);
                for(char c : cnt.toCharArray()){
                    chars[write++]=c;
                }
            }
        }
        return write;
    }
}