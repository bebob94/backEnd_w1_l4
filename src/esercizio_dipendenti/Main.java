package esercizio_dipendenti;

public class Main {

	public static void main(String[] args) {
		
	//CREAZIONE DIPENDENTI	
	Dipendente dip1 = new Dipendente( "0a1",  Livello_dipendente.OPERAIO ,Dipartimento.PRODUZIONE);
	Dipendente dip2 = new Dipendente( "0a2" ,Livello_dipendente.IMPIEGATO,Dipartimento.VENDITA);
	Dipendente dip3 = new Dipendente( "0a3" , Livello_dipendente.QUADRO,Dipartimento.VENDITA);
	Dipendente dip4 = new Dipendente( "0a4" , Livello_dipendente.DIRIGENTE,Dipartimento.AMMINISTRAZIONE);
	
	//CALCOLO DELLA PAGA CON GLI STRAORDINARI
	System.out.println("La paga del dipendente è: " + Dipendente.calcolaPaga(dip1, 10) + " €");
	System.out.println("La paga del dipendente è: " + Dipendente.calcolaPaga(dip2, 10) + " €");
	System.out.println("La paga del dipendente è: " + Dipendente.calcolaPaga(dip3, 10) + " €");
	System.out.println("La paga del dipendente è: " + Dipendente.calcolaPaga(dip4, 10) + " € \n");
	
	//PROMOZIONE DEI DIPENDENTI
	dip1.stampaDatiDipendente();
	dip1.promuovi();
	dip1.stampaDatiDipendente();
	
	dip2.stampaDatiDipendente();
	dip2.promuovi();
	dip2.stampaDatiDipendente();
	
	dip3.stampaDatiDipendente();
	dip3.promuovi();
	dip3.stampaDatiDipendente();
	
	dip4.stampaDatiDipendente();
	dip4.promuovi();
	dip4.stampaDatiDipendente();


	}

}
