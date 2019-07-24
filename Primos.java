/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.edd;

/**
 *
 * @author Jeany
 */
public class Primos {
    void AlCriba(int numero)
    {
        boolean numPrimos[] = new boolean[numero+1];
        
        for(int p = 0; p<numero; p++)
            numPrimos[p] = true;
        
        for(int i = 2; i*i <= numero; i++)
        {
            if(numPrimos[i]==true)
            {
                for(int j= i*2; j<= numero ; j+=i)
                {
                    numPrimos[j] = false;
                }
            }
        }
        
        for(int m = 2; m<=numero; m++)
        {
            if (numPrimos[m]==true)
                System.out.print(m+" ");
        }
    }
}
