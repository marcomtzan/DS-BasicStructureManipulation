/**
 @author Marco Martinez
 @fileName Main.java
 @version 1.0
 @description Tests JList, ListEntry, Stack, Queue, PriorityQueue. @date 2/27/2018
 Program Change Log
 ==========================
 Name Date Description
 Marco 2/27 Create baseline for Main.
 */
package com.github.marcomtzan.basic_structure_manipulation;

import com.github.marcomtzan.basic_structure_manipulation.core.*;
import com.github.marcomtzan.basic_structure_manipulation.linear.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // TEST VARIABLES
            OutputStream file = new FileOutputStream("REPORT.txt");
            String contents = new String();
            byte buffer[] = new byte[4096];
            JList myList = new JList();
            StringDataItem firstS = new StringDataItem("first"); StringDataItem secondS = new StringDataItem("second"); StringDataItem thirdS = new StringDataItem("third"); StringDataItem fourthS = new StringDataItem("fourth"); ListEntry fifthLE = new ListEntry(new StringDataItem("fifth")); StringDataItem FIRSTBREAK = new StringDataItem("FIRSTBREAK"); StringDataItem MIDBREAK = new StringDataItem("MIDBREAK"); myList.add_fromTail(firstS);
            myList.add_fromTail(secondS);
            myList.add_fromTail(thirdS);
            myList.add_fromTail(fourthS);
            myList.add_fromTail(fifthLE);
            myList.add_fromHead(FIRSTBREAK);
            myList.add_fromMid(MIDBREAK);
            // TESTING CALLS
            contents += "\n";
            contents += "Original order for myList: \n";
            myList.Iterator_initialize();
            while (myList.Iterator_hasNext()) {
                contents += (myList.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myList.getCount() + "\n";
            JList newList1 = new JList(myList);
            contents += "\n";
            contents += "Copy Constructor: \n"; newList1.Iterator_initialize();
            while (newList1.Iterator_hasNext()) {
                contents += (newList1.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within newList1: " + newList1.getCount() + "\n";
            JList newList3 = new JList(myList.getStart().getData());
            contents += "\n";
            contents += "GenericItemType Constructor with data from head of myList: \n";
            newList3.Iterator_initialize();
            while (newList3.Iterator_hasNext()) {
                contents += (newList3.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within newList: " + newList3.getCount() + "\n";
            JList newList2 = new JList(myList.getStart());
            contents += "\n";
            contents += "List Entry Constructor with Head of myList: \n";
            newList2.Iterator_initialize();
            while (newList2.Iterator_hasNext()) {
                contents += (newList2.Iterator_iterate()).toString() + "\n";
            }

            contents += "Current number of elements within newList: " + newList2.getCount() + "\n";
            contents += "\n";
            contents += "Adding 'hello' as GIT to the head of myList: \n";
            myList.add_fromHead(new StringDataItem("hello"));
            myList.Iterator_initialize();
            while (myList.Iterator_hasNext()) {
                contents += (myList.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myList.getCount() + "\n";
            contents += "\n";
            contents += "Adding 'begin' as ListEntry to the head of myList: \n"; myList.add_fromHead(new ListEntry(new StringDataItem("begin"))); myList.Iterator_initialize();
            while (myList.Iterator_hasNext()) {
                contents += (myList.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myList.getCount() + "\n";
            contents += "\n";
            contents += "Adding 'midpoint' as GIT to the middle of myList: \n";
            myList.add_fromMid(new StringDataItem("midpoint"));
            myList.Iterator_initialize();
            while (myList.Iterator_hasNext()) {
                contents += (myList.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myList.getCount() + "\n";
            contents += "\n";
            contents += "Adding 'anothermid' as ListEntry to the middle of myList: \n"; myList.add_fromMid(new ListEntry(new StringDataItem("anothermid"))); myList.Iterator_initialize();
            while (myList.Iterator_hasNext()) {
                contents += (myList.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myList.getCount() + "\n";
            contents += "\n";
            contents += "Adding 'end' as GIT to the tail of myList: \n";
            myList.add_fromTail(new StringDataItem("end"));
            myList.Iterator_initialize();
            while (myList.Iterator_hasNext()) {
                contents += (myList.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myList.getCount() + "\n";
            contents += "\n";
            contents += "Adding 'anotherend' as GIT to the tail of myList: \n";
            myList.add_fromHead(new ListEntry(new StringDataItem("anotherend")));
            myList.Iterator_initialize();
            while (myList.Iterator_hasNext()) {
                contents += (myList.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myList.getCount() + "\n";
            contents += "\n";
            contents += "Delete FIRSTBREAK as GIT and MIDBREAK as ListEntry from myList: \n";
            myList.remove(new StringDataItem("FIRSTBREAK"));
            myList.remove(new ListEntry(new StringDataItem("MIDBREAK")));
            myList.Iterator_initialize();
            while (myList.Iterator_hasNext()) {
                contents += (myList.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myList.getCount() + "\n";
            contents += "\n";
            contents += "Ascending sorted order of myList: \n";

            myList.bubbleSort_ascending();
            myList.Iterator_initialize();
            while (myList.Iterator_hasNext()) {
                contents += (myList.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myList.getCount() + "\n";
            contents += "\n";
            contents += "Descending sorted order of myList: \n";
            myList.bubbleSort_descending();
            myList.Iterator_initialize();
            while (myList.Iterator_hasNext()) {
                contents += (myList.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myList.getCount() + "\n";
            contents += "\n";
            contents += "Reversing myList: \n"; myList.reverseList(); myList.Iterator_initialize(); while (myList.Iterator_hasNext()) {
                contents += (myList.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myList.getCount() + "\n";
            Stack myStack = new Stack(myList);
            contents += "\n";
            contents += "Converting myList to Stack \n";
            myStack.Iterator_initialize();
            while (myStack.Iterator_hasNext()) {
                contents += (myStack.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myStack.getCount() + "\n";
            contents += "\n";
            contents += "Pop stack \n";
            myStack.pop();
            myStack.Iterator_initialize();
            while (myStack.Iterator_hasNext()) {
                contents += (myStack.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myStack.getCount() + "\n";
            contents += "\n";
            contents += "Push 'push' as git into Stack \n";
            myStack.push(new StringDataItem("push"));
            myStack.Iterator_initialize();
            while (myStack.Iterator_hasNext()) {
                contents += (myStack.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myStack.getCount() + "\n";
            Queue myQueue = new Queue(myStack);
            contents += "\n";
            contents += "Converting myStack to myQueue: \n";
            myQueue.Iterator_initialize();
            while (myQueue.Iterator_hasNext()) {
                contents += (myQueue.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myQueue.getCount() + "\n";
            contents += "\n";
            contents += "Perform enQueue to add 'enqueue' as GIT to myQueue \n";
            myQueue.enQueue(new StringDataItem("enqueue"));
            myQueue.Iterator_initialize();
            while (myQueue.Iterator_hasNext()) {
                contents += (myQueue.Iterator_iterate()).toString() + "\n";
            }

            contents += "Current number of elements within myList: " + myQueue.getCount() + "\n";
            contents += "\n";
            contents += "Perform deQueue to remove from bottom of myQueue \n";
            myQueue.deQueue();
            myQueue.Iterator_initialize();
            while (myQueue.Iterator_hasNext()) {
                contents += (myQueue.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myQueue.getCount() + "\n";
            PriorityQueue myPrioQueue = new PriorityQueue(myQueue);
            contents += "\n";
            contents += "Converting myQueue to myPrioQueue: \n";
            myPrioQueue.Iterator_initialize();
            while (myPrioQueue.Iterator_hasNext()) {
                contents += (myPrioQueue.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myPrioQueue.getCount() + "\n";
            contents += "\n";
            contents += "Sort myPrioQueue in ascending order: \n"; myPrioQueue.SortAscending(); myPrioQueue.Iterator_initialize();
            while (myPrioQueue.Iterator_hasNext()) {
                contents += (myPrioQueue.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myPrioQueue.getCount() + "\n";
            contents += "\n";
            contents += "Sort myPrioQueue in descending order: \n";
            myPrioQueue.SortDescending();
            myPrioQueue.Iterator_initialize();
            while (myPrioQueue.Iterator_hasNext()) {
                contents += (myPrioQueue.Iterator_iterate()).toString() + "\n";
            }
            contents += "Current number of elements within myList: " + myPrioQueue.getCount() + "\n";
            contents += "\nChecking for OutOfMemory error...\n";
            StringDataItem testString = new StringDataItem("test");
            while (!myList.isFull()) {
                myList.add_fromTail(testString);
            }
            myList = null;
            contents += "OutOfMemory error successfully caught. Closing file...\n";
            buffer = contents.getBytes();
            file.write(buffer);
            file.close();
        } catch (IOException e ) { System.err.println("Error: " + e.getMessage()); }
    }
}