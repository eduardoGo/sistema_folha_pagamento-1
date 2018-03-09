package sistema_folha_pagamento;
import Card.Card;

import java.util.ArrayList;
import java.util.Scanner;
import Sales.Sale;

public class Empregado {
	
	public enum TypeEmployee {
		NON_COMISSIONED,COMISSIONED,PAYED_BY_HOUR}
	
	public enum PaymentMethod {
		CHECK_MAIL,CHECK_HANDS,DEPOSIT_ACCOUNT}
	
	
		
	private TypeEmployee typeEmployee;
	private String name;
	private String addres;
	private int numberIdentification;
	
	private boolean pertenceSindicato;
	private int numeroUnicoSindicato;
	private float syndicalFee=0;
	private float serviceFee=0;
	
	private Date lastPayment;
	private float grossSalary = 2000;
	
	private int extraHours=0;
	private ArrayList<Sale> sales = new ArrayList<Sale>();
	private float percentageSales = 10;
	
	private Card cardPoint = new Card();
	private PaymentMethod paymentMethod = null;
	
	private PaymentSchedule paymentSchedule = new PaymentSchedule(1,true,false);
	
	Scanner input = new Scanner(System.in);
	
	
	public Empregado(String name, String addres) {
		
		this.name = name;
		this.addres = addres;
	}
	
	public void PutNewTypeEmployee() {
		//tb serve pra editar
		int typeEmployee = 0;
		
		do {
			System.out.println("Select the type:");
			System.out.println("[1] Non-commissioned employee");
			System.out.println("[2] Commissioned employee");
			System.out.println("[3] Payed by hour");
			typeEmployee = input.nextInt();
			if(typeEmployee <= 0 || typeEmployee >= 4 )
				System.out.println("Invalid input!");
		}while(typeEmployee <= 0 || typeEmployee >= 4);
		
		if(typeEmployee == 1)
			this.typeEmployee = TypeEmployee.NON_COMISSIONED;
		else if(typeEmployee == 2)
			this.typeEmployee = TypeEmployee.COMISSIONED;
		else
			this.typeEmployee = TypeEmployee.PAYED_BY_HOUR;
		
	}
	
	
	public void paymentMethod() {
		//tambem serve quando for mudar
		
		if(paymentMethod != null)
			System.out.printf("Current method: %s\n", this.paymentMethod);
		
		int method = 0;
		do {
			System.out.println("Enter the new method that you want:");
			System.out.println("[1] Check by mail");
			System.out.println("[2] Check in hands");
			System.out.println("[3] Deposit in account bank");
			method = input.nextInt();
			if(method <= 0 || method >= 4 )
				System.out.println("Invalid input!");
		}while(method <= 0 || method >= 4 );
		
		if(method == 1)
			this.paymentMethod = PaymentMethod.CHECK_MAIL;
		else if(method == 2)
			this.paymentMethod = PaymentMethod.CHECK_HANDS;
		else
			this.paymentMethod = PaymentMethod.DEPOSIT_ACCOUNT;
		
	}
	
	
	
	public float getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(float serviceFee) {
		this.serviceFee = serviceFee;
	}

	public int getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(int extraHours) {
		this.extraHours = extraHours;
	}

	public String getName() {
		return name;
	}

	public String getAddres() {
		return addres;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setSales(ArrayList<Sale> sales) {
		this.sales = sales;
	}

	public float getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Date getLastPayment() {
		return lastPayment;
	}

	public void setLastPayment(Date lastPayment) {
		this.lastPayment = lastPayment;
	}

	public PaymentSchedule getPaymentSchedule() {
		return paymentSchedule;
	}

	public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}

	public void addServiceFee(float fee) {
		this.serviceFee += fee;
	}
	public float getSyndicalFee() {
		return syndicalFee;
	}

	public void setSyndicalFee(float syndicalFee) {
		this.syndicalFee = syndicalFee;
	}

	public ArrayList<Sale> getSales() {
		return sales;
	}

	public void setTypeEmployee(TypeEmployee typeEmployee) {
		this.typeEmployee = typeEmployee;
	}

	public void setPertenceSindicato(boolean pertenceSindicato) {
		this.pertenceSindicato = pertenceSindicato;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public void addExtraHours(int extraHours) {
		this.extraHours += extraHours;
	}

	public TypeEmployee getTypeEmployee() {
		return typeEmployee;
	}

	public Card getCardPoint() {
		return cardPoint;
	}

	public void setCardPoint(Card cardPoint) {
		this.cardPoint = cardPoint;
	}

	public int getNumberIdentification() {
		return this.numberIdentification;
	}

	public void setNumberIdentification(int numberIdentification) {
		this.numberIdentification = numberIdentification;
	}

	public int getNumeroUnicoSindicato() {
		return this.numeroUnicoSindicato;
	}

	public void setNumeroUnicoSindicato(int numeroUnicoSindicato) {
		this.numeroUnicoSindicato = numeroUnicoSindicato;
	}

	
	
	
	public boolean isPertenceSindicato() {
		return pertenceSindicato;
	}

	int taxaSindical() {
		if(pertenceSindicato) 
			return 1;
		else
			 return 0;
		
	}
	
}
