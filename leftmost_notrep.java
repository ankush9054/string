public class leftmost_notrep {

    static int non_rep(String str){
        int res = Integer.MAX_VALUE;
        int fi[] = new int [256];
        for(int i=0;i<fi.length;i++){
            fi[i]=-1;
        }
        for(int i=0;i<str.length();i++){
            if(fi[str.charAt(i)]==-1){
                fi[str.charAt(i)]=i;
            }else{
                fi[str.charAt(i)]=-2;
            }
        }
        for(int i=0;i<256;i++){
            if(fi[i]>=0) res=Math.min(res, fi[i]);
        }
        return res;
    }



    public static void main(String[] args) {
        
    }
    
}
