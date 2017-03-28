package zoo;

import cell.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/**
 * @file	zoo.h
 * @author	Harum Lokawati
 * @since	March 2017
 */

public class Zoo {
    public static final int DEFSIZE = 10;
    private Cell[] Cells;   ///< array of Cell*
    private Cage[] Cages;   ///< array of Cage*
    private int NCages;     ///< number of cage
    private int width;      ///< zoo width
    private int length;     ///< zoo length
   /**
    * default construstor
    * this will set width and legth to DEFSIZE and make new Cells and Cages
    */
    public Zoo()
    {
        this.width = DEFSIZE;
        this.length = DEFSIZE;
        this.Cells = new Cell[width * length];
        this.NCages = 0;
        this.Cages = new Cage[DEFSIZE];
    }
    /**
     * @brief construstor with parameter
     * this will set width to w, legth to l and make new Cells and Cages
     * @param w
     * @param l
     */
    public Zoo(int w, int l)
    {
        this.width = w;
        this.length = l;
        this.Cells = new Cell[width * length];
        this.NCages = 0;
        this.Cages = new Cage[DEFSIZE];
    }
    /**
     * map reader and initialize
     * this will read txt file and initialize all its Cells
     * @param filename
     * @return Nothing.
     */
    public void ReadZoo(String filename) throws FileNotFoundException, IOException
    {
        int panjang;
        int i = 0;
        int j = 0;
        int templength = 0;
        RandomAccessFile raf = new RandomAccessFile("map.txt","r");
        raf.seek(0);
        panjang = (int) raf.length();
        raf.close();
        Cells = new Cell[panjang];
        File f = new File("map.txt");
        BufferedReader reader;
        reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(f),
                            Charset.forName("UTF-8")));
        try {
            int c;
            while((c = reader.read()) != -1) {
              char character = (char) c;
              if(c == '\n')
              {
                  i++;
                  if(i == 1)
                  {
                      templength = j;
                  }
              }else
              {
                  switch (c) {
                      case 'a':
                          Cells[j] = new AirHabitat();
                          break;
                      case 'w':
                          Cells[j] = new WaterHabitat();
                          break;
                      case 'l':
                          Cells[j] = new LandHabitat();
                          break;
                      case 'R':
                          Cells[j] = new Restaurant();
                          break;
                      case 'P':
                          Cells[j] = new Park();
                          break;
                      case 'E':
                          Cells[j] = new Entrance();
                          break;
                      case '@':
                          Cells[j] = new Exit();
                          break;
                      default:
                          Cells[j] = new Road();
                          break;
                  }
                  j++;
              }
            }
        }finally {
            if(reader != null)
            {
                reader.close();
            }
        }
        this.length = templength ;
        this.width = i;
        for(i = 0; i < j; i++)
        {
            Cells[i].SetXY(i % this.length, i / this.length);
        }
    }
    
    /**
     * @brief width getter
     * this will return width of the zoo
     * @return int
     */
    public int GetWidth()
    {
        return this.width;
    }
    /**
     * length getter, this will return length of the zoo
     * @return int
     */
    public int GetLength()
    {
        return this.length;
    }
    /**
     * Cells getter, this will return array of Cell[]
     * @return Cell[]
     */
    public Cell[] GetCells()
    {
        return this.Cells;
    }
    /**
     * @brief Cages getter
     * this will return array of Cage*
     * @return Cage[]
     */
    public Cage[] GetCages()
    {
        return this.Cages;
    }
    /**
     * Number of Cages getter
     * this will return NCages of the zoo
     * @return int
     */
    public int GetNCages()
    {
        return this.NCages;
    }
    /**
     * Cell getter, this will return Cell in location(x,y) in the zoo
     * @return Cell
     */
    public Cell AccessCell(int x,int y)
    {
        
    }
        /**
		 * @brief cage maker
		 * this will make cage from cells that has been inserted into zoo 
         * @return void
         */
    public void MakeCage()
    {
    }
        /**
		 * @brief Cage Index getter 
		 * this will return index of cage that contains location(x,y)
         * @param x 
         * @param y
         * @return int
         */
    public void ReadAnimal(String filename)
    {
    }
    public void AddAnimaltoZoo(Animal A)
    {
    }
    public int GetIndexCage(int x,int y)
    {
    }
    public void Print()
    {
        
    }

};