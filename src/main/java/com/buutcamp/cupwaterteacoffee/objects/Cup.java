package com.buutcamp.cupwaterteacoffee.objects;

import com.buutcamp.cupwaterteacoffee.iface.CupContent;

public class Cup {

    public Cup(){
        System.out.println("Let's get an empty cup.");
    }
    public void setContent(CupContent cupcontent){
        String str = cupcontent.getClass().toString();
        String[] stri = str.split("objects.");
        System.out.println("\nYou're filling up your cup with " + stri[1].toLowerCase() + " until it's full.");
    }
    public void drinkContent() {
        System.out.println("You drink all of your cup's content. Now it's empty..");
    }
}
