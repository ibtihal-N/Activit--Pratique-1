package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        //System.out.println(daoClassName);
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getConstructor().newInstance();


        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor().newInstance();

        Method setDao=cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier,dao);

        System.out.println("RES = "+metier.calcul());

    }
}
