public class Reversesentence {
    public static void main(String[] args) {
        String sentence="hi iam indu gm";
        sentence(sentence);
    /* String sentences = "hi iam indu gm";
        sentence(sentences);
    }

    static void sentence(String s) {
        String[] words = s.split(" ");
        StringBuilder reverse = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);
            if (i != 0) {
                reverse.append(" ");
            }
        }

        System.out.println(reverse);*/

    }
    static void sentence(String s){
        String[] words=s.split(" ");
        String reverse=" ";
        for(int i=words.length-1;i>=0;i--){
            reverse=reverse+words[i];
            if(i!=0){
                reverse=reverse+" ";
            }
        }
        System.out.println(reverse);
    }
}
