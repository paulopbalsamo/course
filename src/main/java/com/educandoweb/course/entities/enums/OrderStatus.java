package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	WAITTING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int code; // --> codigo do tipo Enumerado

	private OrderStatus(int code) {
		this.code = code;
	}

//metodo para acessar 
	public int getCode() {
		return code;
	}

	public static OrderStatus valueOF(int code) { // estatico por nao vai precisar instanciar
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
			
		}
		
		throw new IllegalArgumentException("Ivalid OrderStatus code");
	}

}
