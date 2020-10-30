package ec.edu.espol.workshops.second;

import java.util.Scanner;

public class Main {
	
	public Main() {
		
	}

	public static void main(String[] args) {
		
		log.fine("***CARLNSURANCE***");
		
		Scanner sc = new Scanner(System.in);

		log.fine("INGRESE SU NOMBRE: ");
        String name = sc.nextLine();
        
        log.fine("INGRESE SU ESTADO (married/not married): ");
        String estado = sc.nextLine();
        
        log.fine("INGRESE SU SEXO (M/F): ");
        char sex = sc.next().charAt(0);
        
        log.fine("INGRESE SU EDAD: ");
        int age = sc.nextInt();
        
        log.fine("POSEE LICENCIA DE CONDUCIR (true/false): ");
        boolean license = sc.nextBoolean();
        
        Carlnsurance ensure = new Carlnsurance(name, age, sex, estado, license);
        
        log.fine("Su nombre es "+ensure.getName()+" y tiene "+String.valueOf(ensure.getAge())+", usted es "+ String.valueOf(ensure.getSex())+ " y su estado es "+ensure.getStatus());
        log.fine("Su seguro es de: "+  String.valueOf(ensure.getPremium()));
        

        if(ensure.getAge() > 80) {
        	log.fine("No se le podra vender por la edad");
        	log.fine("La compania se somete a las leyes nacionales. ");
        	
        	
        }else {
        	
        	 if(ensure.getSex() == 'M' || ensure.getSex() == 'm' && ensure.getLicenseDriver()) {
        		 if (ensure.getStatus().equals("not married")) {
        			 if (ensure.getAge() < 25) {
        				 log.fine("Se le aumentar� $1500 m�s a su seguro");
        	             	ensure.setPremium(ensure.getPremium()+1500);
        	             	log.fine("Su seguro ahora tiene un precio de: "+ensure.getPremium());
        			 }
        		 } 
        	 }
             else if (((ensure.getSex() == 'F' || ensure.getSex() == 'f') || ensure.getStatus().toLowerCase() == "married") && ensure.getLicenseDriver()) {
            	 log.fine("Se le restar� $200 a su seguro");
             	ensure.setPremium(ensure.getPremium()-200);
             	log.fine("Su seguro ahora tiene un precio de: "+ensure.getPremium());
             }
             else if(ensure.getAge() < 65 && ensure.getAge() > 45 && ensure.getLicenseDriver()) {
            	 log.fine("Se le restar� $100 a su seguro");
             	ensure.setPremium(ensure.getPremium()-100);
             	log.fine("Su seguro ahora tiene un precio de: "+ensure.getPremium());
             }
        	
        	 log.fine("***AHORA SUS DATOS ACTUALIZADO SON***");
        	 log.fine("Su nombre es "+ensure.getName()+" y tiene "+String.valueOf(ensure.getAge())+", usted es "+ String.valueOf(ensure.getSex())+ " y su estado es "+ensure.getStatus());
        	 log.fine("Su seguro es de: "+  String.valueOf(ensure.getPremium()));
        	
        }
        
        
	}

}
