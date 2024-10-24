package javagit;

public class JavaGit {

    public static void main(String[] args) {
        /* 10 fok alatt van hideg
            ha hideg van, akkor
              viszek kabátot
            egyébként
              nem viszek kabátot
        */
        
        int homerseklet = 7;
        String eredmeny = "Nem viszek kabátot.";
        
        if (homerseklet < 10) {
            eredmeny = "Hideg van, viszek kabátot.";
        }
        
        System.out.println(eredmeny);
    }
    
}
