package com.jspiders.MobilePattern.aBuilderMain;

import com.jspiders.MobilePattern.Builder.LaptopBuilder;
import com.jspiders.MobilePattern.Object.Laptop;

public class LaptopMain {
	public static void main(String[] args) {
		Laptop laptop=new LaptopBuilder().brand("dell").battery(5000)
				.os("Windows").disp_size(15.6).getLaptop();
		System.out.println(laptop);
	}

}
