#include <stdio.h>
#include <cs50.h>
#include <math.h>

#define QUARTER 25;
#define DIME 10;
#define NICKEL 5;

int main(void) 
{
    // Variables
    float given = 0;
    int cent = 0;
    int quarter = 0;
    int dime = 0;
    int nickel = 0;
    int leftover = 0;
    int coins = 0;
    
    //Input 
    do 
    {
        printf("Give me some bucks,man : ");
        given = GetFloat();
        //if value not correct
        if(given == 0||given <= 0)
        printf("More...more then zero\n:");
    }
    while(given <= 0);
 
    //Convertation
    //  Cents
    cent = (int)round(given*100);

    // Quarters
    quarter = cent / QUARTER;
    leftover = cent % QUARTER;
    
    // Dimes
    dime = leftover / DIME;
    leftover = leftover % DIME;
    
    // Nickels
    nickel = leftover / NICKEL;
    leftover = leftover % NICKEL;
    
    // Leftover 
    coins = quarter + dime + nickel + leftover;
    
   
   //  printf("You get %d coins: %d quarters, %d dimes, %d nickels and %d pennies.\n", coins, quarter, dime, nickel, leftover);
    
    //Output:
    printf("%d\n", coins);
    
    return 0;
}