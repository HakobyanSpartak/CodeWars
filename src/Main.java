import jdk.management.jfr.FlightRecorderMXBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

/*
        //String[] d = new String[]{"Mexico City", "Johannesburg", "Stockholm", "Osaka", "Saint Petersburg", "London"};
        //String[] b = new String[]{"Stockholm", "Paris", "Melbourne"};
        //System.out.println(ConferenceTravellerKata.conferencePicker(d, b));
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Hakob");
        stringLinkedList.add("Suren");
        stringLinkedList.add("Garik");
        stringLinkedList.add("Arman");

        System.out.println("List is = " + stringLinkedList);

        stringLinkedList.addFirst("Aro");

        System.out.println("List is = " + stringLinkedList);

        stringLinkedList.addLast("Fifi");
        System.out.println("List is = " + stringLinkedList);


        System.out.println("List is = " + stringLinkedList);

        String st = stringLinkedList.element();
        String stt = stringLinkedList.pop();


        System.out.println("List is = " + stringLinkedList);
        System.out.println(stt);
*/
        //                                                    1-2 2-3 3-4 4-5 5-6 6-7 7-8 8-9 9-10 10-1
        //System.out.println(solve(10,5,3,new int[]{4, 14, 10, 7,  3,  13, 5,  15, 13,  4}));
        System.out.println(HimarXndir.solve(4,1,3,new int[]{1,2, 3, 4}));

    }
/*
    public static long solve(int N, int start, int finish, int[] Ticket_cost){
        // Write your code here
        long result = 0;

        if ( start == 1 && finish == N || start == N && finish == 1) {
            return Ticket_cost[N-1];
        }

        if (start >= finish){
            if ((start - finish) <= ((N - start) + finish)){
                for ( int i = start-1; i >= finish; i-- ) {
                    result += Ticket_cost[i-1];
                }
            }
            else {
                for ( int i = 0; i < finish; i++ ) {
                    result += Ticket_cost[i-1];
                }
                for ( int i = start-1; i <= N-1; i++ ) {
                    result += Ticket_cost[i-1];
                }
            }
        }else {
            if (Math.abs(start - finish) <= ((N - start) + finish)){
                for ( int i = start; i <= finish-1; i++ ) {
                    result += Ticket_cost[i-1];
                }
            }
            else {
                for ( int i = ; i < finish; i++ ) {
                    result += Ticket_cost[i-1];
                }
                for ( int i = start-1; i <= N-1; i++ ) {
                    result += Ticket_cost[i-1];
                }
            }
        }

        return result;

    }


 */
//     0 1 2 3 4
    //[2,3,1,1,4]
    public static boolean jumpGame(int[] nums) {
        int ind = 0;
        //int temp;
        for ( int i = 0; i < nums.length; i++ ) {
            if ( i > ind ) {
                return false;
            }
            ind = Math.max(ind, i + nums[i]);
        }
        return true;
    }
/*
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();

        if (list1.next == null && list2.next == null ) {
            return new ListNode(){};
        }
        if ( list1.next == null && list2.next != null ) {
            return list2;
        }
        else if ( list1.next != null && list2.next == null ) {
            return list1;
        }
        while ( list1.next != null || list2.next != null ) {
            if ( list1.val <= list2.val ) {
                res.val = list1.val;
                //res =
            }
        }
        return new ListNode(){};
    }

 */

}