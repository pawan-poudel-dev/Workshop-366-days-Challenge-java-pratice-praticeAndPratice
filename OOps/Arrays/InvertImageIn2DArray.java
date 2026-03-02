public class InvertImageIn2DArray {

    // This is the main function. Program starts running from here.
    public static void main(String[] args) {

        // Height means number of rows (up-down)
        // Width means number of columns (left-right)
        int height = 480, width = 230;

        // Create a 2D array to store the image pixels
        // Each box stores one pixel value (0 to 255)
        int[][] image = new int[height][width];

        // -------------------------------
        // STEP 1: Put values in the image
        // -------------------------------
        // We go through each row and each column
        for (int y = 0; y < height; y++) {      // move down the rows
            for (int x = 0; x < width; x++) {   // move across the columns

                // Give each pixel a number
                // (y + x) makes different values
                // % 256 keeps the value between 0 and 255
                image[y][x] = (y + x) % 255;
            }
        }

        // -------------------------------
        // STEP 2: Invert the image
        // -------------------------------
        // Inverting means:
        // black becomes white, white becomes black
        for (int y = 0; y < height; y++) {      // go through rows again
            for (int x = 0; x < width; x++) {   // go through columns again

                // Change pixel value using inversion formula
                image[y][x] = 255 - image[y][x];
            }
        }

        // -------------------------------
        // STEP 3: Print the image values
        // -------------------------------
        // Print all pixel values row by row
        for (int y = 0; y < height; y++) {      // for each row
            for (int x = 0; x < width; x++) {   // for each column

                // Print one pixel value
                System.out.print(image[y][x] + " ");
            }

            // Move to the next line after one row is printed
            System.out.println();
        }
    }
}
