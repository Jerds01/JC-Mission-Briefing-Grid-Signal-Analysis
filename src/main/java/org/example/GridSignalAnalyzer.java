package org.example;

public class GridSignalAnalyzer {
    // Mission Data: The Scrambled Communications Grid
    static char[][] scrambledGrid = {
            {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
            {'A', 'L', 'P', 'H', 'A'},
            {'T', 'A', 'N', 'G', 'O', '7'},
            {'B', 'R', 'A', 'V', 'O'}
    };

    public GridSignalAnalyzer() {

    }

    public void analyzeWithForLoop(){
        for (int i=0;i<scrambledGrid.length;i++){
            for(int y=0;y<scrambledGrid[i].length;y++){
                char ch = scrambledGrid[i][y];
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }


    public void analyzeWithForEachLoop(){
        for(char[] ch: scrambledGrid){
            System.out.println("Processing Row with Hash:"+ ch.toString());
            for(char cx: ch){
                System.out.println("-> "+cx);
            }
            System.out.println();
        }
    }

    public void analyzeWithForHybridLoop(){
        for (char[] ch: scrambledGrid){
            for(int y=0;y<ch.length;y++){
                System.out.print(ch[y]+" ");
            }
            System.out.println();
        }
    }



}
