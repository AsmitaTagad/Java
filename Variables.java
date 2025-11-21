public class Variables{
    public static void main(String arg[]){
      //1. Primitive Data types :
      //1. Integer Type:
      byte a = -127;    //range :-127 to 127 (1 byte)
      short sh= 32056; // range : -32,768 - 32,767  (2 bytes)  (32 Thousand)
      int b= 96327687;   // range : 2 Billion (4 bytes) ( 2 Billion)
      long lg= 6327547286427462469L;  //range : very large (8 bytes);

      //2. Floating/Decimal Type:

      float ft=23.788590f;   // range: 6-7 digits (0.0f) (4 bytes) - o.of
      double dl= 648.86874624879385938527446; //range :max 15 digits  (8 bytes) - 0.0

    // 3. String
     
     char ch='a';  //range 2 bytes ( unicode char - english letters, digits, symbols, langauges, control charess, accested )
      ch++;  //b

      //4. Boolean
      boolean bl= true; // range: 1 byte 
      boolean fl= true;
    }
}