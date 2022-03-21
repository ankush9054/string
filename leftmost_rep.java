public class leftmost_rep {

    static int first_rep(String str){
        int res = Integer.MAX_VALUE;
        int fi[] = new int [256];
        for(int i=0;i<fi.length;i++){
            fi[i]=-1;
        }
        for(int i=0;i<str.length();i++){
            if(fi[str.charAt(i)]==-1){
                fi[str.charAt(i)]=i;
            }else{
                res = Math.min(res, fi[str.charAt(i)]);
            }
        }
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        for(int i=0;i<str.length();i++){

        }
    }
    
}
