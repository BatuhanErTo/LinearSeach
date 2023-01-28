public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Batuhan";
        char target = 't';
        System.out.println(search(name,target));
    }
    static boolean search(String str, char trgt){
        if(str.length() == 0){
            return false;
        }
        for(char let : str.toCharArray()){
            if(let == trgt){
                return true;
            }
        }
        return false;
    }
}

