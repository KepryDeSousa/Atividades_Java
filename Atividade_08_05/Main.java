package Atividade_08_05;
import java.util.*;

public class Main{
        public static void main (String[] args){
            Scanner X = new Scanner(System.in);
        
            Lebre L = new Lebre();
            Peixe P = new Peixe();
            Escorpiao Es = new Escorpiao();


            try {
                /*
                 * System.out.println("Entre com o valor referente ao tipo de nescessidade do: \n"+
                " 1 - Peixe\n"+
                " 2 - Lebre \n"+
                " 3 - Escorpiao\n"+
                );
                int Animal = X.nextInt();


                 * 
                 */
                System.out.println("Entre com o valor referente ao tipo de nescessidade do: \n"+
                " 1 - Para predar\n"+
                " 2 - Para fugir \n"+
                " 3 - Para esconder\n"+
                " 4 - Para caçar\n"
                );
                int Tipo = X.nextInt();
                if (Tipo == 1) {
                    P.Predar();
                }
                if (Tipo == 2) {
                    P.Fugir();
                }
                if (Tipo == 3) {

                    P.Esconder();
                }
                if (Tipo == 4) {
                    P.Procura();
                }
                

            } catch (Exception e) {
             // TODO: handle exception
             System.out.println("Retorne, pois você falhou");
            }
            
        
        
        }
/*
 *      Lebre:É uma presa e fode correndo
 *      Peixe: É uma presa que foge nadando
 *      Escorpiao é um pretador de preda ferroando
 *      pexie: predador
 */ 

    }