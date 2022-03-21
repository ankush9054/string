

public class angram {

    static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int count[] = new int[256];
        for(int i=0;i<str1.length();i++){   
            count[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            count[str2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
        

    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "itenls";

        System.out.print(anagram(str1, str2));


    }
    
}
