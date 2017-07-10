/*
Exercice 3
Indiquez les résultats fournis par le code suivant :
*/

public class NFA031_recap3
{public static void main (String[]arg)
  {int a=3;
   boolean b=true;
   String s="azer";
   int c ;
   boolean d;
   String g;
 
   c=calculeInt(a,2);
   b=calculeBoolean(s,b);
   g=calculeString(s,c);
   System.out.println("c vaut : "+c);
   System.out.println("b vaut : "+b);
   System.out.println("g vaut : "+g);
  }
      static int calculeInt (int x , int y)
     {int k=0;
 
      for(int j=0;j<x;j++) {k=k+y;}      
      return k;
     }
 
   
   static boolean calculeBoolean (String w , boolean p)
     {boolean r;
      r=(w.length()>7)&&(p);
      return r;
     }
 
   static String calculeString (String w , int n)
     {String m="ty";
      String t="uiop";
 
      if(n<20) m=w+m;
        else m=w+m+t;
 
      return m;
      } 
} 
