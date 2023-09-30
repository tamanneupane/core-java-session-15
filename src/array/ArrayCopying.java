package array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayCopying {

    public static void main(String[] args) {

        Movie[] movies = new Movie[3];
        movies[0] = new Movie("ABC", 7.9f);
        movies[1]= new Movie("BCD", 8.9f);
        movies[2] = new Movie("EFG", 2.2f);

        System.out.println("Movies : " + Arrays.toString(movies));

        Movie[] tempMovie = movies;

        System.out.println("tempMovie : " + Arrays.toString(tempMovie));

        tempMovie[2] = new Movie("XYZ", 9.9f);

        System.out.println("Movie after temp is updated : " + Arrays.toString(movies));

        reverseArray(movies);

        System.out.println("Movie after reverse : " + Arrays.toString(movies));

    }

    public static void reverseArray(Movie[] integerArray){
        Arrays.sort(Arrays.copyOf(integerArray, integerArray.length), new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
//        Movie[] reversedArray = new Movie[integerArray.length];
//        //int reversedArray[integerArray.length];
//        int reversedArrayIndex = integerArray.length -1;
//
//        for (Movie j : integerArray) {
//            reversedArray[reversedArrayIndex] = j;
//            reversedArrayIndex--;
//        }
//
//        integerArray = reversedArray;
    }


}
