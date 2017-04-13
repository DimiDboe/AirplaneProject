/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineseating;

/**
 *
 * @author Alec.Ramos001
 */
public class PlaneClass 
{
    private int ROW = 0;
    private int COL = 0;
    private final String name;
    private final String[][] seats;

    public PlaneClass(String name, int ROW, int COL) {
        this.ROW = ROW;
        this.COL = COL;
        this.name = name;
        seats = new String[ROW][COL];
        for(int r = 0; r < ROW; r++)
        {
            for(int c = 0; c < COL; c++)
            {
               seats[r][c] = " ";
            }
        }
    }
    
    public void viewSeats()
    {
        System.out.println(name);
        for(int r = 0; r < ROW; r++)
        {
            for(int c = 0; c < COL; c++)
            {
                System.out.print("[" + seats[r][c] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void claim(int row, int col)
    {
        seats[row][col] = "X";
    }
    
}
