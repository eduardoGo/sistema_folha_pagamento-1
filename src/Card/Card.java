package Card;

import sistema_folha_pagamento.Empregado;
import sistema_folha_pagamento.Empregado.TypeEmployee;

import java.util.ArrayList;

public class Card {
	
	private ArrayList<DataCard> dates = new ArrayList<DataCard>();
	
	public void addPoint(Empregado employee) {
		
		DataCard dataCard = new DataCard();
		System.out.println("aa");
		int workedHours = dataCard.getHourStart().getHour() - dataCard.getHourEnd().getHour();
		
		if(workedHours > 8
				&& employee.getTypeEmployee() == TypeEmployee.PAYED_BY_HOUR)
			employee.addExtraHours(workedHours - 8);
		
		dates.add(dataCard);
		
	}
}
