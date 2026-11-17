class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list= new ArrayList<>();

        int sRow = 0;
        int sCol = 0;
        int eRow = matrix.length-1;
        int eCol = matrix[0].length-1;

        while(sRow <= eRow && sCol <= eCol) {
            //top 
            for(int i = sCol; i<=eCol; i++ ) {
                list.add(matrix[sRow][i]);
            }

            //right 
            for(int i = sRow + 1; i<= eRow ; i++ ) {
                list.add(matrix[i][eCol]);
            }

            //bottom
            if(sRow< eRow)  {
                for(int i = eCol-1; i>=sCol; i-- ) {
                    list.add(matrix[eRow][i]);
            }
            }
            

            //left 
            if(sCol < eCol) {
                for(int i = eRow -1; i>sRow; i-- ) {
                    list.add(matrix[i][sCol]);
            }
            }
            
            sRow++;
            sCol++;
            eRow--;
            eCol--;
        }

        return list;
    }
}