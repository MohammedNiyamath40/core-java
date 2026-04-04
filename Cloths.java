class Cloths{
static void brandName(){
System.out.println("PRINCE");
}
static void sizePresent(char smallSize, char mediumSize, char largeSize){
System.out.println("Sizes present :"+smallSize+ " "+mediumSize+" "+largeSize);
}
static String colourPresent(){
String colours = "Red, green, yellow";
return colours;
}
static int priceWithDiscount(int customerIdOne){
int discount = 200;
int total = customerIdOne - discount;
return total;
}
}