//KMP algoritm

// import java.util.Arrays;

// public class string_match {

//     static void KMP(String pat,String txt){
//         int n=txt.length();
//         int m = pat.length();

//         int lps[] = new int[m];
//         Arrays.fill(lps, pat);
        
//         int i=0,j=0;

//         while(i<n){
//             if(pat[j]==txt[i]) i++;j++;
//             if(j==m){System.out.print(i-j);j=lps[j-i];};
//             else if(i<n && pat[j] != txt[i]){
//                 if(j==0) {i++;}
//                 else{j=lps[j-i];}
//             }

//         }
//     }

//     public static void main(String[] args) {
        
//     }
    
// }
