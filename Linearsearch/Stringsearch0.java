public class Stringsearch0 {
    public static void main(String[] args) {
        String name="indu";
        char target='u';
        System.out.println(stringsearch(name,target));
    }
    static boolean stringsearch(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    
}
    

