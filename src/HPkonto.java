import java.lang.reflect.AnnotatedArrayType;

public class HPkonto {
    public static void main(String[] args) {
        int objNr = 0, wahl = 0;
        final int ANZ = 10;

        Sparkonto objArray_Sparkonto[] = new Sparkonto[ANZ];

        for (int i = 0; i < ANZ; i++){
            objArray_Sparkonto[i] = new Sparkonto();
        }

        System.out.print("\nObjekt auswählen (1-10): ");
        objNr = Tastatur.liesInt() - 1;

        do {
            System.out.println("\n1 - Zinsänderung");
            System.out.println("2 - Transaktion");
            System.out.println("3 - Verzinsung");
            System.out.println("4 - Kapitalausgabe");
            System.out.println("5 - Beenden");
            wahl = Tastatur.liesInt();

            switch (wahl){
                case 1:
                    System.out.print("\nNeuer Zinssatz: ");
                    objArray_Sparkonto[objNr].setZinssatz(Tastatur.liesFloat());
                    break;
                case 2:
                    System.out.println("\n1 - Auszahlung");
                    System.out.println("2 - Einzahlung");
                    System.out.println("3 - Zurück");

                    switch (Tastatur.liesInt()){
                        case 1:
                            System.out.print("Auszahlungsmenge: ");
                            objArray_Sparkonto[objNr].transaktion(Tastatur.liesFloat() * -1);
                            break;
                        case 2:
                            System.out.print("Einzahlungsmenge: ");
                            objArray_Sparkonto[objNr].transaktion(Tastatur.liesFloat());
                        case 3:
                            break;
                        default:
                            System.out.println("\nFehleingabe");
                    }
                    break;
                case 3:
                    objArray_Sparkonto[objNr].verzinsung();
                    break;
                case 4:
                    System.out.printf("\n%.2f €\n", objArray_Sparkonto[objNr].getKapital());
                    break;
                case 5:
                    System.out.println("deleting data . . .");
                    break;
                default:
                    System.out.println("\nFehleingabe");
            }
        }while (wahl != 5);
    }
}
