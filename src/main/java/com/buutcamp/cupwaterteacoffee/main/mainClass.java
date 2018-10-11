package com.buutcamp.cupwaterteacoffee.main;

import com.buutcamp.cupwaterteacoffee.appConfig.appConfig;
import com.buutcamp.cupwaterteacoffee.iface.CupContent;
import com.buutcamp.cupwaterteacoffee.objects.Cup;
import com.buutcamp.cupwaterteacoffee.objects.Water;
import com.buutcamp.cupwaterteacoffee.objects.Tea;
import com.buutcamp.cupwaterteacoffee.objects.Coffee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainClass {
    public static void main(String[] args){

        //Get context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
        Cup c = context.getBean("getCup", Cup.class);
        CupContent water = context.getBean("getWater", CupContent.class);
        CupContent tea = context.getBean("getTea", CupContent.class);
        CupContent coffee = context.getBean("getCoffee", CupContent.class);

        //Water water = new CupContent();
        //CupContent content = new Water();

        c.setContent(water);
        c.drinkContent();
        c.setContent(tea);
        c.drinkContent();
        c.setContent(coffee);
        c.drinkContent();
    }
}
