package Items;

import java.awt.Color;
import javax.swing.JLabel;

/**
 * " Cell " is a class to represent CPU job graphically on the screen
 *  and some markers (black mark represented every 10 jobs).
 */
public class Cell extends JLabel{
    
    /**
     * Create a cell with a specific location, size and number
     * @param x x-coordinate location of the Cell
     * @param y y-coordinate location of the Cell
     * @param width width of the Cell
     * @param height height of the Cell
     * @param jobNumber number on the Cell
     */
    private Cell(int x , int y , int width , int height , int jobNumber)
    {
        setSize(width , height);
        chooseColor(jobNumber);
        setLocation(x, y);
        setOpaque(true);
    }
    
    /**
     * Create and return a job on Gantt Chart at a specific location 
     * with a specific job number 
     * @param x x-coordinate location of the Cell
     * @param y y-coordinate location of the Cell
     * @param jobNumber number on the Cell
     * @return 
     */
    public static Cell createGanttCell(int x , int y , int jobNumber) 
    {
        return new Cell(x, y,5, 50, jobNumber);
    }
    
    /**
     * Create a white small square to represent an empty job
     * at a specific location for the Gantt Chart
     * @param x x-coordinate location of the Cell
     * @param y y-coordinate location of the Cell 
     */
    public static Cell createEmptyJobCell(int x , int y)
    {
        return new Cell(x,y,5,10,11);
    }
    
    /**
     * Create and return a job on Ready Queue at a specific location 
     * with a specific job number 
     * @param x x-coordinate location of the Cell
     * @param y y-coordinate location of the Cell
     * @param jobNumber number on the Cell
     * @return Cell
     */
    public static Cell createReadyQueueCell(int x , int y , int jobNumber)
    {
        return new Cell(x,y, 30 , 60 ,jobNumber);
    }
    
    /**
     * Create a black small mark at a specific location.
     * Used mainly to make a mark after every 10 jobs. 
     * @param x x-coordinate location of the Cell
     * @param y y-coordinate location of the Cell +70
     * @return Cell
     */
    public static Cell createMark(int x , int y)
    {
        return new Cell(x,y,1,10,12);
    }
    
    /**
     * used to select the color of the job based on
     * its number and also view job number.
     * note: case 9 means empty job which is represented
     * in small white square in Gantt Chart.
     * @param type  is the job number related to its color.
     */
    private void chooseColor(int type)
    {
        setForeground(Color.WHITE);   // view job number in white on the label
        setHorizontalAlignment(LEFT);  // view job number in the center of the label
        switch(type)
        {
            case 1: setBackground(new Color(0xdb353d)); break;
            case 2: setBackground(new Color(0xd83ce7)); break;
            case 3: setBackground(new Color(0xdb35c2));  break;
            case 4: setBackground(new Color(0x3935db)); break;
            case 5: setBackground(new Color(0x35a6db)); break;
            case 6: setBackground(new Color(0x35dbbe));  break;
            case 7: setBackground(new Color(0x35db39));  break;
            case 8: setBackground(new Color(0x8fdb35));  break;
            case 9: setBackground(new Color(0xdbd935)); break;
            case 10: setBackground(new Color(0xdb8735));break;
            case 11: setBackground(Color.WHITE);  break; // empty job 
            case 12: setBackground(Color.BLACK); break;// 10 jobs mark
            default:  
        }
    }       
}
