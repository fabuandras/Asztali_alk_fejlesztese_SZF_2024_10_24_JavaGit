package javagit;

public class JavaGit {

    public static void main(String[] args) {
        /* 10 fok alatt van hideg
            ha hideg van, akkor
              viszek kabátot
            egyébként
              nem viszek kabátot
        */
        
        int homerseklet = 5;

        String eredmeny = "";
        
        if (homerseklet < 10) {
            eredmeny = "Hideg van, viszek kabátot.";
        } else {
            eredmeny = "Nem viszek kabátot.";
        }
        
        System.out.println(eredmeny);
    }
    
}
