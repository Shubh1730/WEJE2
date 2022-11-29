package com.jspiders.MobilePattern.aBuilderMain;

import com.jspiders.MobilePattern.Builder.MobileBuilder;
import com.jspiders.MobilePattern.Object.Mobile;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile= new MobileBuilder().brand("Oneplus").color("Black").price(68000.00).disp_size(6.2).getMobile();
		System.out.println(mobile);
	}

}
