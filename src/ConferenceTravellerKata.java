/*
Write a function conferencePicker that takes in two arguments:

1) citiesVisited, a list of cities that Lucy has visited before, given as an array of strings.
2) citiesOffered, a list of cities that will host SECSR conferences this year, given as an array of strings.
   citiesOffered will already be ordered in terms of the relevance of the conferences for Lucy's
   research (from the most to the least relevant).

The function should return the city that Lucy should visit, as a string.

Also note:

1) You should allow for the possibility that Lucy hasn't visited any city before.
2) SECSR organizes at least two conferences each year.
3) If all of the offered conferences are hosted in cities that Lucy has visited before, the function should return 'No worthwhile conferences this year!' (Nothing in Haskell)

Example:

citiesVisited = ['Mexico City','Johannesburg','Stockholm','Osaka','Saint Petersburg','London'];
citiesOffered = ['Stockholm','Paris','Melbourne'];

conferencePicker (citiesVisited, citiesOffered);
// ---> 'Paris'
 */
public class ConferenceTravellerKata {
    static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
        for ( int i = 0; i < citiesOffered.length; i++ ) {
            boolean flag = true;
            for ( int j = 0; j < citiesVisited.length; j++ ) {
                if ( citiesOffered[i].equals(citiesVisited[j]) ) {
                    flag = false;
                }
            }
            if ( flag ) {
                return citiesOffered[i];
            }

        }
        return "No worthwhile conferences this year!";
    }
}
