public class Recursividade4 {

    public static void achar(char s[]){
           for(int d1=0;d1<=0;d1++){
           for(int d2=0;d2<=0;d2++){
           for(int d3=0;d3<=0;d3++){
           for(int d4=0;d4<=0;d4++){
           for(int d5=0;d5<=0;d5++){
           if(s[0]==d1&&s[1]==d2&&s[2]==d3&&s[3]==d4&&s[4]==d5){
               System.out.println("A senha eh: "+d1+d2+d3+d4+d5);
           }
       }
       }
       }
       }
       }
    }
    
    public static void main(String[] args) {
       char[] senha = new char[5];
       senha[0]='5';
       senha[1]='7';
       senha[2]='4';
       senha[3]='1';
       senha[4]='3';
        
        Recursividade4.achar(senha);
    }
    
}
