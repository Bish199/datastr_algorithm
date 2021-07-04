//space(O(N)), time->O(Nlog(N))
//class Solution {
//    public String sortSentence(String s) {
//        if(s==null||s.length()==0) return "";
//        String[] arr=s.split(" ");
//        String[] result=new String[arr.length];
//        Arrays.sort(arr,(a,b)->Integer.parseInt(a.substring(a.length()-1))-Integer.parseInt(b.substring(b.length()-1)));
//        for(int i=0;i<arr.length;i++){
//            result[i]=arr[i].substring(0,arr[i].length()-1);
//        }
//        return String.join(" ",result);
//        
//    }
//}

//Space (O(N))
//Time->O(N)
class Solution {
    public String sortSentence(String s) {
        if(s==null||s.length()==0) return "";
        String[] arr=s.split(" ");
        String[] result=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int el=Integer.parseInt(arr[i].substring(arr[i].length()-1));
            result[el-1]=arr[i].substring(0,arr[i].length()-1);
        }
        return String.join(" ",result);
        
    }
}
