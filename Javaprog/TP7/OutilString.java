public class OutilString{
    public String ecrirePunition(String phrase, int nombre){
        if(nombre >= 0){
            String s = "";
        for(int i = 1; i <= nombre ; i++){
            s += i + "-" + phrase + '\n';
        }
        return s;
        }
        return  "";
    }

    public int compterCaractere(String phrase, char c){
        int res = 0;
        for(int i = 0; i < phrase.length(); i++){
            if(phrase.charAt(i) == c) res++;
        }
        return res;
    }

    public String donnerPremierMot(String phrase){
        String res = "";
        int i = 0;
        while(phrase.charAt(i) != ' '){
            res += phrase.charAt(i);
            i++;
        }
        return res;
    }

    public String enumererMots(String phrase, char separator){
        String res = "";
        int i = 0;
        int j = 1;
        if((phrase != "") && (phrase.charAt(0) != '-')) {res += "(1)"; j++;}
        boolean isSeparator = true;
        while(i < phrase.length()){
            if(phrase.charAt(i) == separator && isSeparator){
                res += "(" + j + ")";
                j++;
                isSeparator = false;
            }
            else if(phrase.charAt(i) != separator){
                res += phrase.charAt(i);
                isSeparator = true;
            }
            i++;
        }
        return res;
    }

    public String extraireMot(String phrase, char separator, int numero){
}

