public class Palindrom {
    private String palindrom;
    private String reverseWord = "";

    public Palindrom(String palindrom) {
        this.palindrom = palindrom;
    }

    public String getPalindrom() {
        return palindrom;
    }

    public void setPalindrom(String palindrom) {
        this.palindrom = palindrom;
    }

    public boolean verificarePalindrom(){
        char reversed;
        for (int i = 0; i < palindrom.length(); i++){
            reversed = palindrom.charAt(i); //extracts each character
            reverseWord= reversed + reverseWord; //adds each character in front of the existing string
        }
        if(palindrom.equals(reverseWord)){
            return true;
        }
        else return false;
    }
}
