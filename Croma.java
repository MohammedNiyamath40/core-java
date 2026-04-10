class Croma{
	public static void main(String[] croma){
		String[] mobilesNames = new String[15];
		mobilesNames[0] = "Apple";
		mobilesNames[1] = "Samsung";
		mobilesNames[2] = "Vivo";
		mobilesNames[3] = "Oppo";
		mobilesNames[4] = "Redmi";
		mobilesNames[5] = "Oneplus";
		mobilesNames[6] = "Blue Berry";
		mobilesNames[7] = "Xamaio";
		mobilesNames[8] = "Huwai";
		mobilesNames[9] = "Sony";
		mobilesNames[10] = "Nokia";
		mobilesNames[11] = "Kachada";
		mobilesNames[12] = "Realme";
		mobilesNames[13] = "Motorola";
		mobilesNames[14] = "Nothing";
		
		String[] laptopsNames = new String[15];
		laptopsNames[0] = "HP";
		laptopsNames[1] = "Dell";
		laptopsNames[2] = "Lenovo";
		laptopsNames[3] = "Acer";
		laptopsNames[4] = "Asus";
		laptopsNames[5] = "MSI";
		laptopsNames[6] = "Microsoft";
		laptopsNames[7] = "Apple";
		laptopsNames[8] = "Samsung";
		laptopsNames[9] = "Lg";
		laptopsNames[10] = "Razor";
		laptopsNames[11] = "FrameWork";
		laptopsNames[12] = "Xamaio";
		laptopsNames[13] = "Gigabyte";
		laptopsNames[14] = "Fujitus";
		
		String[] washingMachineNames = new String[15];
		washingMachineNames[0] = "LG";
		washingMachineNames[1] = "Samsung";
		washingMachineNames[2] = "Bosch";
		washingMachineNames[3] = "Whirpool";
		washingMachineNames[4] = "IFB";
		washingMachineNames[5] = "Haier";
		washingMachineNames[6] = "Panasonic";
		washingMachineNames[7] = "Toshiba";
		washingMachineNames[8] = "MarQ by Flipkart";
		washingMachineNames[9] = "Lloyd";
		washingMachineNames[10] = "Speed Queen";
		washingMachineNames[11] = "Miele";
		washingMachineNames[12] = "Siemens ";
		washingMachineNames[13] = "Electrolux";
		washingMachineNames[14] = "Godrej";
		
		String[] airConditionerNames = new String[15];
		airConditionerNames[0] = "Voltas";
		airConditionerNames[1] = "LG";
		airConditionerNames[2] = "Daikin";
		airConditionerNames[3] = "Blue Star";
		airConditionerNames[4] = "Hitachi";
		airConditionerNames[5] = "Panasonic";
		airConditionerNames[6] = "Samsung";
		airConditionerNames[7] = "Haier";
		airConditionerNames[8] = "Carrier";
		airConditionerNames[9] = "Whirpool";
		airConditionerNames[10] = "Llyod";
		airConditionerNames[11] = "Godrej";
		airConditionerNames[12] = "IFB";
		airConditionerNames[13] = "Croma";
		airConditionerNames[14] = "Mitsubishi";
		
		String[] televisonNames = new String[15];
		televisonNames[0] = "Samsung";
		televisonNames[1] = "LG";
		televisonNames[2] = "Sony";
		televisonNames[3] = "TCL";
		televisonNames[4] = "Hisense";
		televisonNames[5] = "Panasonic";
		televisonNames[6] = "Philips";
		televisonNames[7] = "Xiamoi";
		televisonNames[8] = "Toshiba";
		televisonNames[9] = "VU";
		televisonNames[10] = "Oneplus";
		televisonNames[11] = "Blaupunkit";
		televisonNames[12] = "Acer";
		televisonNames[13] = "Vizio";
		televisonNames[14] = "Sharp";
		
		for(String mobile : mobilesNames){
			System.out.println("For EachLoop-- Mobile Brand Names: "+ mobile);
		}
		for(String laptop : laptopsNames){
			System.out.println("For EachLoop-- Laptop Brand Names: "+laptop);
		}
		for(String washingMachine : washingMachineNames){
			System.out.println("For EachLoop-- Washing Machine Brand Names :"+washingMachine);
		}
		for(String ac : airConditionerNames){
			System.out.println("For EachLoop-- Air Conditioner Brand Names :"+ac);
		}
		for(String tv : televisonNames){
			System.out.println("For EachLoop-- Televisiion Brand Names :"+tv);
		}
		
		for(int i = 0; i < mobilesNames.length; i++){
			System.out.println("For Loop-- Mobile Brand Names :"+mobilesNames[i]);
		}
		for(int i = 0; i < laptopsNames.length; i++){
			System.out.println("For Loop-- Laptop Brand Names :"+laptopsNames[i]);
		}
		for(int i = 0; i < washingMachineNames.length; i++){
			System.out.println("For Loop-- Washing Machine Brand Names :"+washingMachineNames[i]);
		}
		for(int i = 0; i < airConditionerNames.length; i++){
			System.out.println("For Loop-- AC Brand Names :"+airConditionerNames[i]);
		}
		for(int i = 0; i < televisonNames.length; i++){
			System.out.println("For Loop-- Televison Brand Names :"+televisonNames[i]);
		}
	}
}