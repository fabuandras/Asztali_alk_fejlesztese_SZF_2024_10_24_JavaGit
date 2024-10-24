package javagit;

public class JavaGit {

    public static void main(String[] args) {
        /* 10 fok alatt van hideg
            ha hideg van, akkor
              viszek kabátot
            egyébként
              nem viszek kabátot
        */
        
        final int HIDEG_HATAR = 10;
        int homerseklet = 7;
        boolean hidegVan = homerseklet < HIDEG_HATAR;
        String eredmeny = "Viszek kabátot.";
        
        /* termális operátorral: */
        eredmeny = hidegVan ? eredmeny : "Nem viszek kabátot. " + eredmeny;
        
        System.out.println(eredmeny);
    }
    
}
