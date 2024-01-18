class Solution {
    public boolean isValidSudoku(char[][] board) {
        /*
        - check row duplicates
        - check column duplicates
        - check cell duplicates


        For each row:
        - create a hashmap of values <value, 1>
        - for each element in row
            - if row element is non-empty,
                - check if value exists in hashmap
                - if it does exist, return false

        For each column: 
        - create a hashmap of values <value, 1>
        - for each element in column
            - if column element is non-empty
                - if element exists in hashmap return false
                - else, put element in hashmap


        Notice that board is hardcoded, so can hardcode which elements are 
"sub-boxes"
        - Create array of arrays x[]s, showing which x indecies are 
sub-boxes [[0,2], [3,5], [6,8]]
        - Create array of arrays y[]s, showing which y indecies are 
sub-boxes [[0,2], [3,5], [6,8]]

        For each sub-box
        - create a hashmap of <value, 0>
        - iterate over all elements in sub-box
            - if element is non-empty
                - if element is in hashmap, return false
                - else put element in hashmap

        return true;

        O(n), where n = size of the board        
         */

        int[] values = new int[9+1]; // keep track of values in row

        for (char[] row: board) {
          
            values = new int[9+1]; // keep track of values in row
            for (char value: row) {
                if (value == '.') {
                    continue;
                }

                int n = value - '0';

               if (values[n] == 0) {
                   values[n] = 1;
               } else {
                   return false;
               }
            }
        }

        for (int x = 0; x < 9; x++) {
            values = new int[9+1]; // keep track of values in column
            // System.out.println(board[0][x]);

            for (int y = 0; y < 9; y++) {
                char value = board[y][x];

                if (value == '.') {
                    continue;
                }

                int n = value - '0';

               if (values[n] == 0) {
                   values[n] = 1;
               } else {
                   return false;
               }
            }
        }

        int[][] boxIndexes = {{0,2}, {3,5}, {6,8}};

        int i = 0;
        for (int[] xs: boxIndexes) {
            for (int[] ys: boxIndexes) {
                // System.out.println("box " + i++);

                int minX = xs[0], maxX = xs[1];
                int minY = ys[0], maxY = ys[1];
                values = new int[9+1]; // keep track of values in column
                
               
                // absolutely cursed
                for (int x = minX; x <= maxX; x++) {
                    // System.out.println(board[0][x]);
                    for (int y = minY; y <= maxY; y++) {
                        char value = board[y][x];
                        // System.out.println(value);

                        if (value == '.') {
                            continue;
                        }

                        int n = value - '0';

                        if (values[n] == 0) {
                            values[n] = 1;
                        } else {
                            return false;
                        }
                    }
                }

                // for (int num: values) {
                //     System.out.println(num);
                // }
            }
        }

                
        return true;
    }
}
