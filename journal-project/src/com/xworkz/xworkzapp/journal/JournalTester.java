package com.xworkz.xworkzapp.journal;

public class JournalTester {
public static void main(String[] args) {
	Journal journal=new Journal();
	journal.setTopicName("environment");
	journal.setJournalId(1);
	System.out.println(journal);
	
	Journal journal1=new Journal();
	journal1.setTopicName("air pollution");
	journal1.setJournalId(2);
	System.out.println(journal1);
	
	Journal journal2=new Journal();
	journal2.setTopicName("water pollution");
	journal2.setJournalId(3);
	System.out.println(journal2);
	
	Journal journal3=new Journal();
	journal3.setTopicName("soil pollution");
	journal3.setJournalId(4);
	System.out.println(journal3);
	
	Journal journal4=new Journal();
	journal4.setTopicName("noise pollution");
	journal4.setJournalId(5);
	System.out.println(journal4);
	
	
	System.out.println(journal.hashCode());
	System.out.println(journal1.hashCode());
	System.out.println(journal2.hashCode());
	System.out.println(journal3.hashCode());
	System.out.println(journal4.hashCode());
	
	System.out.println(journal.equals(journal2));

}
}
