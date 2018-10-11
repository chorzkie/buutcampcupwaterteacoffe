package com.buutcamp.cupwaterteacoffee.appConfig;

import com.buutcamp.cupwaterteacoffee.iface.CupContent;
import com.buutcamp.cupwaterteacoffee.objects.Coffee;
import com.buutcamp.cupwaterteacoffee.objects.Cup;
import com.buutcamp.cupwaterteacoffee.objects.Tea;
import com.buutcamp.cupwaterteacoffee.objects.Water;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig{

    @Bean
    public Cup getCup() {
        return new Cup();
    }
    @Bean
    public Water getWater() {
        return new Water();
    }
    @Bean
    public Tea getTea() {
        return new Tea();
    }
    @Bean
    public Coffee getCoffee() {
        return new Coffee();
    }
    //@Bean
    //public CupContent getContent() {
    //    return
    //}
}
