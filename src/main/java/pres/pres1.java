package pres;

import dao.DaoImpl;
import dao.DaoImpl2;
import metier.MetierImpl;

public class pres1 {
    public static void main(String[] args){
        DaoImpl2 dao= new DaoImpl2();//couplage fort utilisation des classes
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("Res="+metier.calcul());
    }
}
