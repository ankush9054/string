public class check_rot {

    static boolean areRot(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        return ((str1+str1).indexOf(str2)>=0);
    }
    
}
