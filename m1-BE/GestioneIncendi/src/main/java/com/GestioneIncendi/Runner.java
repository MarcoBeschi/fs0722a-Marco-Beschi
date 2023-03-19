package com.GestioneIncendi;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner  implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
       
       ObserverSondaContr logger= new ObserverSondaContr();
       ObserverController observerController= new ObserverController();
       SondaProxy sondaProxy = new SondaProxy(logger);
       observerController.addObserver(sondaProxy);

       Sonda sonda1= new Sonda(11L,"40.24","51.35",4);
       observerController.notificaObservers(sonda1);

       Sonda sonda2= new Sonda(12L,"36.45","42.46",6);
       observerController.notificaObservers(sonda2);

    }
    
}
