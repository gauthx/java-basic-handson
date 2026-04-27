// StringUtils
class StringUtils{
   static boolean containsChar(String string, char target){
    for(int i=0 ; i < string.length(); i++){
      if(string.charAt(i) == target){
        return true;
      }
    }

    return false;
   }

   static String reverse(String string){
    String reversed = "";
    for(int i=string.length() - 1 ; i >= 0; i--){
      reversed = reversed + string.charAt(i);
    }

    return reversed;
   }

   static String replaceAll(String string, char target, char replacement){
    String replaced = "";
    for(int i=0 ; i < string.length(); i++){
      char resultChar = string.charAt(i) == target ? replacement : string.charAt(i);
      replaced += resultChar;
    }

    return replaced;

   }

}