package esercizio_dipendenti;

public class Dipendente {
	
//VARIABILI
public double stipendioBase= 1000;
private String codiceMatricola;
private double stipendio;
private double pagaStraordinari;
//VARIABILI

//ENUMS
private Livello_dipendente livello= Livello_dipendente.NON_ASSEGNATO;
private Dipartimento dipartimento= Dipartimento.NON_ASSEGNATO;
//ENUMS

//COSTRUTTORE 1
public  Dipendente(String codice__matricola, Dipartimento dipartimento__) {
	this.codiceMatricola=codice__matricola;
	this.stipendio= stipendioBase;
	this.pagaStraordinari= 30;
	this.livello=Livello_dipendente.OPERAIO;
	this.dipartimento= dipartimento__;
}

//COSTRUTTORE 2
public  Dipendente( String codice__matricola, Livello_dipendente livello__, Dipartimento dipartimento__) {
	this(codice__matricola, dipartimento__);
	this.livello= livello__;
	this.stipendio= stipendi();
	
}

//CREAZIONE DI SINGOLA STRINGA PER LA STAMPA
public String toString() {
    String stringa =  this.codiceMatricola + "\n" + this.livello + "\n" + this.stipendio+ " €" + "\n" + this.pagaStraordinari +" h" + "\n"  + this.dipartimento +"\n";
    return stringa;
}

//METODO PER LA STAMPA
public void stampaDatiDipendente() {
	System.out.println(toString() );
}

//METODO PER IL CALCOLO DEGLI STIPENDI IN BASE AL LIVELLO
public double stipendi() {
	switch(this.livello) {
	case OPERAIO:
		
		stipendio= this.stipendioBase ;
		
		break;
	case IMPIEGATO:
		
		stipendio= this.stipendioBase *1.2;
		
		break;
	case QUADRO:
		
		stipendio= this.stipendioBase *1.5;
		
		break;
	case DIRIGENTE:
		stipendio= this.stipendioBase *2;
	default:
		break;
	}
	return stipendio;
}

//METODO PER PROMUVERE IL LIVELLO DEI DIPENDENTI E LA PAGA
public void promuovi() {
    switch(this.livello) {
    
    case OPERAIO:    	
    	this.livello= Livello_dipendente.IMPIEGATO;
    	stipendio= this.stipendioBase *1.2;        
        break;
        
    case IMPIEGATO:    	
    	this.livello= Livello_dipendente.QUADRO;    	
    	stipendio= this.stipendioBase *1.5;    	
    	break;
    	
    case QUADRO:  	
    	this.livello= Livello_dipendente.DIRIGENTE;   	
    	stipendio= this.stipendioBase *2;
    	break;
    	
    case DIRIGENTE:		
    	System.out.println("sei già la carica più alta dell'azienda");
    	stipendio= this.stipendioBase *2;	
		break;
		
	default:
		break;
    }


}

//METODO PER CALCOLARE LA PAGA CONTANDO GLI STRAORDINARI
static double calcolaPaga(Dipendente dipendente) {
	
	return dipendente.pagaStraordinari ;
}
static double calcolaPaga(Dipendente dipendente, double oreStraordinari ) {
	System.out.println(dipendente);
	return dipendente.stipendio + dipendente.pagaStraordinari * oreStraordinari  ;
}



}
