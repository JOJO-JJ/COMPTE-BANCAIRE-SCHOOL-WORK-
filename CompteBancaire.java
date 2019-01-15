import java.util.Scanner;
public class CompteBancaire
{
    static int taille ;
    static String[] id = new String[taille],  nom = new String[taille], prenom = new String[taille], adresse = new String[taille], telephone = new String[taille];
    static int[] depot = new int[taille],retrait = new int[taille] ;
    static int i,choix;
    static String entreId;
    static Scanner lire = new Scanner(System.in);
       
    public static void main(String[] args)
   {
      System.out.println("                        *****JOKA BANK*****        \n\n\n\n\n");
      System.out.println(" 1- Creation Compte");
      System.out.println(" 2- Depot Bancaire ");
      System.out.println(" 3- Retrait Bancaire ");
      System.out.println(" 4- Lister Tous Les Comptes");
      System.out.println(" 5- Calul interet ");
      System.out.print(" \nSELECTIONNERZ:...");
      choix = lire.nextInt();
      
      switch(choix)
      {
        case 1:
              System.out.println(" ");
              creationCompte();
             break;
        case 2:
               System.out.println("En construction...");
             break;
        case 3:
               System.out.println("En construction...");
             break;
        case 4: 
               System.out.println("En construction...");
             break;
        case 5:  
               System.out.println("En construction...");
             break;
        default:
           System.out.println("MAUVAIS CHOIX");     
        
      }    
   }
   
   public static void creationCompte()
   {
    
    System.out.println("\nCombien de compte voulez-vous créer?");
             taille = lire.nextInt();  lire.nextLine();        
       
        for(i = 0; i < taille; i++)
        {
          System.out.println("Entrez ID ");                      
                 id[i] = lire.nextLine();
          System.out.println("Entre nom ");                
                 nom[i] = lire.nextLine();
          System.out.println("Entrez prenom ");
                 prenom[i] = lire.nextLine();
          System.out.println("Entrez adresse ");
                 adresse[i] = lire.nextLine();
          System.out.println("Entrez telephone");
                telephone[i] = lire.nextLine();
            do
            {
                System.out.println(" Voulez-vous deposer combien?(Minimum 500G)");
                       depot[i] = lire.nextInt();
            }while(depot[i] < 500);
            
          System.out.println(" ");
        }   
        
    System.out.println("Félicitation votre compte a été créé avec succès");
    System.out.println(" ");
    
         for(i = 0; i < taille; i++)
         {   
           System.out.print(" ID : "      +id[i]);
           System.out.print(" Nom : "     +nom[i]);
           System.out.print(" Prenom : "  +prenom[i]);          
           System.out.println(" ");
         }   
   }
   
   public static void Depot()
   {
    
    
    
    
    
    
    
   }
   
   public static void Retrait()
   {
    
    
    
    
    
    
    
   }
   
   public static void TousLesComptes()
   {     
    for(i = 0; i < taille; i++)
     {            
        System.out.println(" ID : "+id[i]);
        System.out.println(" Nom : "+nom[i]);
        System.out.println(" Prenom : "+prenom[i]);
        System.out.println(" Adresse : "+adresse[i]);
        System.out.println(" Telephone : "+telephone[i]);
        System.out.println(" ");
     }     
   }
}
