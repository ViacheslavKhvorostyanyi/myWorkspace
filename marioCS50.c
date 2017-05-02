#include<stdio.h>
#include<cs50.h>

int  main (void)

{ 
    int height;// piramyde height
    do //enter value loop
    {
     printf("Enter height,please\n");//screen message
     height = GetInt();//enter value
    }
    while(!(height<24&height>=0)); //compare value, it must be in 0-23 diapasone
    
    for(int n=0;height>n;n++) //main loop
    {
      int width = height + 1;
        
      for(int k=0;width>k;k++)
        {
         if (k <= width-3-n) printf(" ");// printing spaces
         else printf("#");//printing hashes  
        }
     printf("\n");// new row
        
    }
}