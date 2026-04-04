class ClothsRunner{
public static void main(String[] args){		
Cloths.brandName();
Cloths.sizePresent('S', 'M','L');
String colour = Cloths.colourPresent();
System.out.println("The total number of colour present are: "+colour);
int discount = Cloths.priceWithDiscount(1700);
System.out.println("Total price with discount is : "+discount);
}
}