package Arrays;

public class LettersWithStars {

	 public static void main(String[] args) {
	        String[][] letter = new String[9][4];

	        for (int i = 0; i < letter.length; i++) {
	            for (int j = 0; j < letter[i].length; j++) {
	                if (i == 0 || i == 4  || i == 8) {
	                    letter[i][j] = " * ";
	                } else if (j == 0 || j == 3) {
	                    letter[i][j] = " * ";
	                } else {
	                    letter[i][j] = "   ";
	                }
	                if((i == 4 && j == 3)) letter[i][j] = "* ";
	            }
	        }

	        for (String[] row : letter){
	            for (String col : row){
	                System.out.print(col);
	            }
	            System.out.println();
	        }
	    }
	}