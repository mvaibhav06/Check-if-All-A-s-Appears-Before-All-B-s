public class Appear {
    public boolean checkString(String s) {
        int j = s.length()-1;

        while(j>=0){
            char ch = s.charAt(j);
            if(ch!='b'){
                break;
            }
            j--;
        }
        j--;
        while(j>=0){
            char ch = s.charAt(j);
            if(ch != 'a'){
                return false;
            }
            j--;
        }
        return true;
    }
}
