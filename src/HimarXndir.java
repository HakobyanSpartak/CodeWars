import java.util.Arrays;

/*
A city has N Tram stations numbered from 1 to N  that are connected to one another and form a circle. You are given an array ticket_cost  where ticket_cost[i]
is the cost of a ticket between the stops number i and (i + 1) % N. The Tram can travel in both directions i.e. clockwise and anti-clockwise.
Return the minimum cost to travel between the given start and finish station.

You are given an integer N where N represents the total number of the tram stations, an integer start which represents the start station, and an
integer finish which represents the finish station. You are given an array of positive integers  ticket_cost where ticket_cost[i] represents the
ticket cost between the station number i and (i + 1) % N.

Task
Determine the minimum cost to travel between the given start and finish station.

Example

Assumptions

N = 4
start = 1
finish = 4
ticket_cost = [1, 2, 2, 4 ]

path1 -> 1------1-----> 2 -------2------> 3 -------2------> 4 . => 1+2+2 => 5

path2 -> 1------4------>4 . => 4

Path2 will give the minimum cost. Therefore return 4.

 */


public class HimarXndir {

    public static long solve(int N, int start, int finish, int[] Ticket_cost) {
        long result = 0;
        int between = 0;
        int beyond = 0;
        int summ = 0;

        for (int i = 0; i < N; i++) {
            summ += Ticket_cost[i];
        }

        if (start == 1 && finish == N || start == N && finish == 1) {
            return Ticket_cost[N - 1];
        }
        if (start <= finish) {
            for (int i = start-1; i < finish - 1; i++) {
                between += Ticket_cost[i];
            }
        }
        else {
            for ( int i = start-1; i >= finish; i-- ) {
                between += Ticket_cost[i-1];
            }
        }
        if (start > finish) {
            beyond = summ - between;
        }

        if (between > beyond) {
            return between;
        }
        return between;

    }
}
