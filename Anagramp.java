import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagramp{
  public static int v;
  public static Scanner in;
 // public static HashEntry[][] table;
  public static String[] storetemp;
  public static  Vector<String>[][] vect;
  public static  Vector<String> vectorsort; 
/*	public class HashEntry

	{ 

	  private String sorted;
	  private  Vector<String> vec = new Vector<String>();
  }
  //  HashEntry(String sorted){
    //  this.sorted=sorted;
    //  this.v=v;
    //}
     public HashEntry function(String sorting,String s){
     HashEntry h=new HashEntry();
     h.sorted=sorting;
     h.vec.add(s);
    // vect[i][j].add(s);
     return h;
     }

    */
    
	public  void reading(){
    
        
         int c=0;
         // table= new HashEntry[9][37];
          String[] sarr=new String[v];
          storetemp=new String[v];
          vect = (Vector<String>[][])new Vector[11][37];
          vectorsort = new Vector<String>();

          int i,l;
           for(int x=0;x<37;x++){
                 for(int y=0;y<11;y++){
                  vect[y][x]=(Vector<String>)new Vector();
                 }
              }
          for(i=0;i<v;i++)
          {   
           // System.out.println("count"+i+" ");
              sarr[i]=in.nextLine();
              l=sarr[i].length();
              char[] chararray=new char[l];
              chararray=sarr[i].toCharArray();

              Arrays.sort(chararray);
              String temp=new String(chararray);
             // storetemp[i]=temp;
            // int index=vectorsort.contains(temp);
             if(vectorsort.contains(temp)==false){
              vectorsort.add(temp);
             }
             else{}
             
            if(l<=13){
              if(sarr[i].charAt(0)=='\''){
               //table[l][0]=function(temp,sarr[i]);
               // if(vect[l][0].isEmpty()==true){
                 // vect[l][0].add(temp);
                //}
                //else{}
               vect[l-3][0].add(sarr[i]);
              }
             else if(sarr[i].charAt(0)=='0'){
               //table[l][1]=function(temp,sarr[i]);
               vect[l-3][1].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='1'){
               //table[l][2]=function(temp,sarr[i]);
               vect[l-3][2].add(sarr[i]);
              }
               else if(sarr[i].charAt(0)=='2'){
               //table[l][3]=function(temp,sarr[i]);
               vect[l-3][3].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='3'){
                  //table[l][4]=function(temp,sarr[i]);
                  vect[l-3][4].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='4'){
                  //table[l][5]=function(temp,sarr[i]); 
                  vect[l-3][5].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='5'){
                  //table[l][6]=function(temp,sarr[i]);
                  vect[l-3][6].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='6'){
                    //table[l][7]=function(temp,sarr[i]);
                    vect[l-3][7].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='7'){
                    //table[l][8]=function(temp,sarr[i]);
                    vect[l-3][8].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='8'){
                    //table[l][9]=function(temp,sarr[i]);
                    vect[l-3][9].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='9'){
                  //table[l][10]=function(temp,sarr[i]);
                  vect[l-3][10].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='a'){
                //System.out.println("count"+c+" ");  
                 //c++;
               
                  //table[l][11]=function(temp,sarr[i]);
                  vect[l-3][11].add(sarr[i]);
                //  System.out.println("l"+l+""+);  
              }
              else if(sarr[i].charAt(0)=='b'){
               //   System.out.println("count"+c+" ");  
               //  c++;
                  //table[l][12]=function(temp,sarr[i]);
                  vect[l-3][12].add(sarr[i]);  
              }
              
              else if(sarr[i].charAt(0)=='c'){
                  //table[l][13]=function(temp,sarr[i]);  
                  vect[l-3][13].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='d'){
                  //table[l][14]=function(temp,sarr[i]); 
                  vect[l-3][14].add(sarr[i]); 
              }
              else if(sarr[i].charAt(0)=='e'){
                  //table[l][15]=function(temp,sarr[i]);
                  vect[l-3][15].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='f'){
                    //table[l][16]=function(temp,sarr[i]);
                    vect[l-3][16].add(sarr[i]);
                
              }
              else if(sarr[i].charAt(0)=='g'){
                    //table[l][17]=function(temp,sarr[i]);
                    vect[l-3][17].add(sarr[i]);
                
              }
              else if(sarr[i].charAt(0)=='h'){
                    //table[l][18]=function(temp,sarr[i]);
                    vect[l-3][18].add(sarr[i]);
                
              }
              else if(sarr[i].charAt(0)=='i'){
                  //table[l][19]=function(temp,sarr[i]);
                  vect[l-3][19].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='j'){
                    //table[l][20]=function(temp,sarr[i]);
                    vect[l-3][20].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='k'){
                    //table[l][21]=function(temp,sarr[i]);
                    vect[l-3][21].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='l'){
                    //table[l][22]=function(temp,sarr[i]);
                    vect[l-3][22].add(sarr[i]);
              
              }
              else if(sarr[i].charAt(0)=='m'){
                  //table[l][23]=function(temp,sarr[i]);
                  vect[l-3][23].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='n'){
                  //table[l][24]=function(temp,sarr[i]);
                  vect[l-3][24].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='o'){
                  //table[l][25]=function(temp,sarr[i]);
                  vect[l-3][25].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='p'){
                //table[l][26]=function(temp,sarr[i]);
                vect[l-3][26].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='q'){
                //table[l][27]=function(temp,sarr[i]);
                vect[l-3][27].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='r'){
                  //table[l][28]=function(temp,sarr[i]);
                  vect[l-3][28].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='s'){
                    //table[l][29]=function(temp,sarr[i]);
                    vect[l-3][29].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='t'){
                  //table[l][30]=function(temp,sarr[i]);  
                  vect[l-3][30].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='u'){
                    //table[l][31]=function(temp,sarr[i]);
                    vect[l-3][31].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='v'){
                  //table[l][32]=function(temp,sarr[i]);
                  vect[l-3][32].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='w'){
                    //table[l][33]=function(temp,sarr[i]);
                    vect[l-3][33].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='x'){
                  //table[l][34]=function(temp,sarr[i]);
                  vect[l-3][34].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='y'){
                  //table[l][35]=function(temp,sarr[i]);
                  vect[l-3][35].add(sarr[i]);
              }
              else if(sarr[i].charAt(0)=='z'){
                    //table[l][36]=function(temp,sarr[i]);
                    vect[l-3][36].add(sarr[i]);
              }
              
              else{}
            }
            }

        }
        public static void main(String[] args){
          

        try{
         
           FileInputStream fstream = new FileInputStream ("vocabulary.txt");
            in = new Scanner ( fstream ); 
        
          // in = new Scanner ( System.in );
           v=Integer.parseInt(in.nextLine());
           Anagramp a=new Anagramp();
           a.reading();
           int d=0;
           /*while(d<vectorsort.size()){
            System.out.println("vectorsort "+" "+vectorsort.get(d));
            d++;}
            */
          
                 
                 Iterator<String> itrsorted = vectorsort.iterator();
                  
                 while(itrsorted.hasNext())
                   {
                   int  c=1;
                   String sortedstrng=itrsorted.next();
                   int length=sortedstrng.length();
                   if(length<=13){
                   // System.out.println(length);
                   for(int i=0;i<37;i++){
                  //  System.out.println("stored");
                   Iterator<String> itr = vect[length-3][i].iterator();

                   
                   // Iterator<String> itr = vect[y][x].iterator();
                   if(vect[length-3][i].isEmpty()==false){
                   //  System.out.println("stored"+i);
                     String sprint1=vect[length-3][i].get(0);
                     int len1=sprint1.length();
                     char[] chararray12=new char[len1];
                     chararray12=sprint1.toCharArray();

                     Arrays.sort(chararray12);
                     String temp12=new String(chararray12);
                     if(sortedstrng.compareTo(temp12)==0)
                      {
                      //  System.out.println("stored"+sprint1);
                       c=0;

                      }
                   
                    while(itr.hasNext())
                     {
                  //  System.out.println("stored"+i);
                    String sprint=itr.next();
                     int len=sprint.length();
                     char[] chararray1=new char[len];
                     chararray1=sprint.toCharArray();

                     Arrays.sort(chararray1);
                     String temp1=new String(chararray1);
                     if(sortedstrng.compareTo(temp1)==0)
                      {
                        System.out.println(sprint);
                       c=0;

                      }

                     }
                   }

                 
                  }
                }
                 if(c==0||length>=14){
                       System.out.println(-1);
                     }
          
        
            }     
              
            
            
          /*  System.out.println(""+a.storetemp[0]);
              System.out.println(""+a.storetemp[1]);
           System.out.println(""+a.vect[4][0].get(0));
           System.out.println(""+a.vect[4][0].get(1));
        */
         } catch ( FileNotFoundException e) 
         {
           System.out.println(" File not found ");
         }   

        }
      }