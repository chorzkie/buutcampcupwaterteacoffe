package com.buutcamp.cupwaterteacoffee.objects;

import com.buutcamp.cupwaterteacoffee.iface.CupContent;

public class Water implements CupContent {
    public Water(){
        System.out.println("Water's ready.");
    }
        //public void setContent(String content){
    //    System.out.println("You're filling up your cup with " + content + " until it's full.");
    //}

    //public void drinkContent() {
    //    System.out.println("You drink all your cup's content. Now it's empty..");
    //}
}
