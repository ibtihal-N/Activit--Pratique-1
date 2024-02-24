package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSprigXML {
    public static void main(String[] args){
        ApplicationContext spriingContext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=spriingContext.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());
    }
}
